package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;

/**
 * The referrer loader of MEMBER_STATUS as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_STATUS_CODE
 *
 * [column]
 *     MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER, MEMBER_LOGIN
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberList, memberLoginList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class MbLoaderOfMemberStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MbMemberStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected MbMemberStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public MbLoaderOfMemberStatus ready(List<MbMemberStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MbMemberStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MbMemberStatusBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MbMember> _referrerMemberList;
    public NestedReferrerLoaderGateway<MbLoaderOfMember> loadMemberList(ConditionBeanSetupper<MbMemberCB> setupper) {
        myBhv().loadMemberList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<MbMember>() {
            public void handle(List<MbMember> referrerList) { _referrerMemberList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<MbLoaderOfMember>() {
            public void withNestedReferrer(ReferrerLoaderHandler<MbLoaderOfMember> handler) {
                handler.handle(new MbLoaderOfMember().ready(_referrerMemberList, _selector));
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

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MbMemberStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
