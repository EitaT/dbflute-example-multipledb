package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;

/**
 * The referrer loader of MEMBER_LOGIN as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_LOGIN_ID
 *
 * [column]
 *     MEMBER_LOGIN_ID, MEMBER_ID, LOGIN_DATETIME, MOBILE_LOGIN_FLG, LOGIN_MEMBER_STATUS_CODE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_LOGIN_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     MEMBER, MEMBER_STATUS
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, memberStatus
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class MbLoaderOfMemberLogin {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MbMemberLogin> _selectedList;
    protected BehaviorSelector _selector;
    protected MbMemberLoginBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public MbLoaderOfMemberLogin ready(List<MbMemberLogin> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MbMemberLoginBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MbMemberLoginBhv.class); return _myBhv; } }

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

    protected MbLoaderOfMemberStatus _foreignMemberStatusLoader;
    public MbLoaderOfMemberStatus pulloutMemberStatus() {
        if (_foreignMemberStatusLoader != null) { return _foreignMemberStatusLoader; }
        List<MbMemberStatus> pulledList = myBhv().pulloutMemberStatus(_selectedList);
        _foreignMemberStatusLoader = new MbLoaderOfMemberStatus().ready(pulledList, _selector);
        return _foreignMemberStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MbMemberLogin> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
