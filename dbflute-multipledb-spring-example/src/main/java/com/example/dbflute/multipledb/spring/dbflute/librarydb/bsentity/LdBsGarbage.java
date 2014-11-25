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
 * The entity of GARBAGE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     GARBAGE_MEMO, GARBAGE_TIME, GARBAGE_COUNT, R_USER, R_TIMESTAMP, U_USER, U_TIMESTAMP
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
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String garbageMemo = entity.getGarbageMemo();
 * java.sql.Timestamp garbageTime = entity.getGarbageTime();
 * Integer garbageCount = entity.getGarbageCount();
 * String rUser = entity.getRUser();
 * java.sql.Timestamp rTimestamp = entity.getRTimestamp();
 * String uUser = entity.getUUser();
 * java.sql.Timestamp uTimestamp = entity.getUTimestamp();
 * entity.setGarbageMemo(garbageMemo);
 * entity.setGarbageTime(garbageTime);
 * entity.setGarbageCount(garbageCount);
 * entity.setRUser(rUser);
 * entity.setRTimestamp(rTimestamp);
 * entity.setUUser(uUser);
 * entity.setUTimestamp(uTimestamp);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsGarbage extends AbstractEntity implements DomainEntity {

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
    /** GARBAGE_MEMO: {VARCHAR(50)} */
    protected String _garbageMemo;

    /** GARBAGE_TIME: {TIMESTAMP(26, 6)} */
    protected java.sql.Timestamp _garbageTime;

    /** GARBAGE_COUNT: {INTEGER(10)} */
    protected Integer _garbageCount;

    /** R_USER: {VARCHAR(100)} */
    protected String _rUser;

    /** R_TIMESTAMP: {TIMESTAMP(26, 6)} */
    protected java.sql.Timestamp _rTimestamp;

    /** U_USER: {VARCHAR(100)} */
    protected String _uUser;

    /** U_TIMESTAMP: {TIMESTAMP(26, 6)} */
    protected java.sql.Timestamp _uTimestamp;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "GARBAGE";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "garbage";
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
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof LdBsGarbage) {
            LdBsGarbage other = (LdBsGarbage)obj;
            if (!xSV(_garbageMemo, other._garbageMemo)) { return false; }
            if (!xSV(_garbageTime, other._garbageTime)) { return false; }
            if (!xSV(_garbageCount, other._garbageCount)) { return false; }
            if (!xSV(_rUser, other._rUser)) { return false; }
            if (!xSV(_rTimestamp, other._rTimestamp)) { return false; }
            if (!xSV(_uUser, other._uUser)) { return false; }
            if (!xSV(_uTimestamp, other._uTimestamp)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _garbageMemo);
        hs = xCH(hs, _garbageTime);
        hs = xCH(hs, _garbageCount);
        hs = xCH(hs, _rUser);
        hs = xCH(hs, _rTimestamp);
        hs = xCH(hs, _uUser);
        hs = xCH(hs, _uTimestamp);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_garbageMemo));
        sb.append(dm).append(xfND(_garbageTime));
        sb.append(dm).append(xfND(_garbageCount));
        sb.append(dm).append(xfND(_rUser));
        sb.append(dm).append(xfND(_rTimestamp));
        sb.append(dm).append(xfND(_uUser));
        sb.append(dm).append(xfND(_uTimestamp));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public LdGarbage clone() {
        return (LdGarbage)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] GARBAGE_MEMO: {VARCHAR(50)} <br />
     * @return The value of the column 'GARBAGE_MEMO'. (NullAllowed even if selected: for no constraint)
     */
    public String getGarbageMemo() {
        checkSpecifiedProperty("garbageMemo");
        return _garbageMemo;
    }

    /**
     * [set] GARBAGE_MEMO: {VARCHAR(50)} <br />
     * @param garbageMemo The value of the column 'GARBAGE_MEMO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGarbageMemo(String garbageMemo) {
        registerModifiedProperty("garbageMemo");
        _garbageMemo = garbageMemo;
    }

    /**
     * [get] GARBAGE_TIME: {TIMESTAMP(26, 6)} <br />
     * @return The value of the column 'GARBAGE_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getGarbageTime() {
        checkSpecifiedProperty("garbageTime");
        return _garbageTime;
    }

    /**
     * [set] GARBAGE_TIME: {TIMESTAMP(26, 6)} <br />
     * @param garbageTime The value of the column 'GARBAGE_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGarbageTime(java.sql.Timestamp garbageTime) {
        registerModifiedProperty("garbageTime");
        _garbageTime = garbageTime;
    }

    /**
     * [get] GARBAGE_COUNT: {INTEGER(10)} <br />
     * @return The value of the column 'GARBAGE_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getGarbageCount() {
        checkSpecifiedProperty("garbageCount");
        return _garbageCount;
    }

    /**
     * [set] GARBAGE_COUNT: {INTEGER(10)} <br />
     * @param garbageCount The value of the column 'GARBAGE_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGarbageCount(Integer garbageCount) {
        registerModifiedProperty("garbageCount");
        _garbageCount = garbageCount;
    }

    /**
     * [get] R_USER: {VARCHAR(100)} <br />
     * @return The value of the column 'R_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getRUser() {
        checkSpecifiedProperty("RUser");
        return _rUser;
    }

    /**
     * [set] R_USER: {VARCHAR(100)} <br />
     * @param rUser The value of the column 'R_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRUser(String rUser) {
        registerModifiedProperty("RUser");
        _rUser = rUser;
    }

    /**
     * [get] R_TIMESTAMP: {TIMESTAMP(26, 6)} <br />
     * @return The value of the column 'R_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getRTimestamp() {
        checkSpecifiedProperty("RTimestamp");
        return _rTimestamp;
    }

    /**
     * [set] R_TIMESTAMP: {TIMESTAMP(26, 6)} <br />
     * @param rTimestamp The value of the column 'R_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRTimestamp(java.sql.Timestamp rTimestamp) {
        registerModifiedProperty("RTimestamp");
        _rTimestamp = rTimestamp;
    }

    /**
     * [get] U_USER: {VARCHAR(100)} <br />
     * @return The value of the column 'U_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUUser() {
        checkSpecifiedProperty("UUser");
        return _uUser;
    }

    /**
     * [set] U_USER: {VARCHAR(100)} <br />
     * @param uUser The value of the column 'U_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUUser(String uUser) {
        registerModifiedProperty("UUser");
        _uUser = uUser;
    }

    /**
     * [get] U_TIMESTAMP: {TIMESTAMP(26, 6)} <br />
     * @return The value of the column 'U_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUTimestamp() {
        checkSpecifiedProperty("UTimestamp");
        return _uTimestamp;
    }

    /**
     * [set] U_TIMESTAMP: {TIMESTAMP(26, 6)} <br />
     * @param uTimestamp The value of the column 'U_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUTimestamp(java.sql.Timestamp uTimestamp) {
        registerModifiedProperty("UTimestamp");
        _uTimestamp = uTimestamp;
    }
}
