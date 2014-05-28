/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
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
public abstract class LdBsMyselfCheck implements Entity, Serializable, Cloneable {

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
    /** MYSELF by my MYSELF_ID, named 'myself'. */
    protected LdMyself _myself;

    /**
     * MYSELF by my MYSELF_ID, named 'myself'.
     * @return The entity of foreign property 'myself'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdMyself getMyself() {
        return _myself;
    }

    /**
     * MYSELF by my MYSELF_ID, named 'myself'.
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
        if (obj == null || !(obj instanceof LdBsMyselfCheck)) { return false; }
        LdBsMyselfCheck other = (LdBsMyselfCheck)obj;
        if (!xSV(getMyselfCheckId(), other.getMyselfCheckId())) { return false; }
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
        hs = xCH(hs, getMyselfCheckId());
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
        if (_myself != null)
        { sb.append(li).append(xbRDS(_myself, "myself")); }
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
        sb.append(dm).append(getMyselfCheckId());
        sb.append(dm).append(getMyselfCheckName());
        sb.append(dm).append(getMyselfId());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_myself != null) { sb.append(cm).append("myself"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public LdMyselfCheck clone() {
        try {
            return (LdMyselfCheck)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'MYSELF_CHECK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMyselfCheckId() {
        return _myselfCheckId;
    }

    /**
     * [set] MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)} <br />
     * @param myselfCheckId The value of the column 'MYSELF_CHECK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMyselfCheckId(Integer myselfCheckId) {
        __modifiedProperties.addPropertyName("myselfCheckId");
        this._myselfCheckId = myselfCheckId;
    }

    /**
     * [get] MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} <br />
     * @return The value of the column 'MYSELF_CHECK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMyselfCheckName() {
        return _myselfCheckName;
    }

    /**
     * [set] MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} <br />
     * @param myselfCheckName The value of the column 'MYSELF_CHECK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMyselfCheckName(String myselfCheckName) {
        __modifiedProperties.addPropertyName("myselfCheckName");
        this._myselfCheckName = myselfCheckName;
    }

    /**
     * [get] MYSELF_ID: {IX, INTEGER(10), FK to MYSELF} <br />
     * @return The value of the column 'MYSELF_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMyselfId() {
        return _myselfId;
    }

    /**
     * [set] MYSELF_ID: {IX, INTEGER(10), FK to MYSELF} <br />
     * @param myselfId The value of the column 'MYSELF_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMyselfId(Integer myselfId) {
        __modifiedProperties.addPropertyName("myselfId");
        this._myselfId = myselfId;
    }
}
