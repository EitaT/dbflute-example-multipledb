package com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.MbProductCQ;

/**
 * The nest select set-upper of PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class MbProductNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbProductCQ _query;
    public MbProductNss(MbProductCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MbProductCategoryNss withProductCategory() {
        _query.doNss(new MbProductCQ.NssCall() { public ConditionQuery qf() { return _query.queryProductCategory(); }});
        return new MbProductCategoryNss(_query.queryProductCategory());
    }
    /**
     * With nested relation columns to select clause. <br />
     * PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MbProductStatusNss withProductStatus() {
        _query.doNss(new MbProductCQ.NssCall() { public ConditionQuery qf() { return _query.queryProductStatus(); }});
        return new MbProductStatusNss(_query.queryProductStatus());
    }

}
