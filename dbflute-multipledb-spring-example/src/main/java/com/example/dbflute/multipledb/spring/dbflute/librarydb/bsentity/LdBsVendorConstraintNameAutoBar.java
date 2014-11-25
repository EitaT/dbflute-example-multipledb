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
 * The entity of VENDOR_CONSTRAINT_NAME_AUTO_BAR as TABLE. <br />
 * <pre>
 * [primary-key]
 *     CONSTRAINT_NAME_AUTO_BAR_ID
 * 
 * [column]
 *     CONSTRAINT_NAME_AUTO_BAR_ID, CONSTRAINT_NAME_AUTO_BAR_NAME
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
 *     VENDOR_CONSTRAINT_NAME_AUTO_REF
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     vendorConstraintNameAutoRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * java.math.BigDecimal constraintNameAutoBarId = entity.getConstraintNameAutoBarId();
 * String constraintNameAutoBarName = entity.getConstraintNameAutoBarName();
 * entity.setConstraintNameAutoBarId(constraintNameAutoBarId);
 * entity.setConstraintNameAutoBarName(constraintNameAutoBarName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsVendorConstraintNameAutoBar extends AbstractEntity implements DomainEntity {

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
    /** CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, NUMERIC(16)} */
    protected java.math.BigDecimal _constraintNameAutoBarId;

    /** CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)} */
    protected String _constraintNameAutoBarName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "VENDOR_CONSTRAINT_NAME_AUTO_BAR";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorConstraintNameAutoBar";
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
        if (getConstraintNameAutoBarId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param constraintNameAutoBarName : UQ, NotNull, VARCHAR(50). (NotNull)
     */
    public void uniqueBy(String constraintNameAutoBarName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("constraintNameAutoBarName");
        setConstraintNameAutoBarName(constraintNameAutoBarName);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoRefList'. */
    protected List<LdVendorConstraintNameAutoRef> _vendorConstraintNameAutoRefList;

    /**
     * [get] VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoRefList'.
     * @return The entity list of referrer property 'vendorConstraintNameAutoRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LdVendorConstraintNameAutoRef> getVendorConstraintNameAutoRefList() {
        if (_vendorConstraintNameAutoRefList == null) { _vendorConstraintNameAutoRefList = newReferrerList(); }
        return _vendorConstraintNameAutoRefList;
    }

    /**
     * [set] VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoRefList'.
     * @param vendorConstraintNameAutoRefList The entity list of referrer property 'vendorConstraintNameAutoRefList'. (NullAllowed)
     */
    public void setVendorConstraintNameAutoRefList(List<LdVendorConstraintNameAutoRef> vendorConstraintNameAutoRefList) {
        _vendorConstraintNameAutoRefList = vendorConstraintNameAutoRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof LdBsVendorConstraintNameAutoBar) {
            LdBsVendorConstraintNameAutoBar other = (LdBsVendorConstraintNameAutoBar)obj;
            if (!xSV(_constraintNameAutoBarId, other._constraintNameAutoBarId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _constraintNameAutoBarId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_vendorConstraintNameAutoRefList != null) { for (LdVendorConstraintNameAutoRef et : _vendorConstraintNameAutoRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendorConstraintNameAutoRefList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_constraintNameAutoBarId));
        sb.append(dm).append(xfND(_constraintNameAutoBarName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_vendorConstraintNameAutoRefList != null && !_vendorConstraintNameAutoRefList.isEmpty())
        { sb.append(dm).append("vendorConstraintNameAutoRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LdVendorConstraintNameAutoBar clone() {
        return (LdVendorConstraintNameAutoBar)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, NUMERIC(16)} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_BAR_ID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getConstraintNameAutoBarId() {
        checkSpecifiedProperty("constraintNameAutoBarId");
        return _constraintNameAutoBarId;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_BAR_ID: {PK, NotNull, NUMERIC(16)} <br />
     * @param constraintNameAutoBarId The value of the column 'CONSTRAINT_NAME_AUTO_BAR_ID'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoBarId(java.math.BigDecimal constraintNameAutoBarId) {
        registerModifiedProperty("constraintNameAutoBarId");
        _constraintNameAutoBarId = constraintNameAutoBarId;
    }

    /**
     * [get] CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_BAR_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getConstraintNameAutoBarName() {
        checkSpecifiedProperty("constraintNameAutoBarName");
        return _constraintNameAutoBarName;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_BAR_NAME: {UQ, NotNull, VARCHAR(50)} <br />
     * @param constraintNameAutoBarName The value of the column 'CONSTRAINT_NAME_AUTO_BAR_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoBarName(String constraintNameAutoBarName) {
        registerModifiedProperty("constraintNameAutoBarName");
        _constraintNameAutoBarName = constraintNameAutoBarName;
    }
}
