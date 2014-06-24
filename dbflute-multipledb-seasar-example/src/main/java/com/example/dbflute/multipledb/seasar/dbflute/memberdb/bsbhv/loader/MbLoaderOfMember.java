package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;

/**
 * The referrer loader of MEMBER as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER_STATUS, MEMBER_LOGIN(AsLatest), MEMBER_SECURITY(AsOne), MEMBER_SERVICE(AsOne), MEMBER_WITHDRAWAL(AsOne)
 *
 * [referrer table]
 *     MEMBER_ADDRESS, MEMBER_LOGIN, PURCHASE, MEMBER_SECURITY, MEMBER_SERVICE, MEMBER_WITHDRAWAL
 *
 * [foreign property]
 *     memberStatus, memberLoginAsLatest, memberSecurityAsOne, memberServiceAsOne, memberWithdrawalAsOne
 *
 * [referrer property]
 *     memberAddressList, memberLoginList, purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class MbLoaderOfMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MbMember> _selectedList;
    protected BehaviorSelector _selector;
    protected MbMemberBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public MbLoaderOfMember ready(List<MbMember> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MbMemberBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MbMemberBhv.class); return _myBhv; } }

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

    protected List<MbMemberLogin> _referrerMemberLoginList;
    public NestedReferrerLoaderGateway<MbLoaderOfMemberLogin> loadMemberLoginList(ConditionBeanSetupper<MbMemberLoginCB> setupper) {
        myBhv().loadMemberLoginList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<MbMemberLogin>() {
            public void handle(List<MbMemberLogin> referrerList) { _referrerMemberLoginList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<MbLoaderOfMemberLogin>() {
            public void withNestedReferrer(ReferrerLoaderHandler<MbLoaderOfMemberLogin> handler) {
                handler.handle(new MbLoaderOfMemberLogin().ready(_referrerMemberLoginList, _selector));
            }
        };
    }

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
    protected MbLoaderOfMemberStatus _foreignMemberStatusLoader;
    public MbLoaderOfMemberStatus pulloutMemberStatus() {
        if (_foreignMemberStatusLoader != null) { return _foreignMemberStatusLoader; }
        List<MbMemberStatus> pulledList = myBhv().pulloutMemberStatus(_selectedList);
        _foreignMemberStatusLoader = new MbLoaderOfMemberStatus().ready(pulledList, _selector);
        return _foreignMemberStatusLoader;
    }

    protected MbLoaderOfMemberLogin _foreignMemberLoginAsLatestLoader;
    public MbLoaderOfMemberLogin pulloutMemberLoginAsLatest() {
        if (_foreignMemberLoginAsLatestLoader != null) { return _foreignMemberLoginAsLatestLoader; }
        List<MbMemberLogin> pulledList = myBhv().pulloutMemberLoginAsLatest(_selectedList);
        _foreignMemberLoginAsLatestLoader = new MbLoaderOfMemberLogin().ready(pulledList, _selector);
        return _foreignMemberLoginAsLatestLoader;
    }

    protected MbLoaderOfMemberSecurity _foreignMemberSecurityAsOneLoader;
    public MbLoaderOfMemberSecurity pulloutMemberSecurityAsOne() {
        if (_foreignMemberSecurityAsOneLoader != null) { return _foreignMemberSecurityAsOneLoader; }
        List<MbMemberSecurity> pulledList = myBhv().pulloutMemberSecurityAsOne(_selectedList);
        _foreignMemberSecurityAsOneLoader = new MbLoaderOfMemberSecurity().ready(pulledList, _selector);
        return _foreignMemberSecurityAsOneLoader;
    }

    protected MbLoaderOfMemberService _foreignMemberServiceAsOneLoader;
    public MbLoaderOfMemberService pulloutMemberServiceAsOne() {
        if (_foreignMemberServiceAsOneLoader != null) { return _foreignMemberServiceAsOneLoader; }
        List<MbMemberService> pulledList = myBhv().pulloutMemberServiceAsOne(_selectedList);
        _foreignMemberServiceAsOneLoader = new MbLoaderOfMemberService().ready(pulledList, _selector);
        return _foreignMemberServiceAsOneLoader;
    }

    protected MbLoaderOfMemberWithdrawal _foreignMemberWithdrawalAsOneLoader;
    public MbLoaderOfMemberWithdrawal pulloutMemberWithdrawalAsOne() {
        if (_foreignMemberWithdrawalAsOneLoader != null) { return _foreignMemberWithdrawalAsOneLoader; }
        List<MbMemberWithdrawal> pulledList = myBhv().pulloutMemberWithdrawalAsOne(_selectedList);
        _foreignMemberWithdrawalAsOneLoader = new MbLoaderOfMemberWithdrawal().ready(pulledList, _selector);
        return _foreignMemberWithdrawalAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MbMember> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
