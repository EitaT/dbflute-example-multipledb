package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv.loader;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.*;

/**
 * The referrer loader of SERVICE_RANK as TABLE. <br />
 * <pre>
 * [primary key]
 *     SERVICE_RANK_CODE
 *
 * [column]
 *     SERVICE_RANK_CODE, SERVICE_RANK_NAME, SERVICE_POINT_INCIDENCE, NEW_ACCEPTABLE_FLG, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER_SERVICE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberServiceList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class MbLoaderOfServiceRank {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MbServiceRank> _selectedList;
    protected BehaviorSelector _selector;
    protected MbServiceRankBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public MbLoaderOfServiceRank ready(List<MbServiceRank> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MbServiceRankBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MbServiceRankBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MbMemberService> _referrerMemberServiceList;
    public NestedReferrerLoaderGateway<MbLoaderOfMemberService> loadMemberServiceList(ConditionBeanSetupper<MbMemberServiceCB> setupper) {
        myBhv().loadMemberServiceList(_selectedList, setupper).withNestedReferrer(new ReferrerListHandler<MbMemberService>() {
            public void handle(List<MbMemberService> referrerList) { _referrerMemberServiceList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<MbLoaderOfMemberService>() {
            public void withNestedReferrer(ReferrerLoaderHandler<MbLoaderOfMemberService> handler) {
                handler.handle(new MbLoaderOfMemberService().ready(_referrerMemberServiceList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MbServiceRank> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
