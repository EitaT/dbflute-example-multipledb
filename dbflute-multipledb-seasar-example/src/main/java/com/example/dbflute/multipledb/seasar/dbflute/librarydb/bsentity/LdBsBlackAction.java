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
 * The entity of BLACK_ACTION as TABLE. <br />
 * <pre>
 * [primary-key]
 *     BLACK_ACTION_ID
 * 
 * [column]
 *     BLACK_ACTION_ID, BLACK_LIST_ID, BLACK_ACTION_CODE, BLACK_LEVEL, ACTION_DATE, EVIDENCE_PHOTOGRAPH, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     BLACK_ACTION_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     BLACK_LIST, BLACK_ACTION_LOOKUP
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     blackList, blackActionLookup
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer blackActionId = entity.getBlackActionId();
 * Integer blackListId = entity.getBlackListId();
 * String blackActionCode = entity.getBlackActionCode();
 * Integer blackLevel = entity.getBlackLevel();
 * java.sql.Timestamp actionDate = entity.getActionDate();
 * byte[] evidencePhotograph = entity.getEvidencePhotograph();
 * String rUser = entity.getRUser();
 * String rModule = entity.getRModule();
 * java.sql.Timestamp rTimestamp = entity.getRTimestamp();
 * String uUser = entity.getUUser();
 * String uModule = entity.getUModule();
 * java.sql.Timestamp uTimestamp = entity.getUTimestamp();
 * entity.setBlackActionId(blackActionId);
 * entity.setBlackListId(blackListId);
 * entity.setBlackActionCode(blackActionCode);
 * entity.setBlackLevel(blackLevel);
 * entity.setActionDate(actionDate);
 * entity.setEvidencePhotograph(evidencePhotograph);
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
public abstract class LdBsBlackAction implements LdEntityDefinedCommonColumn, Serializable, Cloneable {

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
    /** BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)} */
    protected Integer _blackActionId;

    /** BLACK_LIST_ID: {IX, NotNull, INTEGER(10), FK to BLACK_LIST} */
    protected Integer _blackListId;

    /** BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP} */
    protected String _blackActionCode;

    /** BLACK_LEVEL: {NotNull, SMALLINT(5)} */
    protected Integer _blackLevel;

    /** ACTION_DATE: {TIMESTAMP(26, 6)} */
    protected java.sql.Timestamp _actionDate;

    /** EVIDENCE_PHOTOGRAPH: {BLOB(2147483647)} */
    protected byte[] _evidencePhotograph;

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
        return "BLACK_ACTION";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "blackAction";
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
        if (getBlackActionId() == null) { return false; }
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
    /** BLACK_LIST by my BLACK_LIST_ID, named 'blackList'. */
    protected LdBlackList _blackList;

    /**
     * BLACK_LIST by my BLACK_LIST_ID, named 'blackList'.
     * @return The entity of foreign property 'blackList'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdBlackList getBlackList() {
        return _blackList;
    }

    /**
     * BLACK_LIST by my BLACK_LIST_ID, named 'blackList'.
     * @param blackList The entity of foreign property 'blackList'. (NullAllowed)
     */
    public void setBlackList(LdBlackList blackList) {
        _blackList = blackList;
    }

    /** BLACK_ACTION_LOOKUP by my BLACK_ACTION_CODE, named 'blackActionLookup'. */
    protected LdBlackActionLookup _blackActionLookup;

