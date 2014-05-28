/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdDBMetaInstanceHandler;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;

/**
 * The entity of VENDOR_CHECK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_CHAR, TYPE_OF_VARCHAR, TYPE_OF_LONG_VARCHAR, TYPE_OF_CLOB, TYPE_OF_DECIMAL_INTEGER, TYPE_OF_DECIMAL_BIGINT, TYPE_OF_DECIMAL_DECIMAL, TYPE_OF_BIGINT, TYPE_OF_INTEGER, TYPE_OF_DATE, TYPE_OF_TIMESTAMP, TYPE_OF_TIME
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
 * Long vendorCheckId = entity.getVendorCheckId();
 * String typeOfChar = entity.getTypeOfChar();
 * String typeOfVarchar = entity.getTypeOfVarchar();
 * String typeOfLongVarchar = entity.getTypeOfLongVarchar();
 * String typeOfClob = entity.getTypeOfClob();
 * java.math.BigDecimal typeOfDecimalInteger = entity.getTypeOfDecimalInteger();
 * java.math.BigDecimal typeOfDecimalBigint = entity.getTypeOfDecimalBigint();
 * java.math.BigDecimal typeOfDecimalDecimal = entity.getTypeOfDecimalDecimal();
 * Long typeOfBigint = entity.getTypeOfBigint();
 * Integer typeOfInteger = entity.getTypeOfInteger();
 * java.util.Date typeOfDate = entity.getTypeOfDate();
 * java.sql.Timestamp typeOfTimestamp = entity.getTypeOfTimestamp();
 * java.sql.Time typeOfTime = entity.getTypeOfTime();
 * entity.setVendorCheckId(vendorCheckId);
 * entity.setTypeOfChar(typeOfChar);
 * entity.setTypeOfVarchar(typeOfVarchar);
 * entity.setTypeOfLongVarchar(typeOfLongVarchar);
 * entity.setTypeOfClob(typeOfClob);
 * entity.setTypeOfDecimalInteger(typeOfDecimalInteger);
 * entity.setTypeOfDecimalBigint(typeOfDecimalBigint);
 * entity.setTypeOfDecimalDecimal(typeOfDecimalDecimal);
 * entity.setTypeOfBigint(typeOfBigint);
 * entity.setTypeOfInteger(typeOfInteger);
 * entity.setTypeOfDate(typeOfDate);
 * entity.setTypeOfTimestamp(typeOfTimestamp);
 * entity.setTypeOfTime(typeOfTime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsVendorCheck implements Entity, Serializable, Cloneable {

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
    /** VENDOR_CHECK_ID: {NotNull, BIGINT(19)} */
    protected Long _vendorCheckId;

    /** TYPE_OF_CHAR: {CHAR(3)} */
    protected String _typeOfChar;

    /** TYPE_OF_VARCHAR: {VARCHAR(32)} */
    protected String _typeOfVarchar;

    /** TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)} */
    protected String _typeOfLongVarchar;

    /** TYPE_OF_CLOB: {CLOB(2147483647)} */
    protected String _typeOfClob;

    /** TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)} */
    protected java.math.BigDecimal _typeOfDecimalInteger;

    /** TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)} */
    protected java.math.BigDecimal _typeOfDecimalBigint;

    /** TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)} */
    protected java.math.BigDecimal _typeOfDecimalDecimal;

    /** TYPE_OF_BIGINT: {BIGINT(19)} */
    protected Long _typeOfBigint;

    /** TYPE_OF_INTEGER: {INTEGER(10)} */
    protected Integer _typeOfInteger;

    /** TYPE_OF_DATE: {DATE(10)} */
    protected java.util.Date _typeOfDate;

    /** TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)} */
    protected java.sql.Timestamp _typeOfTimestamp;

    /** TYPE_OF_TIME: {TIME(8)} */
    protected java.sql.Time _typeOfTime;

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
        return "VENDOR_CHECK";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorCheck";
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
        if (obj == null || !(obj instanceof LdBsVendorCheck)) { return false; }
        LdBsVendorCheck other = (LdBsVendorCheck)obj;
        if (!xSV(getVendorCheckId(), other.getVendorCheckId())) { return false; }
        if (!xSV(getTypeOfChar(), other.getTypeOfChar())) { return false; }
        if (!xSV(getTypeOfVarchar(), other.getTypeOfVarchar())) { return false; }
        if (!xSV(getTypeOfLongVarchar(), other.getTypeOfLongVarchar())) { return false; }
        if (!xSV(getTypeOfClob(), other.getTypeOfClob())) { return false; }
        if (!xSV(getTypeOfDecimalInteger(), other.getTypeOfDecimalInteger())) { return false; }
        if (!xSV(getTypeOfDecimalBigint(), other.getTypeOfDecimalBigint())) { return false; }
        if (!xSV(getTypeOfDecimalDecimal(), other.getTypeOfDecimalDecimal())) { return false; }
        if (!xSV(getTypeOfBigint(), other.getTypeOfBigint())) { return false; }
        if (!xSV(getTypeOfInteger(), other.getTypeOfInteger())) { return false; }
        if (!xSV(getTypeOfDate(), other.getTypeOfDate())) { return false; }
        if (!xSV(getTypeOfTimestamp(), other.getTypeOfTimestamp())) { return false; }
        if (!xSV(getTypeOfTime(), other.getTypeOfTime())) { return false; }
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
        hs = xCH(hs, getVendorCheckId());
        hs = xCH(hs, getTypeOfChar());
        hs = xCH(hs, getTypeOfVarchar());
        hs = xCH(hs, getTypeOfLongVarchar());
        hs = xCH(hs, getTypeOfClob());
        hs = xCH(hs, getTypeOfDecimalInteger());
        hs = xCH(hs, getTypeOfDecimalBigint());
        hs = xCH(hs, getTypeOfDecimalDecimal());
        hs = xCH(hs, getTypeOfBigint());
        hs = xCH(hs, getTypeOfInteger());
        hs = xCH(hs, getTypeOfDate());
        hs = xCH(hs, getTypeOfTimestamp());
        hs = xCH(hs, getTypeOfTime());
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
        sb.append(dm).append(getVendorCheckId());
        sb.append(dm).append(getTypeOfChar());
        sb.append(dm).append(getTypeOfVarchar());
        sb.append(dm).append(getTypeOfLongVarchar());
        sb.append(dm).append(getTypeOfClob());
        sb.append(dm).append(getTypeOfDecimalInteger());
        sb.append(dm).append(getTypeOfDecimalBigint());
        sb.append(dm).append(getTypeOfDecimalDecimal());
        sb.append(dm).append(getTypeOfBigint());
        sb.append(dm).append(getTypeOfInteger());
        sb.append(dm).append(xfUD(getTypeOfDate()));
        sb.append(dm).append(getTypeOfTimestamp());
        sb.append(dm).append(getTypeOfTime());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfUD(Date date) { // formatUtilDate()
        return FunCustodial.toString(date, xgDP());
    }
    protected String xgDP() { // getDatePattern
        return "yyyy-MM-dd";
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public LdVendorCheck clone() {
        try {
            return (LdVendorCheck)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_CHECK_ID: {NotNull, BIGINT(19)} <br />
     * @return The value of the column 'VENDOR_CHECK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getVendorCheckId() {
        return _vendorCheckId;
    }

    /**
     * [set] VENDOR_CHECK_ID: {NotNull, BIGINT(19)} <br />
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        __modifiedProperties.addPropertyName("vendorCheckId");
        this._vendorCheckId = vendorCheckId;
    }

    /**
     * [get] TYPE_OF_CHAR: {CHAR(3)} <br />
     * @return The value of the column 'TYPE_OF_CHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfChar() {
        return _typeOfChar;
    }

    /**
     * [set] TYPE_OF_CHAR: {CHAR(3)} <br />
     * @param typeOfChar The value of the column 'TYPE_OF_CHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfChar(String typeOfChar) {
        __modifiedProperties.addPropertyName("typeOfChar");
        this._typeOfChar = typeOfChar;
    }

    /**
     * [get] TYPE_OF_VARCHAR: {VARCHAR(32)} <br />
     * @return The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfVarchar() {
        return _typeOfVarchar;
    }

    /**
     * [set] TYPE_OF_VARCHAR: {VARCHAR(32)} <br />
     * @param typeOfVarchar The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarchar(String typeOfVarchar) {
        __modifiedProperties.addPropertyName("typeOfVarchar");
        this._typeOfVarchar = typeOfVarchar;
    }

    /**
     * [get] TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)} <br />
     * @return The value of the column 'TYPE_OF_LONG_VARCHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfLongVarchar() {
        return _typeOfLongVarchar;
    }

    /**
     * [set] TYPE_OF_LONG_VARCHAR: {LONG VARCHAR(32700)} <br />
     * @param typeOfLongVarchar The value of the column 'TYPE_OF_LONG_VARCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfLongVarchar(String typeOfLongVarchar) {
        __modifiedProperties.addPropertyName("typeOfLongVarchar");
        this._typeOfLongVarchar = typeOfLongVarchar;
    }

    /**
     * [get] TYPE_OF_CLOB: {CLOB(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_CLOB'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfClob() {
        return _typeOfClob;
    }

    /**
     * [set] TYPE_OF_CLOB: {CLOB(2147483647)} <br />
     * @param typeOfClob The value of the column 'TYPE_OF_CLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfClob(String typeOfClob) {
        __modifiedProperties.addPropertyName("typeOfClob");
        this._typeOfClob = typeOfClob;
    }

    /**
     * [get] TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)} <br />
     * @return The value of the column 'TYPE_OF_DECIMAL_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfDecimalInteger() {
        return _typeOfDecimalInteger;
    }

    /**
     * [set] TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)} <br />
     * @param typeOfDecimalInteger The value of the column 'TYPE_OF_DECIMAL_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDecimalInteger(java.math.BigDecimal typeOfDecimalInteger) {
        __modifiedProperties.addPropertyName("typeOfDecimalInteger");
        this._typeOfDecimalInteger = typeOfDecimalInteger;
    }

    /**
     * [get] TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)} <br />
     * @return The value of the column 'TYPE_OF_DECIMAL_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfDecimalBigint() {
        return _typeOfDecimalBigint;
    }

    /**
     * [set] TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)} <br />
     * @param typeOfDecimalBigint The value of the column 'TYPE_OF_DECIMAL_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDecimalBigint(java.math.BigDecimal typeOfDecimalBigint) {
        __modifiedProperties.addPropertyName("typeOfDecimalBigint");
        this._typeOfDecimalBigint = typeOfDecimalBigint;
    }

    /**
     * [get] TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)} <br />
     * @return The value of the column 'TYPE_OF_DECIMAL_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfDecimalDecimal() {
        return _typeOfDecimalDecimal;
    }

    /**
     * [set] TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)} <br />
     * @param typeOfDecimalDecimal The value of the column 'TYPE_OF_DECIMAL_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDecimalDecimal(java.math.BigDecimal typeOfDecimalDecimal) {
        __modifiedProperties.addPropertyName("typeOfDecimalDecimal");
        this._typeOfDecimalDecimal = typeOfDecimalDecimal;
    }

    /**
     * [get] TYPE_OF_BIGINT: {BIGINT(19)} <br />
     * @return The value of the column 'TYPE_OF_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfBigint() {
        return _typeOfBigint;
    }

    /**
     * [set] TYPE_OF_BIGINT: {BIGINT(19)} <br />
     * @param typeOfBigint The value of the column 'TYPE_OF_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBigint(Long typeOfBigint) {
        __modifiedProperties.addPropertyName("typeOfBigint");
        this._typeOfBigint = typeOfBigint;
    }

    /**
     * [get] TYPE_OF_INTEGER: {INTEGER(10)} <br />
     * @return The value of the column 'TYPE_OF_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfInteger() {
        return _typeOfInteger;
    }

    /**
     * [set] TYPE_OF_INTEGER: {INTEGER(10)} <br />
     * @param typeOfInteger The value of the column 'TYPE_OF_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInteger(Integer typeOfInteger) {
        __modifiedProperties.addPropertyName("typeOfInteger");
        this._typeOfInteger = typeOfInteger;
    }

    /**
     * [get] TYPE_OF_DATE: {DATE(10)} <br />
     * @return The value of the column 'TYPE_OF_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getTypeOfDate() {
        return _typeOfDate;
    }

    /**
     * [set] TYPE_OF_DATE: {DATE(10)} <br />
     * @param typeOfDate The value of the column 'TYPE_OF_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDate(java.util.Date typeOfDate) {
        __modifiedProperties.addPropertyName("typeOfDate");
        this._typeOfDate = typeOfDate;
    }

    /**
     * [get] TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)} <br />
     * @return The value of the column 'TYPE_OF_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTypeOfTimestamp() {
        return _typeOfTimestamp;
    }

    /**
     * [set] TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)} <br />
     * @param typeOfTimestamp The value of the column 'TYPE_OF_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTimestamp(java.sql.Timestamp typeOfTimestamp) {
        __modifiedProperties.addPropertyName("typeOfTimestamp");
        this._typeOfTimestamp = typeOfTimestamp;
    }

    /**
     * [get] TYPE_OF_TIME: {TIME(8)} <br />
     * @return The value of the column 'TYPE_OF_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Time getTypeOfTime() {
        return _typeOfTime;
    }

    /**
     * [set] TYPE_OF_TIME: {TIME(8)} <br />
     * @param typeOfTime The value of the column 'TYPE_OF_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTime(java.sql.Time typeOfTime) {
        __modifiedProperties.addPropertyName("typeOfTime");
        this._typeOfTime = typeOfTime;
    }
}
