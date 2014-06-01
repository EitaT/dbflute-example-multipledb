package com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.MbMemberServiceCQ;

/**
 * The nest select set-upper of MEMBER_SERVICE.
 * @author DBFlute(AutoGenerator)
 */
public class MbMemberServiceNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbMemberServiceCQ _query;
    public MbMemberServiceNss(MbMemberServiceCQ query) { _query = query; }
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
        _query.doNss(new MbMemberServiceCQ.NssCall() { public ConditionQuery qf() { return _query.queryMember(); }});
        return new MbMemberNss(_query.queryMember());
    }
    /**
     * With nested relation columns to select clause. <br />
     * SERVICE_RANK by my SERVICE_RANK_CODE, named 'serviceRank'.
     */
    public void withServiceRank() {
        _query.doNss(new MbMemberServiceCQ.NssCall() { public ConditionQuery qf() { return _query.queryServiceRank(); }});
    }
}
