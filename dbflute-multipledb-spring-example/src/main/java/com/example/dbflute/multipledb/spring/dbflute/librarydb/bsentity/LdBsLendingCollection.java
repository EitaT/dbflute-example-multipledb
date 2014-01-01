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
 * The entity of LENDING_COLLECTION as TABLE. <br />
 * <pre>
 * [primary-key]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, COLLECTION_ID
 * 
 * [column]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, COLLECTION_ID, RETURN_LIMIT_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     COLLECTION, LENDING, LIBRARY_USER
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     collection, lending, libraryUser
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer libraryId = entity.getLibraryId();
 * Integer lbUserId = entity.getLbUserId();
 * java.sql.Timestamp lendingDate = entity.getLendingDate();
 * Integer collectionId = entity.getCollectionId();
 * java.sql.Timestamp returnLimitDate = entity.getReturnLimitDate();
 * String rUser = entity.getRUser();
 * String rModule = entity.getRModule();
 * java.sql.Timestamp rTimestamp = entity.getRTimestamp();
 * String uUser = entity.getUUser();
 * String uModule = entity.getUModule();
 * java.sql.Timestamp uTimestamp = entity.getUTimestamp();
 * entity.setLibraryId(libraryId);
 * entity.setLbUserId(lbUserId);
 * entity.setLendingDate(lendingDate);
 * entity.setCollectionId(collectionId);
 * entity.setReturnLimitDate(returnLimitDate);
 * entity.setRUser(rUser);
 * entity.setRModule(rModule);
 * entity.setRTimestamp(rTimestamp);
 * entity.setUUser(uUser);
 * entity.setUModule(uModule);
 * entity.setUTimestamp(uTimestamp);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLendingCollection implements Entity, Serializable, Cloneable {

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
    /** LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LENDING} */
    protected Integer _libraryId;

    /** LB_USER_ID: {PK, IX+, NotNull, INTEGER(10), FK to LENDING} */
    protected Integer _lbUserId;

    /** LENDING_DATE: {PK, IX+, NotNull, TIMESTAMP(26, 6), FK to LENDING} */
    protected java.sql.Timestamp _lendingDate;

    /** COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION} */
    protected Integer _collectionId;

    /** RETURN_LIMIT_DATE: {NotNull, TIMESTAMP(26, 6)} */
    protected java.sql.Timestamp _returnLimitDate;

    /** R_USER: {NotNull, VARCHAR(100), default=[default-user]} */
    protected String _rUser;

    /** R_MODULE: {NotNull, VARCHAR(100), default=[default-module]} */
    protected String _rModule;

    /** R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} */
    protected java.sql.Timestamp _rTimestamp;

    /** U_USER: {NotNull, VARCHAR(100), default=[default-user]} */
    protected String _uUser;

    /** U_MODULE: {NotNull, VARCHAR(100), default=[default-module]} */
    protected String _uModule;

    /** U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} */
    protected java.sql.Timestamp _uTimestamp;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
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
        return "LENDING_COLLECTION";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "lendingCollection";
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
        if (getLibraryId() == null) { return false; }
        if (getLbUserId() == null) { return false; }
        if (getLendingDate() == null) { return false; }
        if (getCollectionId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** COLLECTION by my COLLECTION_ID, named 'collection'. */
    protected LdCollection _collection;

    /**
     * COLLECTION by my COLLECTION_ID, named 'collection'.
     * @return The entity of foreign property 'collection'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdCollection getCollection() {
        return _collection;
    }

    /**
     * COLLECTION by my COLLECTION_ID, named 'collection'.
     * @param collection The entity of foreign property 'collection'. (NullAllowed)
     */
    public void setCollection(LdCollection collection) {
        _collection = collection;
    }

    /** LENDING by my LIBRARY_ID, LB_USER_ID, LENDING_DATE, named 'lending'. */
    protected LdLending _lending;

    /**
     * LENDING by my LIBRARY_ID, LB_USER_ID, LENDING_DATE, named 'lending'.
     * @return The entity of foreign property 'lending'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdLending getLending() {
        return _lending;
    }

    /**
     * LENDING by my LIBRARY_ID, LB_USER_ID, LENDING_DATE, named 'lending'.
     * @param lending The entity of foreign property 'lending'. (NullAllowed)
     */
    public void setLending(LdLending lending) {
        _lending = lending;
    }

    /** LIBRARY_USER by my LIBRARY_ID, LB_USER_ID, named 'libraryUser'. */
    protected LdLibraryUser _libraryUser;

    /**
     * LIBRARY_USER by my LIBRARY_ID, LB_USER_ID, named 'libraryUser'.
     * @return The entity of foreign property 'libraryUser'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdLibraryUser getLibraryUser() {
        return _libraryUser;
    }

    /**
     * LIBRARY_USER by my LIBRARY_ID, LB_USER_ID, named 'libraryUser'.
     * @param libraryUser The entity of foreign property 'libraryUser'. (NullAllowed)
     */
    public void setLibraryUser(LdLibraryUser libraryUser) {
        _libraryUser = libraryUser;
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
     * @param other The other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof LdBsLendingCollection)) { return false; }
        LdBsLendingCollection otherEntity = (LdBsLendingCollection)other;
        if (!xSV(getLibraryId(), otherEntity.getLibraryId())) { return false; }
        if (!xSV(getLbUserId(), otherEntity.getLbUserId())) { return false; }
        if (!xSV(getLendingDate(), otherEntity.getLendingDate())) { return false; }
        if (!xSV(getCollectionId(), otherEntity.getCollectionId())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getLibraryId());
        result = xCH(result, getLbUserId());
        result = xCH(result, getLendingDate());
        result = xCH(result, getCollectionId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
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
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String l = "\n  ";
        if (_collection != null)
        { sb.append(l).append(xbRDS(_collection, "collection")); }
        if (_lending != null)
        { sb.append(l).append(xbRDS(_lending, "lending")); }
        if (_libraryUser != null)
        { sb.append(l).append(xbRDS(_libraryUser, "libraryUser")); }
        return sb.toString();
    }
    protected String xbRDS(Entity e, String name) { // buildRelationDisplayString()
        return e.buildDisplayString(name, true, true);
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
        String delimiter = ", ";
        sb.append(delimiter).append(getLibraryId());
        sb.append(delimiter).append(getLbUserId());
        sb.append(delimiter).append(getLendingDate());
        sb.append(delimiter).append(getCollectionId());
        sb.append(delimiter).append(getReturnLimitDate());
        sb.append(delimiter).append(getRUser());
        sb.append(delimiter).append(getRModule());
        sb.append(delimiter).append(getRTimestamp());
        sb.append(delimiter).append(getUUser());
        sb.append(delimiter).append(getUModule());
        sb.append(delimiter).append(getUTimestamp());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_collection != null) { sb.append(c).append("collection"); }
        if (_lending != null) { sb.append(c).append("lending"); }
        if (_libraryUser != null) { sb.append(c).append("libraryUser"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public LdLendingCollection clone() {
        try {
            return (LdLendingCollection)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LENDING} <br />
     * @return The value of the column 'LIBRARY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLibraryId() {
        return _libraryId;
    }

    /**
     * [set] LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LENDING} <br />
     * @param libraryId The value of the column 'LIBRARY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLibraryId(Integer libraryId) {
        __modifiedProperties.addPropertyName("libraryId");
        this._libraryId = libraryId;
    }

    /**
     * [get] LB_USER_ID: {PK, IX+, NotNull, INTEGER(10), FK to LENDING} <br />
     * @return The value of the column 'LB_USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLbUserId() {
        return _lbUserId;
    }

    /**
     * [set] LB_USER_ID: {PK, IX+, NotNull, INTEGER(10), FK to LENDING} <br />
     * @param lbUserId The value of the column 'LB_USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLbUserId(Integer lbUserId) {
        __modifiedProperties.addPropertyName("lbUserId");
        this._lbUserId = lbUserId;
    }

    /**
     * [get] LENDING_DATE: {PK, IX+, NotNull, TIMESTAMP(26, 6), FK to LENDING} <br />
     * @return The value of the column 'LENDING_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getLendingDate() {
        return _lendingDate;
    }

    /**
     * [set] LENDING_DATE: {PK, IX+, NotNull, TIMESTAMP(26, 6), FK to LENDING} <br />
     * @param lendingDate The value of the column 'LENDING_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setLendingDate(java.sql.Timestamp lendingDate) {
        __modifiedProperties.addPropertyName("lendingDate");
        this._lendingDate = lendingDate;
    }

    /**
     * [get] COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION} <br />
     * @return The value of the column 'COLLECTION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCollectionId() {
        return _collectionId;
    }

    /**
     * [set] COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION} <br />
     * @param collectionId The value of the column 'COLLECTION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCollectionId(Integer collectionId) {
        __modifiedProperties.addPropertyName("collectionId");
        this._collectionId = collectionId;
    }

    /**
     * [get] RETURN_LIMIT_DATE: {NotNull, TIMESTAMP(26, 6)} <br />
     * @return The value of the column 'RETURN_LIMIT_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getReturnLimitDate() {
        return _returnLimitDate;
    }

    /**
     * [set] RETURN_LIMIT_DATE: {NotNull, TIMESTAMP(26, 6)} <br />
     * @param returnLimitDate The value of the column 'RETURN_LIMIT_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setReturnLimitDate(java.sql.Timestamp returnLimitDate) {
        __modifiedProperties.addPropertyName("returnLimitDate");
        this._returnLimitDate = returnLimitDate;
    }

    /**
     * [get] R_USER: {NotNull, VARCHAR(100), default=[default-user]} <br />
     * @return The value of the column 'R_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRUser() {
        return _rUser;
    }

    /**
     * [set] R_USER: {NotNull, VARCHAR(100), default=[default-user]} <br />
     * @param rUser The value of the column 'R_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRUser(String rUser) {
        __modifiedProperties.addPropertyName("RUser");
        this._rUser = rUser;
    }

    /**
     * [get] R_MODULE: {NotNull, VARCHAR(100), default=[default-module]} <br />
     * @return The value of the column 'R_MODULE'. (basically NotNull if selected: for the constraint)
     */
    public String getRModule() {
        return _rModule;
    }

    /**
     * [set] R_MODULE: {NotNull, VARCHAR(100), default=[default-module]} <br />
     * @param rModule The value of the column 'R_MODULE'. (basically NotNull if update: for the constraint)
     */
    public void setRModule(String rModule) {
        __modifiedProperties.addPropertyName("RModule");
        this._rModule = rModule;
    }

    /**
     * [get] R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} <br />
     * @return The value of the column 'R_TIMESTAMP'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getRTimestamp() {
        return _rTimestamp;
    }

    /**
     * [set] R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} <br />
     * @param rTimestamp The value of the column 'R_TIMESTAMP'. (basically NotNull if update: for the constraint)
     */
    public void setRTimestamp(java.sql.Timestamp rTimestamp) {
        __modifiedProperties.addPropertyName("RTimestamp");
        this._rTimestamp = rTimestamp;
    }

    /**
     * [get] U_USER: {NotNull, VARCHAR(100), default=[default-user]} <br />
     * @return The value of the column 'U_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUUser() {
        return _uUser;
    }

    /**
     * [set] U_USER: {NotNull, VARCHAR(100), default=[default-user]} <br />
     * @param uUser The value of the column 'U_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUUser(String uUser) {
        __modifiedProperties.addPropertyName("UUser");
        this._uUser = uUser;
    }

    /**
     * [get] U_MODULE: {NotNull, VARCHAR(100), default=[default-module]} <br />
     * @return The value of the column 'U_MODULE'. (basically NotNull if selected: for the constraint)
     */
    public String getUModule() {
        return _uModule;
    }

    /**
     * [set] U_MODULE: {NotNull, VARCHAR(100), default=[default-module]} <br />
     * @param uModule The value of the column 'U_MODULE'. (basically NotNull if update: for the constraint)
     */
    public void setUModule(String uModule) {
        __modifiedProperties.addPropertyName("UModule");
        this._uModule = uModule;
    }

    /**
     * [get] U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} <br />
     * @return The value of the column 'U_TIMESTAMP'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getUTimestamp() {
        return _uTimestamp;
    }

    /**
     * [set] U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} <br />
     * @param uTimestamp The value of the column 'U_TIMESTAMP'. (basically NotNull if update: for the constraint)
     */
    public void setUTimestamp(java.sql.Timestamp uTimestamp) {
        __modifiedProperties.addPropertyName("UTimestamp");
        this._uTimestamp = uTimestamp;
    }
}
