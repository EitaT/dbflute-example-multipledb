package com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.MbMemberLoginCQ;

/**
 * The nest select set-upper of MEMBER_LOGIN.
 * @author DBFlute(AutoGenerator)
 */
public class MbMemberLoginNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbMemberLoginCQ _query;
    public MbMemberLoginNss(MbMemberLoginCQ query) { _query = query; }
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
        _query.doNss(new MbMemberLoginCQ.NssCall() { public ConditionQuery qf() { return _query.queryMember(); }});
        return new MbMemberNss(_query.queryMember());
    }
    /**
     * With nested relation columns to select clause. <br />
     * MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MbMemberStatusNss withMemberStatus() {
        _query.doNss(new MbMemberLoginCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberStatus(); }});
        return new MbMemberStatusNss(_query.queryMemberStatus());
    }

}