    /**
     * BLACK_ACTION_LOOKUP by my BLACK_ACTION_CODE, named 'blackActionLookup'.
     * @return The entity of foreign property 'blackActionLookup'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdBlackActionLookup getBlackActionLookup() {
        return _blackActionLookup;
    }

    /**
     * BLACK_ACTION_LOOKUP by my BLACK_ACTION_CODE, named 'blackActionLookup'.
     * @param blackActionLookup The entity of foreign property 'blackActionLookup'. (NullAllowed)
     */
    public void setBlackActionLookup(LdBlackActionLookup blackActionLookup) {
        _blackActionLookup = blackActionLookup;
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
        if (obj == null || !(obj instanceof LdBsBlackAction)) { return false; }
        LdBsBlackAction other = (LdBsBlackAction)obj;
        if (!xSV(getBlackActionId(), other.getBlackActionId())) { return false; }
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
        result = xCH(result, getBlackActionId());
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
        if (_blackList != null)
        { sb.append(l).append(xbRDS(_blackList, "blackList")); }
        if (_blackActionLookup != null)
        { sb.append(l).append(xbRDS(_blackActionLookup, "blackActionLookup")); }
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
        sb.append(delimiter).append(getBlackActionId());
        sb.append(delimiter).append(getBlackListId());
        sb.append(delimiter).append(getBlackActionCode());
        sb.append(delimiter).append(getBlackLevel());
        sb.append(delimiter).append(getActionDate());
        sb.append(delimiter).append(xfBA(getEvidencePhotograph()));
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
    protected String xfBA(byte[] bytes) { // formatByteArray()
        return FunCustodial.toString(bytes);
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_blackList != null) { sb.append(c).append("blackList"); }
        if (_blackActionLookup != null) { sb.append(c).append("blackActionLookup"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public LdBlackAction clone() {
        try {
            return (LdBlackAction)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'BLACK_ACTION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBlackActionId() {
        return _blackActionId;
    }

    /**
     * [set] BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @param blackActionId The value of the column 'BLACK_ACTION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBlackActionId(Integer blackActionId) {
        __modifiedProperties.addPropertyName("blackActionId");
        this._blackActionId = blackActionId;
    }

    /**
     * [get] BLACK_LIST_ID: {IX, NotNull, INTEGER(10), FK to BLACK_LIST} <br />
     * @return The value of the column 'BLACK_LIST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBlackListId() {
        return _blackListId;
    }

    /**
     * [set] BLACK_LIST_ID: {IX, NotNull, INTEGER(10), FK to BLACK_LIST} <br />
     * @param blackListId The value of the column 'BLACK_LIST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBlackListId(Integer blackListId) {
        __modifiedProperties.addPropertyName("blackListId");
        this._blackListId = blackListId;
    }

    /**
     * [get] BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP} <br />
     * @return The value of the column 'BLACK_ACTION_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getBlackActionCode() {
        return _blackActionCode;
    }

    /**
     * [set] BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP} <br />
     * @param blackActionCode The value of the column 'BLACK_ACTION_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setBlackActionCode(String blackActionCode) {
        __modifiedProperties.addPropertyName("blackActionCode");
        this._blackActionCode = blackActionCode;
    }

    /**
     * [get] BLACK_LEVEL: {NotNull, SMALLINT(5)} <br />
     * @return The value of the column 'BLACK_LEVEL'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBlackLevel() {
        return _blackLevel;
    }

    /**
     * [set] BLACK_LEVEL: {NotNull, SMALLINT(5)} <br />
     * @param blackLevel The value of the column 'BLACK_LEVEL'. (basically NotNull if update: for the constraint)
     */
    public void setBlackLevel(Integer blackLevel) {
        __modifiedProperties.addPropertyName("blackLevel");
        this._blackLevel = blackLevel;
    }

    /**
     * [get] ACTION_DATE: {TIMESTAMP(26, 6)} <br />
     * @return The value of the column 'ACTION_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getActionDate() {
        return _actionDate;
    }

    /**
     * [set] ACTION_DATE: {TIMESTAMP(26, 6)} <br />
     * @param actionDate The value of the column 'ACTION_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setActionDate(java.sql.Timestamp actionDate) {
        __modifiedProperties.addPropertyName("actionDate");
        this._actionDate = actionDate;
    }

    /**
     * [get] EVIDENCE_PHOTOGRAPH: {BLOB(2147483647)} <br />
     * @return The value of the column 'EVIDENCE_PHOTOGRAPH'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getEvidencePhotograph() {
        return _evidencePhotograph;
    }

    /**
     * [set] EVIDENCE_PHOTOGRAPH: {BLOB(2147483647)} <br />
     * @param evidencePhotograph The value of the column 'EVIDENCE_PHOTOGRAPH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEvidencePhotograph(byte[] evidencePhotograph) {
        __modifiedProperties.addPropertyName("evidencePhotograph");
        this._evidencePhotograph = evidencePhotograph;
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
