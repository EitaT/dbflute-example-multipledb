package com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.MbMemberCQ;

/**
 * The nest select set-upper of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public class MbMemberNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbMemberCQ _query;
    public MbMemberNss(MbMemberCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MbMemberStatusNss withMemberStatus() {
        _query.doNss(new MbMemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberStatus(); }});
        return new MbMemberStatusNss(_query.queryMemberStatus());
    }
    /**
     * With nested relation columns to select clause. <br />
     * MEMBER_LOGIN by my MEMBER_ID, named 'memberLoginAsLatest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MbMemberLoginNss withMemberLoginAsLatest() {
        _query.doNss(new MbMemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberLoginAsLatest(); }});
        return new MbMemberLoginNss(_query.queryMemberLoginAsLatest());
    }

    /**
     * With nested relation columns to select clause. <br />
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MbMemberSecurityNss withMemberSecurityAsOne() {
        _query.doNss(new MbMemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberSecurityAsOne(); }});
        return new MbMemberSecurityNss(_query.queryMemberSecurityAsOne());
    }
    /**
     * With nested relation columns to select clause. <br />
     * MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MbMemberServiceNss withMemberServiceAsOne() {
        _query.doNss(new MbMemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberServiceAsOne(); }});
        return new MbMemberServiceNss(_query.queryMemberServiceAsOne());
    }
    /**
     * With nested relation columns to select clause. <br />
     * MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MbMemberWithdrawalNss withMemberWithdrawalAsOne() {
        _query.doNss(new MbMemberCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberWithdrawalAsOne(); }});
        return new MbMemberWithdrawalNss(_query.queryMemberWithdrawalAsOne());
    }
}
