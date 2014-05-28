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
 * The entity of LIBRARY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     LIBRARY_ID
 * 
 * [column]
 *     LIBRARY_ID, LIBRARY_NAME, LIBRARY_TYPE_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     LIBRARY_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     LIBRARY_TYPE_LOOKUP
 * 
 * [referrer table]
 *     COLLECTION, LIBRARY_USER, NEXT_LIBRARY
 * 
 * [foreign property]
 *     libraryTypeLookup
 * 
 * [referrer property]
 *     collectionList, libraryUserList, nextLibraryByLibraryIdList, nextLibraryByNextLibraryIdList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer libraryId = entity.getLibraryId();
 * String libraryName = entity.getLibraryName();
 * String libraryTypeCode = entity.getLibraryTypeCode();
 * String rUser = entity.getRUser();
 * String rModule = entity.getRModule();
 * java.sql.Timestamp rTimestamp = entity.getRTimestamp();
 * String uUser = entity.getUUser();
 * String uModule = entity.getUModule();
 * java.sql.Timestamp uTimestamp = entity.getUTimestamp();
 * entity.setLibraryId(libraryId);
 * entity.setLibraryName(libraryName);
 * entity.setLibraryTypeCode(libraryTypeCode);
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
public abstract class LdBsLibrary implements Entity, Serializable, Cloneable {

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
    /** LIBRARY_ID: {PK, ID, NotNull, SMALLINT(5)} */
    protected Integer _libraryId;

    /** LIBRARY_NAME: {UQ, NotNull, VARCHAR(80)} */
    protected String _libraryName;

