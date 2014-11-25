/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdDBMetaInstanceHandler;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;

/**
 * The entity of MYSELF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MYSELF_ID
 * 
 * [column]
 *     MYSELF_ID, MYSELF_NAME
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
 *     MYSELF_CHECK
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     myselfCheckList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer myselfId = entity.getMyselfId();
 * String myselfName = entity.getMyselfName();
 * entity.setMyselfId(myselfId);
 * entity.setMyselfName(myselfName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsMyself extends AbstractEntity implements DomainEntity {

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
    /** MYSELF_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _myselfId;

    /** MYSELF_NAME: {NotNull, VARCHAR(80)} */
    protected String _myselfName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "MYSELF";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "myself";
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
        if (getMyselfId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** MYSELF_CHECK by MYSELF_ID, named 'myselfCheckList'. */
    protected List<LdMyselfCheck> _myselfCheckList;

    /**
     * [get] MYSELF_CHECK by MYSELF_ID, named 'myselfCheckList'.
     * @return The entity list of referrer property 'myselfCheckList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LdMyselfCheck> getMyselfCheckList() {
        if (_myselfCheckList == null) { _myselfCheckList = newReferrerList(); }
        return _myselfCheckList;
    }

    /**
     * [set] MYSELF_CHECK by MYSELF_ID, named 'myselfCheckList'.
     * @param myselfCheckList The entity list of referrer property 'myselfCheckList'. (NullAllowed)
     */
    public void setMyselfCheckList(List<LdMyselfCheck> myselfCheckList) {
        _myselfCheckList = myselfCheckList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof LdBsMyself) {
            LdBsMyself other = (LdBsMyself)obj;
            if (!xSV(_myselfId, other._myselfId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _myselfId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_myselfCheckList != null) { for (LdMyselfCheck et : _myselfCheckList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "myselfCheckList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_myselfId));
        sb.append(dm).append(xfND(_myselfName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_myselfCheckList != null && !_myselfCheckList.isEmpty())
        { sb.append(dm).append("myselfCheckList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LdMyself clone() {
        return (LdMyself)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MYSELF_ID: {PK, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'MYSELF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMyselfId() {
        checkSpecifiedProperty("myselfId");
        return _myselfId;
    }

    /**
     * [set] MYSELF_ID: {PK, NotNull, INTEGER(10)} <br />
     * @param myselfId The value of the column 'MYSELF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMyselfId(Integer myselfId) {
        registerModifiedProperty("myselfId");
        _myselfId = myselfId;
    }

    /**
     * [get] MYSELF_NAME: {NotNull, VARCHAR(80)} <br />
     * @return The value of the column 'MYSELF_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMyselfName() {
        checkSpecifiedProperty("myselfName");
        return _myselfName;
    }

    /**
     * [set] MYSELF_NAME: {NotNull, VARCHAR(80)} <br />
     * @param myselfName The value of the column 'MYSELF_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMyselfName(String myselfName) {
        registerModifiedProperty("myselfName");
        _myselfName = myselfName;
    }
}
