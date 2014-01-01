package com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.cq.MbProductCategoryCQ;

/**
 * The nest select set-upper of PRODUCT_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
public class MbProductCategoryNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MbProductCategoryCQ _query;
    public MbProductCategoryNss(MbProductCategoryCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MbProductCategoryNss withProductCategorySelf() {
        _query.doNss(new MbProductCategoryCQ.NssCall() { public ConditionQuery qf() { return _query.queryProductCategorySelf(); }});
        return new MbProductCategoryNss(_query.queryProductCategorySelf());
    }

}