    /** LIBRARY_TYPE_CODE: {IX, NotNull, CHAR(3), FK to LIBRARY_TYPE_LOOKUP} */
    protected String _libraryTypeCode;

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
        return "LIBRARY";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "library";
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
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param libraryName : UQ, NotNull, VARCHAR(80). (NotNull)
     */
    public void uniqueBy(String libraryName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("libraryName");
        setLibraryName(libraryName);
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
    /** LIBRARY_TYPE_LOOKUP by my LIBRARY_TYPE_CODE, named 'libraryTypeLookup'. */
    protected LdLibraryTypeLookup _libraryTypeLookup;

    /**
     * LIBRARY_TYPE_LOOKUP by my LIBRARY_TYPE_CODE, named 'libraryTypeLookup'.
     * @return The entity of foreign property 'libraryTypeLookup'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdLibraryTypeLookup getLibraryTypeLookup() {
        return _libraryTypeLookup;
    }

    /**
     * LIBRARY_TYPE_LOOKUP by my LIBRARY_TYPE_CODE, named 'libraryTypeLookup'.
     * @param libraryTypeLookup The entity of foreign property 'libraryTypeLookup'. (NullAllowed)
     */
    public void setLibraryTypeLookup(LdLibraryTypeLookup libraryTypeLookup) {
        _libraryTypeLookup = libraryTypeLookup;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** COLLECTION by LIBRARY_ID, named 'collectionList'. */
    protected List<LdCollection> _collectionList;

    /**
     * COLLECTION by LIBRARY_ID, named 'collectionList'.
     * @return The entity list of referrer property 'collectionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LdCollection> getCollectionList() {
        if (_collectionList == null) { _collectionList = newReferrerList(); }
        return _collectionList;
    }

    /**
     * COLLECTION by LIBRARY_ID, named 'collectionList'.
     * @param collectionList The entity list of referrer property 'collectionList'. (NullAllowed)
     */
    public void setCollectionList(List<LdCollection> collectionList) {
        _collectionList = collectionList;
    }

    /** LIBRARY_USER by LIBRARY_ID, named 'libraryUserList'. */
    protected List<LdLibraryUser> _libraryUserList;

    /**
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserList'.
     * @return The entity list of referrer property 'libraryUserList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LdLibraryUser> getLibraryUserList() {
        if (_libraryUserList == null) { _libraryUserList = newReferrerList(); }
        return _libraryUserList;
    }

    /**
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserList'.
     * @param libraryUserList The entity list of referrer property 'libraryUserList'. (NullAllowed)
     */
    public void setLibraryUserList(List<LdLibraryUser> libraryUserList) {
        _libraryUserList = libraryUserList;
    }

    /** NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdList'. */
    protected List<LdNextLibrary> _nextLibraryByLibraryIdList;

    /**
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdList'.
     * @return The entity list of referrer property 'nextLibraryByLibraryIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LdNextLibrary> getNextLibraryByLibraryIdList() {
        if (_nextLibraryByLibraryIdList == null) { _nextLibraryByLibraryIdList = newReferrerList(); }
        return _nextLibraryByLibraryIdList;
    }

    /**
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdList'.
     * @param nextLibraryByLibraryIdList The entity list of referrer property 'nextLibraryByLibraryIdList'. (NullAllowed)
     */
    public void setNextLibraryByLibraryIdList(List<LdNextLibrary> nextLibraryByLibraryIdList) {
        _nextLibraryByLibraryIdList = nextLibraryByLibraryIdList;
    }

    /** NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdList'. */
    protected List<LdNextLibrary> _nextLibraryByNextLibraryIdList;

    /**
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdList'.
     * @return The entity list of referrer property 'nextLibraryByNextLibraryIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LdNextLibrary> getNextLibraryByNextLibraryIdList() {
        if (_nextLibraryByNextLibraryIdList == null) { _nextLibraryByNextLibraryIdList = newReferrerList(); }
        return _nextLibraryByNextLibraryIdList;
    }

    /**
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdList'.
     * @param nextLibraryByNextLibraryIdList The entity list of referrer property 'nextLibraryByNextLibraryIdList'. (NullAllowed)
     */
    public void setNextLibraryByNextLibraryIdList(List<LdNextLibrary> nextLibraryByNextLibraryIdList) {
        _nextLibraryByNextLibraryIdList = nextLibraryByNextLibraryIdList;
    }

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
        if (obj == null || !(obj instanceof LdBsLibrary)) { return false; }
        LdBsLibrary other = (LdBsLibrary)obj;
        if (!xSV(getLibraryId(), other.getLibraryId())) { return false; }
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
        hs = xCH(hs, getLibraryId());
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
        if (_libraryTypeLookup != null)
        { sb.append(li).append(xbRDS(_libraryTypeLookup, "libraryTypeLookup")); }
        if (_collectionList != null) { for (Entity et : _collectionList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "collectionList")); } } }
        if (_libraryUserList != null) { for (Entity et : _libraryUserList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "libraryUserList")); } } }
        if (_nextLibraryByLibraryIdList != null) { for (Entity et : _nextLibraryByLibraryIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "nextLibraryByLibraryIdList")); } } }
        if (_nextLibraryByNextLibraryIdList != null) { for (Entity et : _nextLibraryByNextLibraryIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "nextLibraryByNextLibraryIdList")); } } }
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
        sb.append(dm).append(getLibraryId());
        sb.append(dm).append(getLibraryName());
        sb.append(dm).append(getLibraryTypeCode());
        sb.append(dm).append(getRUser());
        sb.append(dm).append(getRModule());
        sb.append(dm).append(getRTimestamp());
        sb.append(dm).append(getUUser());
        sb.append(dm).append(getUModule());
        sb.append(dm).append(getUTimestamp());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_libraryTypeLookup != null) { sb.append(cm).append("libraryTypeLookup"); }
        if (_collectionList != null && !_collectionList.isEmpty())
        { sb.append(cm).append("collectionList"); }
        if (_libraryUserList != null && !_libraryUserList.isEmpty())
        { sb.append(cm).append("libraryUserList"); }
        if (_nextLibraryByLibraryIdList != null && !_nextLibraryByLibraryIdList.isEmpty())
        { sb.append(cm).append("nextLibraryByLibraryIdList"); }
        if (_nextLibraryByNextLibraryIdList != null && !_nextLibraryByNextLibraryIdList.isEmpty())
        { sb.append(cm).append("nextLibraryByNextLibraryIdList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public LdLibrary clone() {
        try {
            return (LdLibrary)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LIBRARY_ID: {PK, ID, NotNull, SMALLINT(5)} <br />
     * @return The value of the column 'LIBRARY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLibraryId() {
        return _libraryId;
    }

    /**
     * [set] LIBRARY_ID: {PK, ID, NotNull, SMALLINT(5)} <br />
     * @param libraryId The value of the column 'LIBRARY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLibraryId(Integer libraryId) {
        __modifiedProperties.addPropertyName("libraryId");
        this._libraryId = libraryId;
    }

    /**
     * [get] LIBRARY_NAME: {UQ, NotNull, VARCHAR(80)} <br />
     * @return The value of the column 'LIBRARY_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getLibraryName() {
        return _libraryName;
    }

    /**
     * [set] LIBRARY_NAME: {UQ, NotNull, VARCHAR(80)} <br />
     * @param libraryName The value of the column 'LIBRARY_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setLibraryName(String libraryName) {
        __modifiedProperties.addPropertyName("libraryName");
        this._libraryName = libraryName;
    }

    /**
     * [get] LIBRARY_TYPE_CODE: {IX, NotNull, CHAR(3), FK to LIBRARY_TYPE_LOOKUP} <br />
     * @return The value of the column 'LIBRARY_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getLibraryTypeCode() {
        return _libraryTypeCode;
    }

    /**
     * [set] LIBRARY_TYPE_CODE: {IX, NotNull, CHAR(3), FK to LIBRARY_TYPE_LOOKUP} <br />
     * @param libraryTypeCode The value of the column 'LIBRARY_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setLibraryTypeCode(String libraryTypeCode) {
        __modifiedProperties.addPropertyName("libraryTypeCode");
        this._libraryTypeCode = libraryTypeCode;
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
