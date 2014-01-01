package com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.MbPurchaseCQ;

/**
 * The nest select set-upper of PURCHASE.
 * @author DBFlute(AutoGenerator)
 */
public class MbPurchaseNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbPurchaseCQ _query;
    public MbPurchaseNss(MbPurchaseCQ query) { _query = query; }
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
        _query.doNss(new MbPurchaseCQ.NssCall() { public ConditionQuery qf() { return _query.queryMember(); }});
        return new MbMemberNss(_query.queryMember());
    }
    /**
     * With nested relation columns to select clause. <br />
     * PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MbProductNss withProduct() {
        _query.doNss(new MbPurchaseCQ.NssCall() { public ConditionQuery qf() { return _query.queryProduct(); }});
        return new MbProductNss(_query.queryProduct());
    }

}
