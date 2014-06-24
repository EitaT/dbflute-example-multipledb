package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;

/**
 * The referrer loader of MEMBER_SERVICE as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_SERVICE_ID
 *
 * [column]
 *     MEMBER_SERVICE_ID, MEMBER_ID, SERVICE_POINT_COUNT, SERVICE_RANK_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_SERVICE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, SERVICE_RANK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, serviceRank
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class MbLoaderOfMemberService {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MbMemberService> _selectedList;
    protected BehaviorSelector _selector;
    protected MbMemberServiceBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public MbLoaderOfMemberService ready(List<MbMemberService> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MbMemberServiceBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MbMemberServiceBhv.class); return _myBhv; } }

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

    protected MbLoaderOfServiceRank _foreignServiceRankLoader;
    public MbLoaderOfServiceRank pulloutServiceRank() {
        if (_foreignServiceRankLoader != null) { return _foreignServiceRankLoader; }
        List<MbServiceRank> pulledList = myBhv().pulloutServiceRank(_selectedList);
        _foreignServiceRankLoader = new MbLoaderOfServiceRank().ready(pulledList, _selector);
        return _foreignServiceRankLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MbMemberService> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
