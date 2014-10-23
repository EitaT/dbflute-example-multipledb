/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdDBMetaInstanceHandler;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;

/**
 * The entity of MYSELF_CHECK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MYSELF_CHECK_ID
 * 
 * [column]
 *     MYSELF_CHECK_ID, MYSELF_CHECK_NAME, MYSELF_ID
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
 *     MYSELF
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     myself
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer myselfCheckId = entity.getMyselfCheckId();
 * String myselfCheckName = entity.getMyselfCheckName();
 * Integer myselfId = entity.getMyselfId();
 * entity.setMyselfCheckId(myselfCheckId);
 * entity.setMyselfCheckName(myselfCheckName);
 * entity.setMyselfId(myselfId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsMyselfCheck extends AbstractEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _myselfCheckId;

    /** MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} */
    protected String _myselfCheckName;

    /** MYSELF_ID: {IX, INTEGER(10), FK to MYSELF} */
    protected Integer _myselfId;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "MYSELF_CHECK";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "myselfCheck";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return LdDBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getMyselfCheckId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** MYSELF by my MYSELF_ID, named 'myself'. */
    protected LdMyself _myself;

    /**
     * [get] MYSELF by my MYSELF_ID, named 'myself'.
     * @return The entity of foreign property 'myself'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdMyself getMyself() {
        return _myself;
    }

    /**
     * [set] MYSELF by my MYSELF_ID, named 'myself'.
     * @param myself The entity of foreign property 'myself'. (NullAllowed)
     */
    public void setMyself(LdMyself myself) {
        _myself = myself;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof LdBsMyselfCheck) {
            LdBsMyselfCheck other = (LdBsMyselfCheck)obj;
            if (!xSV(_myselfCheckId, other._myselfCheckId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _myselfCheckId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_myself != null)
        { sb.append(li).append(xbRDS(_myself, "myself")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_myselfCheckId));
        sb.append(dm).append(xfND(_myselfCheckName));
        sb.append(dm).append(xfND(_myselfId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_myself != null) { sb.append(dm).append("myself"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LdMyselfCheck clone() {
        return (LdMyselfCheck)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'MYSELF_CHECK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMyselfCheckId() {
        checkSpecifiedProperty("myselfCheckId");
        return _myselfCheckId;
    }

    /**
     * [set] MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)} <br />
     * @param myselfCheckId The value of the column 'MYSELF_CHECK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMyselfCheckId(Integer myselfCheckId) {
        __modifiedProperties.addPropertyName("myselfCheckId");
        _myselfCheckId = myselfCheckId;
    }

    /**
     * [get] MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} <br />
     * @return The value of the column 'MYSELF_CHECK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMyselfCheckName() {
        checkSpecifiedProperty("myselfCheckName");
        return _myselfCheckName;
    }

    /**
     * [set] MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} <br />
     * @param myselfCheckName The value of the column 'MYSELF_CHECK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMyselfCheckName(String myselfCheckName) {
        __modifiedProperties.addPropertyName("myselfCheckName");
        _myselfCheckName = myselfCheckName;
    }

    /**
     * [get] MYSELF_ID: {IX, INTEGER(10), FK to MYSELF} <br />
     * @return The value of the column 'MYSELF_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMyselfId() {
        checkSpecifiedProperty("myselfId");
        return _myselfId;
    }

    /**
     * [set] MYSELF_ID: {IX, INTEGER(10), FK to MYSELF} <br />
     * @param myselfId The value of the column 'MYSELF_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMyselfId(Integer myselfId) {
        __modifiedProperties.addPropertyName("myselfId");
        _myselfId = myselfId;
    }
}
