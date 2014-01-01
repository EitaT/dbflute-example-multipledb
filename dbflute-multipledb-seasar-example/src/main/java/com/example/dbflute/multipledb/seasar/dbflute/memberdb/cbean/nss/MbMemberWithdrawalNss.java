package com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.MbMemberWithdrawalCQ;

/**
 * The nest select set-upper of MEMBER_WITHDRAWAL.
 * @author DBFlute(AutoGenerator)
 */
public class MbMemberWithdrawalNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbMemberWithdrawalCQ _query;
    public MbMemberWithdrawalNss(MbMemberWithdrawalCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * MEMBER by my MEMBER_ID, named 'member'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MbMemberNss withMember() {
        _query.doNss(new MbMemberWithdrawalCQ.NssCall() { public ConditionQuery qf() { return _query.queryMember(); }});
        return new MbMemberNss(_query.queryMember());
    }
    /**
     * With nested relation columns to select clause. <br />
     * WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MbWithdrawalReasonNss withWithdrawalReason() {
        _query.doNss(new MbMemberWithdrawalCQ.NssCall() { public ConditionQuery qf() { return _query.queryWithdrawalReason(); }});
        return new MbWithdrawalReasonNss(_query.queryWithdrawalReason());
    }

}
