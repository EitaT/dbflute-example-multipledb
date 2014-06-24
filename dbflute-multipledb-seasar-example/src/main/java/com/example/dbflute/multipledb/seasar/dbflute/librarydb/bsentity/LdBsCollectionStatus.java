/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdEntityDefinedCommonColumn;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdDBMetaInstanceHandler;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdCDef;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.*;

/**
 * The entity of COLLECTION_STATUS as TABLE. <br />
 * <pre>
 * [primary-key]
 *     COLLECTION_ID
 * 
 * [column]
 *     COLLECTION_ID, COLLECTION_STATUS_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     COLLECTION, COLLECTION_STATUS_LOOKUP
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     collection, collectionStatusLookup
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer collectionId = entity.getCollectionId();
 * String collectionStatusCode = entity.getCollectionStatusCode();
 * String rUser = entity.getRUser();
 * String rModule = entity.getRModule();
 * java.sql.Timestamp rTimestamp = entity.getRTimestamp();
 * String uUser = entity.getUUser();
 * String uModule = entity.getUModule();
 * java.sql.Timestamp uTimestamp = entity.getUTimestamp();
 * entity.setCollectionId(collectionId);
 * entity.setCollectionStatusCode(collectionStatusCode);
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
public abstract class LdBsCollectionStatus implements LdEntityDefinedCommonColumn, Serializable, Cloneable {

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
    /** COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION} */
    protected Integer _collectionId;

    /** COLLECTION_STATUS_CODE: {IX, NotNull, CHAR(3), FK to COLLECTION_STATUS_LOOKUP, classification=CollectionStatus} */
    protected String _collectionStatusCode;

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
    /** The unique-driven properties for this entity. (NotNull) */
    protected final EntityUniqueDrivenProperties __uniqueDrivenProperties = newUniqueDrivenProperties();

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
        return "COLLECTION_STATUS";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "collectionStatus";
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
        if (getCollectionId() == null) { return false; }
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of collectionStatusCode as the classification of CollectionStatus. <br />
     * COLLECTION_STATUS_CODE: {IX, NotNull, CHAR(3), FK to COLLECTION_STATUS_LOOKUP, classification=CollectionStatus} <br />
     * 蔵書の状態を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public LdCDef.CollectionStatus getCollectionStatusCodeAsCollectionStatus() {
        return LdCDef.CollectionStatus.codeOf(getCollectionStatusCode());
    }

    /**
     * Set the value of collectionStatusCode as the classification of CollectionStatus. <br />
     * COLLECTION_STATUS_CODE: {IX, NotNull, CHAR(3), FK to COLLECTION_STATUS_LOOKUP, classification=CollectionStatus} <br />
     * 蔵書の状態を示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCollectionStatusCodeAsCollectionStatus(LdCDef.CollectionStatus cdef) {
        setCollectionStatusCode(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of collectionStatusCode as NOR (NOR). <br />
     * NOR: 通常状態を示す
     */
    public void setCollectionStatusCode_NOR() {
        setCollectionStatusCodeAsCollectionStatus(LdCDef.CollectionStatus.NOR);
    }

    /**
     * Set the value of collectionStatusCode as WAT (WAT). <br />
     * WAT: 待ち状態を示す
     */
    public void setCollectionStatusCode_WAT() {
        setCollectionStatusCodeAsCollectionStatus(LdCDef.CollectionStatus.WAT);
    }

    /**
     * Set the value of collectionStatusCode as OUT (OUT). <br />
     * OUT: 貸し出し中を示す
     */
    public void setCollectionStatusCode_OUT() {
        setCollectionStatusCodeAsCollectionStatus(LdCDef.CollectionStatus.OUT);
    }

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
     * Is the value of collectionStatusCode NOR? <br />
     * NOR: 通常状態を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCollectionStatusCodeNOR() {
        LdCDef.CollectionStatus cdef = getCollectionStatusCodeAsCollectionStatus();
        return cdef != null ? cdef.equals(LdCDef.CollectionStatus.NOR) : false;
    }

    /**
     * Is the value of collectionStatusCode WAT? <br />
     * WAT: 待ち状態を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCollectionStatusCodeWAT() {
        LdCDef.CollectionStatus cdef = getCollectionStatusCodeAsCollectionStatus();
        return cdef != null ? cdef.equals(LdCDef.CollectionStatus.WAT) : false;
    }

    /**
     * Is the value of collectionStatusCode OUT? <br />
     * OUT: 貸し出し中を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCollectionStatusCodeOUT() {
        LdCDef.CollectionStatus cdef = getCollectionStatusCodeAsCollectionStatus();
        return cdef != null ? cdef.equals(LdCDef.CollectionStatus.OUT) : false;
    }

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
    /** COLLECTION by my COLLECTION_ID, named 'collection'. */
    protected LdCollection _collection;

    /**
     * [get] COLLECTION by my COLLECTION_ID, named 'collection'.
     * @return The entity of foreign property 'collection'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdCollection getCollection() {
        return _collection;
    }

    /**
     * [set] COLLECTION by my COLLECTION_ID, named 'collection'.
     * @param collection The entity of foreign property 'collection'. (NullAllowed)
     */
    public void setCollection(LdCollection collection) {
        _collection = collection;
    }

    /** COLLECTION_STATUS_LOOKUP by my COLLECTION_STATUS_CODE, named 'collectionStatusLookup'. */
    protected LdCollectionStatusLookup _collectionStatusLookup;

    /**
     * [get] COLLECTION_STATUS_LOOKUP by my COLLECTION_STATUS_CODE, named 'collectionStatusLookup'.
     * @return The entity of foreign property 'collectionStatusLookup'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdCollectionStatusLookup getCollectionStatusLookup() {
        return _collectionStatusLookup;
    }

    /**
     * [set] COLLECTION_STATUS_LOOKUP by my COLLECTION_STATUS_CODE, named 'collectionStatusLookup'.
     * @param collectionStatusLookup The entity of foreign property 'collectionStatusLookup'. (NullAllowed)
     */
    public void setCollectionStatusLookup(LdCollectionStatusLookup collectionStatusLookup) {
        _collectionStatusLookup = collectionStatusLookup;
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
        if (obj == null || !(obj instanceof LdBsCollectionStatus)) { return false; }
        LdBsCollectionStatus other = (LdBsCollectionStatus)obj;
        if (!xSV(getCollectionId(), other.getCollectionId())) { return false; }
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
        hs = xCH(hs, getCollectionId());
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
        if (_collection != null)
        { sb.append(li).append(xbRDS(_collection, "collection")); }
        if (_collectionStatusLookup != null)
        { sb.append(li).append(xbRDS(_collectionStatusLookup, "collectionStatusLookup")); }
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
        sb.append(dm).append(getCollectionId());
        sb.append(dm).append(getCollectionStatusCode());
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
        if (_collection != null) { sb.append(cm).append("collection"); }
        if (_collectionStatusLookup != null) { sb.append(cm).append("collectionStatusLookup"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public LdCollectionStatus clone() {
        try {
            return (LdCollectionStatus)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
        _collectionId = collectionId;
    }

    /**
     * [get] COLLECTION_STATUS_CODE: {IX, NotNull, CHAR(3), FK to COLLECTION_STATUS_LOOKUP, classification=CollectionStatus} <br />
     * @return The value of the column 'COLLECTION_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCollectionStatusCode() {
        return _collectionStatusCode;
    }

    /**
     * [set] COLLECTION_STATUS_CODE: {IX, NotNull, CHAR(3), FK to COLLECTION_STATUS_LOOKUP, classification=CollectionStatus} <br />
     * @param collectionStatusCode The value of the column 'COLLECTION_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCollectionStatusCode(String collectionStatusCode) {
        __modifiedProperties.addPropertyName("collectionStatusCode");
        _collectionStatusCode = collectionStatusCode;
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
        _rUser = rUser;
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
        _rModule = rModule;
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
        _rTimestamp = rTimestamp;
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
        _uUser = uUser;
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
        _uModule = uModule;
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
        _uTimestamp = uTimestamp;
    }
}
