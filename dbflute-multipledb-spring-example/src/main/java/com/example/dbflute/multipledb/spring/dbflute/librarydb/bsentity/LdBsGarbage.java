/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
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
public abstract class LdBsGarbage implements Entity, Serializable, Cloneable {

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

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected final EntityUniqueDrivenProperties __uniqueDrivenProperties = newUniqueDrivenProperties();

    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

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

    /**
     * {@inheritDoc}
     */
    public Set<String> myuniqueDrivenProperties() {
        return __uniqueDrivenProperties.getPropertyNames();
    }

    protected EntityUniqueDrivenProperties newUniqueDrivenProperties() {
        return new EntityUniqueDrivenProperties();
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
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                     Birthplace Mark
    //                                                                     ===============
    /**
     * {@inheritDoc}
     */
    public void markAsSelect() {
        __createdBySelect = true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean createdBySelect() {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof LdBsGarbage)) { return false; }
        LdBsGarbage other = (LdBsGarbage)obj;
        if (!xSV(getGarbageMemo(), other.getGarbageMemo())) { return false; }
        if (!xSV(getGarbageTime(), other.getGarbageTime())) { return false; }
        if (!xSV(getGarbageCount(), other.getGarbageCount())) { return false; }
        if (!xSV(getRUser(), other.getRUser())) { return false; }
        if (!xSV(getRTimestamp(), other.getRTimestamp())) { return false; }
        if (!xSV(getUUser(), other.getUUser())) { return false; }
        if (!xSV(getUTimestamp(), other.getUTimestamp())) { return false; }
        return true;
    }
    protected boolean xSV(Object v1, Object v2) {
        return FunCustodial.isSameValue(v1, v2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int hs = 17;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getGarbageMemo());
        hs = xCH(hs, getGarbageTime());
        hs = xCH(hs, getGarbageCount());
        hs = xCH(hs, getRUser());
        hs = xCH(hs, getRTimestamp());
        hs = xCH(hs, getUUser());
        hs = xCH(hs, getUTimestamp());
        return hs;
    }
    protected int xCH(int hs, Object vl) {
        return FunCustodial.calculateHashcode(hs, vl);
    }

    /**
     * {@inheritDoc}
     */
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(FunCustodial.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String dm = ", ";
        sb.append(dm).append(getGarbageMemo());
        sb.append(dm).append(getGarbageTime());
        sb.append(dm).append(getGarbageCount());
        sb.append(dm).append(getRUser());
        sb.append(dm).append(getRTimestamp());
        sb.append(dm).append(getUUser());
        sb.append(dm).append(getUTimestamp());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public LdGarbage clone() {
        try {
            return (LdGarbage)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] GARBAGE_MEMO: {VARCHAR(50)} <br />
     * @return The value of the column 'GARBAGE_MEMO'. (NullAllowed even if selected: for no constraint)
     */
    public String getGarbageMemo() {
        return _garbageMemo;
    }

    /**
     * [set] GARBAGE_MEMO: {VARCHAR(50)} <br />
     * @param garbageMemo The value of the column 'GARBAGE_MEMO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGarbageMemo(String garbageMemo) {
        __modifiedProperties.addPropertyName("garbageMemo");
        _garbageMemo = garbageMemo;
    }

    /**
     * [get] GARBAGE_TIME: {TIMESTAMP(26, 6)} <br />
     * @return The value of the column 'GARBAGE_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getGarbageTime() {
        return _garbageTime;
    }

    /**
     * [set] GARBAGE_TIME: {TIMESTAMP(26, 6)} <br />
     * @param garbageTime The value of the column 'GARBAGE_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGarbageTime(java.sql.Timestamp garbageTime) {
        __modifiedProperties.addPropertyName("garbageTime");
        _garbageTime = garbageTime;
    }

    /**
     * [get] GARBAGE_COUNT: {INTEGER(10)} <br />
     * @return The value of the column 'GARBAGE_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getGarbageCount() {
        return _garbageCount;
    }

    /**
     * [set] GARBAGE_COUNT: {INTEGER(10)} <br />
     * @param garbageCount The value of the column 'GARBAGE_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGarbageCount(Integer garbageCount) {
        __modifiedProperties.addPropertyName("garbageCount");
        _garbageCount = garbageCount;
    }

    /**
     * [get] R_USER: {VARCHAR(100)} <br />
     * @return The value of the column 'R_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getRUser() {
        return _rUser;
    }

    /**
     * [set] R_USER: {VARCHAR(100)} <br />
     * @param rUser The value of the column 'R_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRUser(String rUser) {
        __modifiedProperties.addPropertyName("RUser");
        _rUser = rUser;
    }

    /**
     * [get] R_TIMESTAMP: {TIMESTAMP(26, 6)} <br />
     * @return The value of the column 'R_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getRTimestamp() {
        return _rTimestamp;
    }

    /**
     * [set] R_TIMESTAMP: {TIMESTAMP(26, 6)} <br />
     * @param rTimestamp The value of the column 'R_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRTimestamp(java.sql.Timestamp rTimestamp) {
        __modifiedProperties.addPropertyName("RTimestamp");
        _rTimestamp = rTimestamp;
    }

    /**
     * [get] U_USER: {VARCHAR(100)} <br />
     * @return The value of the column 'U_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUUser() {
        return _uUser;
    }

    /**
     * [set] U_USER: {VARCHAR(100)} <br />
     * @param uUser The value of the column 'U_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUUser(String uUser) {
        __modifiedProperties.addPropertyName("UUser");
        _uUser = uUser;
    }

    /**
     * [get] U_TIMESTAMP: {TIMESTAMP(26, 6)} <br />
     * @return The value of the column 'U_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUTimestamp() {
        return _uTimestamp;
    }

    /**
     * [set] U_TIMESTAMP: {TIMESTAMP(26, 6)} <br />
     * @param uTimestamp The value of the column 'U_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUTimestamp(java.sql.Timestamp uTimestamp) {
        __modifiedProperties.addPropertyName("UTimestamp");
        _uTimestamp = uTimestamp;
    }
}
