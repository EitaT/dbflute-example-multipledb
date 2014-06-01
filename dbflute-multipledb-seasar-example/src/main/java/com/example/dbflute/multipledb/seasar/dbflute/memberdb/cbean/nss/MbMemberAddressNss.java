package com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.MbMemberAddressCQ;

/**
 * The nest select set-upper of MEMBER_ADDRESS.
 * @author DBFlute(AutoGenerator)
 */
public class MbMemberAddressNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbMemberAddressCQ _query;
    public MbMemberAddressNss(MbMemberAddressCQ query) { _query = query; }
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
        _query.doNss(new MbMemberAddressCQ.NssCall() { public ConditionQuery qf() { return _query.queryMember(); }});
        return new MbMemberNss(_query.queryMember());
    }
    /**
     * With nested relation columns to select clause. <br />
     * REGION by my REGION_ID, named 'region'.
     */
    public void withRegion() {
        _query.doNss(new MbMemberAddressCQ.NssCall() { public ConditionQuery qf() { return _query.queryRegion(); }});
    }
}
