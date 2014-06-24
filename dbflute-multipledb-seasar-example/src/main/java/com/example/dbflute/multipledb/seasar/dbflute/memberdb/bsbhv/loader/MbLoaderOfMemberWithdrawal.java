package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;

/**
 * The referrer loader of MEMBER_WITHDRAWAL as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, WITHDRAWAL_REASON
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, withdrawalReason
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class MbLoaderOfMemberWithdrawal {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MbMemberWithdrawal> _selectedList;
    protected BehaviorSelector _selector;
    protected MbMemberWithdrawalBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public MbLoaderOfMemberWithdrawal ready(List<MbMemberWithdrawal> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MbMemberWithdrawalBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MbMemberWithdrawalBhv.class); return _myBhv; } }

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

    protected MbLoaderOfWithdrawalReason _foreignWithdrawalReasonLoader;
    public MbLoaderOfWithdrawalReason pulloutWithdrawalReason() {
        if (_foreignWithdrawalReasonLoader != null) { return _foreignWithdrawalReasonLoader; }
        List<MbWithdrawalReason> pulledList = myBhv().pulloutWithdrawalReason(_selectedList);
        _foreignWithdrawalReasonLoader = new MbLoaderOfWithdrawalReason().ready(pulledList, _selector);
        return _foreignWithdrawalReasonLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MbMemberWithdrawal> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
