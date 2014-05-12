/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdEntityDefinedCommonColumn;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdDBMetaInstanceHandler;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdCDef;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.*;

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
public abstract class LdBsLibrary implements LdEntityDefinedCommonColumn, Serializable, Cloneable {

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

    /** R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType} */
    protected String _rModule;

    /** R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} */
    protected java.sql.Timestamp _rTimestamp;

    /** U_USER: {NotNull, VARCHAR(100), default=[default-user]} */
    protected String _uUser;

    /** U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType} */
    protected String _uModule;

    /** U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} */
    protected java.sql.Timestamp _uTimestamp;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is common column auto set up effective? */
    protected boolean __canCommonColumnAutoSetup = true;

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

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of rModule as the classification of RegisterModuleType. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType} <br />
     * 登録モジュールタイプ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public LdCDef.RegisterModuleType getRModuleAsRegisterModuleType() {
        return LdCDef.RegisterModuleType.codeOf(getRModule());
    }

    /**
     * Set the value of rModule as the classification of RegisterModuleType. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType} <br />
     * 登録モジュールタイプ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setRModuleAsRegisterModuleType(LdCDef.RegisterModuleType cdef) {
        setRModule(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of uModule as the classification of UpdateModuleType. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType} <br />
     * 更新モジュールタイプ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public LdCDef.UpdateModuleType getUModuleAsUpdateModuleType() {
        return LdCDef.UpdateModuleType.codeOf(getUModule());
    }

    /**
     * Set the value of uModule as the classification of UpdateModuleType. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType} <br />
     * 更新モジュールタイプ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setUModuleAsUpdateModuleType(LdCDef.UpdateModuleType cdef) {
        setUModule(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of rModule as Online (OLN). <br />
     * Online: Online Module
     */
    public void setRModule_Online() {
        setRModuleAsRegisterModuleType(LdCDef.RegisterModuleType.Online);
    }

    /**
     * Set the value of rModule as Batch (BTC). <br />
     * Batch: Batch Module
     */
    public void setRModule_Batch() {
        setRModuleAsRegisterModuleType(LdCDef.RegisterModuleType.Batch);
    }

    /**
     * Set the value of uModule as Online (OLN). <br />
     * Online: Online Module
     */
    public void setUModule_Online() {
        setUModuleAsUpdateModuleType(LdCDef.UpdateModuleType.Online);
    }

    /**
     * Set the value of uModule as Batch (BTC). <br />
     * Batch: Batch Module
     */
    public void setUModule_Batch() {
        setUModuleAsUpdateModuleType(LdCDef.UpdateModuleType.Batch);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of rModule Online? <br />
     * Online: Online Module
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRModuleOnline() {
        LdCDef.RegisterModuleType cdef = getRModuleAsRegisterModuleType();
        return cdef != null ? cdef.equals(LdCDef.RegisterModuleType.Online) : false;
    }

    /**
     * Is the value of rModule Batch? <br />
     * Batch: Batch Module
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRModuleBatch() {
        LdCDef.RegisterModuleType cdef = getRModuleAsRegisterModuleType();
        return cdef != null ? cdef.equals(LdCDef.RegisterModuleType.Batch) : false;
    }

    /**
     * Is the value of uModule Online? <br />
     * Online: Online Module
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUModuleOnline() {
        LdCDef.UpdateModuleType cdef = getUModuleAsUpdateModuleType();
        return cdef != null ? cdef.equals(LdCDef.UpdateModuleType.Online) : false;
    }

    /**
     * Is the value of uModule Batch? <br />
     * Batch: Batch Module
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUModuleBatch() {
        LdCDef.UpdateModuleType cdef = getUModuleAsUpdateModuleType();
        return cdef != null ? cdef.equals(LdCDef.UpdateModuleType.Batch) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'rModule' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getRModuleName() {
        LdCDef.RegisterModuleType cdef = getRModuleAsRegisterModuleType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'uModule' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getUModuleName() {
        LdCDef.UpdateModuleType cdef = getUModuleAsUpdateModuleType();
        return cdef != null ? cdef.name() : null;
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
    //                                                                       Common Column
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void enableCommonColumnAutoSetup() {
        __canCommonColumnAutoSetup = true;
    }

    /**
     * {@inheritDoc}
     */
    public void disableCommonColumnAutoSetup() {
        __canCommonColumnAutoSetup = false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean canCommonColumnAutoSetup() {
        return __canCommonColumnAutoSetup;
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
    protected boolean xSV(Object value1, Object value2) {
        return FunCustodial.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getLibraryId());
        return result;
    }
    protected int xCH(int result, Object value) {
        return FunCustodial.calculateHashcode(result, value);
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
        String l = "\n  ";
        if (_libraryTypeLookup != null)
        { sb.append(l).append(xbRDS(_libraryTypeLookup, "libraryTypeLookup")); }
        if (_collectionList != null) { for (Entity e : _collectionList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "collectionList")); } } }
        if (_libraryUserList != null) { for (Entity e : _libraryUserList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "libraryUserList")); } } }
        if (_nextLibraryByLibraryIdList != null) { for (Entity e : _nextLibraryByLibraryIdList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "nextLibraryByLibraryIdList")); } } }
        if (_nextLibraryByNextLibraryIdList != null) { for (Entity e : _nextLibraryByNextLibraryIdList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "nextLibraryByNextLibraryIdList")); } } }
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
        sb.append(delimiter).append(getLibraryName());
        sb.append(delimiter).append(getLibraryTypeCode());
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
        if (_libraryTypeLookup != null) { sb.append(c).append("libraryTypeLookup"); }
        if (_collectionList != null && !_collectionList.isEmpty())
        { sb.append(c).append("collectionList"); }
        if (_libraryUserList != null && !_libraryUserList.isEmpty())
        { sb.append(c).append("libraryUserList"); }
        if (_nextLibraryByLibraryIdList != null && !_nextLibraryByLibraryIdList.isEmpty())
        { sb.append(c).append("nextLibraryByLibraryIdList"); }
        if (_nextLibraryByNextLibraryIdList != null && !_nextLibraryByNextLibraryIdList.isEmpty())
        { sb.append(c).append("nextLibraryByNextLibraryIdList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
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
     * [get] R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType} <br />
     * @return The value of the column 'R_MODULE'. (basically NotNull if selected: for the constraint)
     */
    public String getRModule() {
        return _rModule;
    }

    /**
     * [set] R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType} <br />
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
     * [get] U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType} <br />
     * @return The value of the column 'U_MODULE'. (basically NotNull if selected: for the constraint)
     */
    public String getUModule() {
        return _uModule;
    }

    /**
     * [set] U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType} <br />
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
