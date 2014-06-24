package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;

/**
 * The referrer loader of WITHDRAWAL_REASON as TABLE. <br />
 * <pre>
 * [primary key]
 *     WITHDRAWAL_REASON_CODE
 *
 * [column]
 *     WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, DISPLAY_ORDER
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
 *     MEMBER_WITHDRAWAL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberWithdrawalList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class MbLoaderOfWithdrawalReason {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MbWithdrawalReason> _selectedList;
    protected BehaviorSelector _selector;
    protected MbWithdrawalReasonBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public MbLoaderOfWithdrawalReason ready(List<MbWithdrawalReason> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MbWithdrawalReasonBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MbWithdrawalReasonBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MbMemberWithdrawal> _referrerMemberWithdrawalList;
    public NestedReferrerLoaderGateway<MbLoaderOfMemberWithdrawal> loadMemberWithdrawalList(ConditionBeanSetupper<MbMemberWithdrawalCB> setupper) {
        myBhv().loadMemberWithdrawalList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<MbMemberWithdrawal>() {
            public void handle(List<MbMemberWithdrawal> referrerList) { _referrerMemberWithdrawalList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<MbLoaderOfMemberWithdrawal>() {
            public void withNestedReferrer(ReferrerLoaderHandler<MbLoaderOfMemberWithdrawal> handler) {
                handler.handle(new MbLoaderOfMemberWithdrawal().ready(_referrerMemberWithdrawalList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MbWithdrawalReason> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
