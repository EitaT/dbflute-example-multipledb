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
 * The entity of VENDOR_CONSTRAINT_NAME_AUTO_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     CONSTRAINT_NAME_AUTO_REF_ID
 * 
 * [column]
 *     CONSTRAINT_NAME_AUTO_REF_ID, CONSTRAINT_NAME_AUTO_FOO_ID, CONSTRAINT_NAME_AUTO_BAR_ID, CONSTRAINT_NAME_AUTO_QUX_ID, CONSTRAINT_NAME_AUTO_UNIQUE
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
 *     VENDOR_CONSTRAINT_NAME_AUTO_FOO, VENDOR_CONSTRAINT_NAME_AUTO_BAR, VENDOR_CONSTRAINT_NAME_AUTO_QUX
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     vendorConstraintNameAutoFoo, vendorConstraintNameAutoBar, vendorConstraintNameAutoQux
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * java.math.BigDecimal constraintNameAutoRefId = entity.getConstraintNameAutoRefId();
 * java.math.BigDecimal constraintNameAutoFooId = entity.getConstraintNameAutoFooId();
 * java.math.BigDecimal constraintNameAutoBarId = entity.getConstraintNameAutoBarId();
 * java.math.BigDecimal constraintNameAutoQuxId = entity.getConstraintNameAutoQuxId();
 * String constraintNameAutoUnique = entity.getConstraintNameAutoUnique();
 * entity.setConstraintNameAutoRefId(constraintNameAutoRefId);
 * entity.setConstraintNameAutoFooId(constraintNameAutoFooId);
 * entity.setConstraintNameAutoBarId(constraintNameAutoBarId);
 * entity.setConstraintNameAutoQuxId(constraintNameAutoQuxId);
 * entity.setConstraintNameAutoUnique(constraintNameAutoUnique);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsVendorConstraintNameAutoRef implements Entity, Serializable, Cloneable {

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
    /** CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)} */
    protected java.math.BigDecimal _constraintNameAutoRefId;

    /** CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_FOO} */
    protected java.math.BigDecimal _constraintNameAutoFooId;

    /** CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_BAR} */
    protected java.math.BigDecimal _constraintNameAutoBarId;

    /** CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_QUX} */
    protected java.math.BigDecimal _constraintNameAutoQuxId;

    /** CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)} */
    protected String _constraintNameAutoUnique;

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
        return "VENDOR_CONSTRAINT_NAME_AUTO_REF";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorConstraintNameAutoRef";
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
        if (getConstraintNameAutoRefId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param constraintNameAutoUnique : UQ, NotNull, VARCHAR(50). (NotNull)
     */
    public void uniqueBy(String constraintNameAutoUnique) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("constraintNameAutoUnique");
        setConstraintNameAutoUnique(constraintNameAutoUnique);
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
    /** VENDOR_CONSTRAINT_NAME_AUTO_FOO by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'. */
    protected LdVendorConstraintNameAutoFoo _vendorConstraintNameAutoFoo;

    /**
     * [get] VENDOR_CONSTRAINT_NAME_AUTO_FOO by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     * @return The entity of foreign property 'vendorConstraintNameAutoFoo'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdVendorConstraintNameAutoFoo getVendorConstraintNameAutoFoo() {
        return _vendorConstraintNameAutoFoo;
    }

    /**
     * [set] VENDOR_CONSTRAINT_NAME_AUTO_FOO by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     * @param vendorConstraintNameAutoFoo The entity of foreign property 'vendorConstraintNameAutoFoo'. (NullAllowed)
     */
    public void setVendorConstraintNameAutoFoo(LdVendorConstraintNameAutoFoo vendorConstraintNameAutoFoo) {
        _vendorConstraintNameAutoFoo = vendorConstraintNameAutoFoo;
    }

    /** VENDOR_CONSTRAINT_NAME_AUTO_BAR by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'. */
    protected LdVendorConstraintNameAutoBar _vendorConstraintNameAutoBar;

    /**
     * [get] VENDOR_CONSTRAINT_NAME_AUTO_BAR by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * @return The entity of foreign property 'vendorConstraintNameAutoBar'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdVendorConstraintNameAutoBar getVendorConstraintNameAutoBar() {
        return _vendorConstraintNameAutoBar;
    }

    /**
     * [set] VENDOR_CONSTRAINT_NAME_AUTO_BAR by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * @param vendorConstraintNameAutoBar The entity of foreign property 'vendorConstraintNameAutoBar'. (NullAllowed)
     */
    public void setVendorConstraintNameAutoBar(LdVendorConstraintNameAutoBar vendorConstraintNameAutoBar) {
        _vendorConstraintNameAutoBar = vendorConstraintNameAutoBar;
    }

    /** VENDOR_CONSTRAINT_NAME_AUTO_QUX by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'. */
    protected LdVendorConstraintNameAutoQux _vendorConstraintNameAutoQux;

    /**
     * [get] VENDOR_CONSTRAINT_NAME_AUTO_QUX by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * @return The entity of foreign property 'vendorConstraintNameAutoQux'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdVendorConstraintNameAutoQux getVendorConstraintNameAutoQux() {
        return _vendorConstraintNameAutoQux;
    }

    /**
     * [set] VENDOR_CONSTRAINT_NAME_AUTO_QUX by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * @param vendorConstraintNameAutoQux The entity of foreign property 'vendorConstraintNameAutoQux'. (NullAllowed)
     */
    public void setVendorConstraintNameAutoQux(LdVendorConstraintNameAutoQux vendorConstraintNameAutoQux) {
        _vendorConstraintNameAutoQux = vendorConstraintNameAutoQux;
    }

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
        if (obj == null || !(obj instanceof LdBsVendorConstraintNameAutoRef)) { return false; }
        LdBsVendorConstraintNameAutoRef other = (LdBsVendorConstraintNameAutoRef)obj;
        if (!xSV(getConstraintNameAutoRefId(), other.getConstraintNameAutoRefId())) { return false; }
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
        hs = xCH(hs, getConstraintNameAutoRefId());
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
        String li = "\n  ";
        if (_vendorConstraintNameAutoFoo != null)
        { sb.append(li).append(xbRDS(_vendorConstraintNameAutoFoo, "vendorConstraintNameAutoFoo")); }
        if (_vendorConstraintNameAutoBar != null)
        { sb.append(li).append(xbRDS(_vendorConstraintNameAutoBar, "vendorConstraintNameAutoBar")); }
        if (_vendorConstraintNameAutoQux != null)
        { sb.append(li).append(xbRDS(_vendorConstraintNameAutoQux, "vendorConstraintNameAutoQux")); }
        return sb.toString();
    }
    protected String xbRDS(Entity et, String name) { // buildRelationDisplayString()
        return et.buildDisplayString(name, true, true);
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
        sb.append(dm).append(getConstraintNameAutoRefId());
        sb.append(dm).append(getConstraintNameAutoFooId());
        sb.append(dm).append(getConstraintNameAutoBarId());
        sb.append(dm).append(getConstraintNameAutoQuxId());
        sb.append(dm).append(getConstraintNameAutoUnique());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_vendorConstraintNameAutoFoo != null) { sb.append(cm).append("vendorConstraintNameAutoFoo"); }
        if (_vendorConstraintNameAutoBar != null) { sb.append(cm).append("vendorConstraintNameAutoBar"); }
        if (_vendorConstraintNameAutoQux != null) { sb.append(cm).append("vendorConstraintNameAutoQux"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public LdVendorConstraintNameAutoRef clone() {
        try {
            return (LdVendorConstraintNameAutoRef)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getConstraintNameAutoRefId() {
        return _constraintNameAutoRefId;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)} <br />
     * @param constraintNameAutoRefId The value of the column 'CONSTRAINT_NAME_AUTO_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoRefId(java.math.BigDecimal constraintNameAutoRefId) {
        __modifiedProperties.addPropertyName("constraintNameAutoRefId");
        _constraintNameAutoRefId = constraintNameAutoRefId;
    }

    /**
     * [get] CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_FOO} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_FOO_ID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getConstraintNameAutoFooId() {
        return _constraintNameAutoFooId;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_FOO} <br />
     * @param constraintNameAutoFooId The value of the column 'CONSTRAINT_NAME_AUTO_FOO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoFooId(java.math.BigDecimal constraintNameAutoFooId) {
        __modifiedProperties.addPropertyName("constraintNameAutoFooId");
        _constraintNameAutoFooId = constraintNameAutoFooId;
    }

    /**
     * [get] CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_BAR} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_BAR_ID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getConstraintNameAutoBarId() {
        return _constraintNameAutoBarId;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_BAR} <br />
     * @param constraintNameAutoBarId The value of the column 'CONSTRAINT_NAME_AUTO_BAR_ID'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoBarId(java.math.BigDecimal constraintNameAutoBarId) {
        __modifiedProperties.addPropertyName("constraintNameAutoBarId");
        _constraintNameAutoBarId = constraintNameAutoBarId;
    }

    /**
     * [get] CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_QUX} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_QUX_ID'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getConstraintNameAutoQuxId() {
        return _constraintNameAutoQuxId;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_QUX} <br />
     * @param constraintNameAutoQuxId The value of the column 'CONSTRAINT_NAME_AUTO_QUX_ID'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoQuxId(java.math.BigDecimal constraintNameAutoQuxId) {
        __modifiedProperties.addPropertyName("constraintNameAutoQuxId");
        _constraintNameAutoQuxId = constraintNameAutoQuxId;
    }

    /**
     * [get] CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_UNIQUE'. (basically NotNull if selected: for the constraint)
     */
    public String getConstraintNameAutoUnique() {
        return _constraintNameAutoUnique;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)} <br />
     * @param constraintNameAutoUnique The value of the column 'CONSTRAINT_NAME_AUTO_UNIQUE'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoUnique(String constraintNameAutoUnique) {
        __modifiedProperties.addPropertyName("constraintNameAutoUnique");
        _constraintNameAutoUnique = constraintNameAutoUnique;
    }
}
