/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsentity.customize;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdCDef;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.customize.*;

/**
 * The entity of BookStatistic. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     BOOK_ID, BOOK_NAME, COLLECTION_COUNT, OUT_OF_USER_SELECT_YN, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 * Integer bookId = entity.getBookId();
 * String bookName = entity.getBookName();
 * Integer collectionCount = entity.getCollectionCount();
 * String outOfUserSelectYn = entity.getOutOfUserSelectYn();
 * String rUser = entity.getRUser();
 * String rModule = entity.getRModule();
 * java.sql.Timestamp rTimestamp = entity.getRTimestamp();
 * String uUser = entity.getUUser();
 * String uModule = entity.getUModule();
 * java.sql.Timestamp uTimestamp = entity.getUTimestamp();
 * entity.setBookId(bookId);
 * entity.setBookName(bookName);
 * entity.setCollectionCount(collectionCount);
 * entity.setOutOfUserSelectYn(outOfUserSelectYn);
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
public abstract class LdBsBookStatistic implements Entity, Serializable, Cloneable {

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
    /** BOOK_ID: {INTEGER(10), refers to BOOK.BOOK_ID} */
    protected Integer _bookId;

    /** BOOK_NAME: {VARCHAR(80), refers to BOOK.BOOK_NAME} */
    protected String _bookName;

    /** COLLECTION_COUNT: {INTEGER(10)} */
    protected Integer _collectionCount;

    /** OUT_OF_USER_SELECT_YN: {CHAR(1), refers to BOOK.OUT_OF_USER_SELECT_YN, classification=YesNo} */
    protected String _outOfUserSelectYn;

    /** R_USER: {VARCHAR(100), refers to BOOK.R_USER} */
    protected String _rUser;

    /** R_MODULE: {VARCHAR(100), refers to BOOK.R_MODULE, classification=RegisterModuleType} */
    protected String _rModule;

    /** R_TIMESTAMP: {TIMESTAMP(26, 6), refers to BOOK.R_TIMESTAMP} */
    protected java.sql.Timestamp _rTimestamp;

    /** U_USER: {VARCHAR(100), refers to BOOK.U_USER} */
    protected String _uUser;

    /** U_MODULE: {VARCHAR(100), refers to BOOK.U_MODULE, classification=UpdateModuleType} */
    protected String _uModule;

    /** U_TIMESTAMP: {TIMESTAMP(26, 6), refers to BOOK.U_TIMESTAMP} */
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
        return "BookStatistic";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "bookStatistic";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsentity.customize.dbmeta.LdBookStatisticDbm.getInstance();
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of outOfUserSelectYn as the classification of YesNo. <br />
     * OUT_OF_USER_SELECT_YN: {CHAR(1), refers to BOOK.OUT_OF_USER_SELECT_YN, classification=YesNo} <br />
     * はいいいえを示す
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public LdCDef.YesNo getOutOfUserSelectYnAsYesNo() {
        return LdCDef.YesNo.codeOf(getOutOfUserSelectYn());
    }

    /**
     * Set the value of outOfUserSelectYn as the classification of YesNo. <br />
     * OUT_OF_USER_SELECT_YN: {CHAR(1), refers to BOOK.OUT_OF_USER_SELECT_YN, classification=YesNo} <br />
     * はいいいえを示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setOutOfUserSelectYnAsYesNo(LdCDef.YesNo cdef) {
        setOutOfUserSelectYn(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of rModule as the classification of RegisterModuleType. <br />
     * R_MODULE: {VARCHAR(100), refers to BOOK.R_MODULE, classification=RegisterModuleType} <br />
     * 登録モジュールタイプ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public LdCDef.RegisterModuleType getRModuleAsRegisterModuleType() {
        return LdCDef.RegisterModuleType.codeOf(getRModule());
    }

    /**
     * Set the value of rModule as the classification of RegisterModuleType. <br />
     * R_MODULE: {VARCHAR(100), refers to BOOK.R_MODULE, classification=RegisterModuleType} <br />
     * 登録モジュールタイプ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setRModuleAsRegisterModuleType(LdCDef.RegisterModuleType cdef) {
        setRModule(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of uModule as the classification of UpdateModuleType. <br />
     * U_MODULE: {VARCHAR(100), refers to BOOK.U_MODULE, classification=UpdateModuleType} <br />
     * 更新モジュールタイプ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public LdCDef.UpdateModuleType getUModuleAsUpdateModuleType() {
        return LdCDef.UpdateModuleType.codeOf(getUModule());
    }

    /**
     * Set the value of uModule as the classification of UpdateModuleType. <br />
     * U_MODULE: {VARCHAR(100), refers to BOOK.U_MODULE, classification=UpdateModuleType} <br />
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
     * Set the value of outOfUserSelectYn as y (y). <br />
     * y
     */
    public void setOutOfUserSelectYn_y() {
        setOutOfUserSelectYnAsYesNo(LdCDef.YesNo.y);
    }

    /**
     * Set the value of outOfUserSelectYn as n (n). <br />
     * n
     */
    public void setOutOfUserSelectYn_n() {
        setOutOfUserSelectYnAsYesNo(LdCDef.YesNo.n);
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
     * Is the value of outOfUserSelectYn y? <br />
     * y
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOutOfUserSelectYny() {
        LdCDef.YesNo cdef = getOutOfUserSelectYnAsYesNo();
        return cdef != null ? cdef.equals(LdCDef.YesNo.y) : false;
    }

    /**
     * Is the value of outOfUserSelectYn n? <br />
     * n
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOutOfUserSelectYnn() {
        LdCDef.YesNo cdef = getOutOfUserSelectYnAsYesNo();
        return cdef != null ? cdef.equals(LdCDef.YesNo.n) : false;
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
        if (obj == null || !(obj instanceof LdBsBookStatistic)) { return false; }
        LdBsBookStatistic other = (LdBsBookStatistic)obj;
        if (!xSV(getBookId(), other.getBookId())) { return false; }
        if (!xSV(getBookName(), other.getBookName())) { return false; }
        if (!xSV(getCollectionCount(), other.getCollectionCount())) { return false; }
        if (!xSV(getOutOfUserSelectYn(), other.getOutOfUserSelectYn())) { return false; }
        if (!xSV(getRUser(), other.getRUser())) { return false; }
        if (!xSV(getRModule(), other.getRModule())) { return false; }
        if (!xSV(getRTimestamp(), other.getRTimestamp())) { return false; }
        if (!xSV(getUUser(), other.getUUser())) { return false; }
        if (!xSV(getUModule(), other.getUModule())) { return false; }
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
        hs = xCH(hs, getBookId());
        hs = xCH(hs, getBookName());
        hs = xCH(hs, getCollectionCount());
        hs = xCH(hs, getOutOfUserSelectYn());
        hs = xCH(hs, getRUser());
        hs = xCH(hs, getRModule());
        hs = xCH(hs, getRTimestamp());
        hs = xCH(hs, getUUser());
        hs = xCH(hs, getUModule());
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
        sb.append(dm).append(getBookId());
        sb.append(dm).append(getBookName());
        sb.append(dm).append(getCollectionCount());
        sb.append(dm).append(getOutOfUserSelectYn());
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
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public LdBookStatistic clone() {
        try {
            return (LdBookStatistic)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BOOK_ID: {INTEGER(10), refers to BOOK.BOOK_ID} <br />
     * @return The value of the column 'BOOK_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBookId() {
        return _bookId;
    }

    /**
     * [set] BOOK_ID: {INTEGER(10), refers to BOOK.BOOK_ID} <br />
     * @param bookId The value of the column 'BOOK_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBookId(Integer bookId) {
        __modifiedProperties.addPropertyName("bookId");
        this._bookId = bookId;
    }

    /**
     * [get] BOOK_NAME: {VARCHAR(80), refers to BOOK.BOOK_NAME} <br />
     * @return The value of the column 'BOOK_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getBookName() {
        return _bookName;
    }

    /**
     * [set] BOOK_NAME: {VARCHAR(80), refers to BOOK.BOOK_NAME} <br />
     * @param bookName The value of the column 'BOOK_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBookName(String bookName) {
        __modifiedProperties.addPropertyName("bookName");
        this._bookName = bookName;
    }

    /**
     * [get] COLLECTION_COUNT: {INTEGER(10)} <br />
     * @return The value of the column 'COLLECTION_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCollectionCount() {
        return _collectionCount;
    }

    /**
     * [set] COLLECTION_COUNT: {INTEGER(10)} <br />
     * @param collectionCount The value of the column 'COLLECTION_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCollectionCount(Integer collectionCount) {
        __modifiedProperties.addPropertyName("collectionCount");
        this._collectionCount = collectionCount;
    }

    /**
     * [get] OUT_OF_USER_SELECT_YN: {CHAR(1), refers to BOOK.OUT_OF_USER_SELECT_YN, classification=YesNo} <br />
     * @return The value of the column 'OUT_OF_USER_SELECT_YN'. (NullAllowed even if selected: for no constraint)
     */
    public String getOutOfUserSelectYn() {
        return _outOfUserSelectYn;
    }

    /**
     * [set] OUT_OF_USER_SELECT_YN: {CHAR(1), refers to BOOK.OUT_OF_USER_SELECT_YN, classification=YesNo} <br />
     * @param outOfUserSelectYn The value of the column 'OUT_OF_USER_SELECT_YN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOutOfUserSelectYn(String outOfUserSelectYn) {
        __modifiedProperties.addPropertyName("outOfUserSelectYn");
        this._outOfUserSelectYn = outOfUserSelectYn;
    }

    /**
     * [get] R_USER: {VARCHAR(100), refers to BOOK.R_USER} <br />
     * @return The value of the column 'R_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getRUser() {
        return _rUser;
    }

    /**
     * [set] R_USER: {VARCHAR(100), refers to BOOK.R_USER} <br />
     * @param rUser The value of the column 'R_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRUser(String rUser) {
        __modifiedProperties.addPropertyName("RUser");
        this._rUser = rUser;
    }

    /**
     * [get] R_MODULE: {VARCHAR(100), refers to BOOK.R_MODULE, classification=RegisterModuleType} <br />
     * @return The value of the column 'R_MODULE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRModule() {
        return _rModule;
    }

    /**
     * [set] R_MODULE: {VARCHAR(100), refers to BOOK.R_MODULE, classification=RegisterModuleType} <br />
     * @param rModule The value of the column 'R_MODULE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRModule(String rModule) {
        __modifiedProperties.addPropertyName("RModule");
        this._rModule = rModule;
    }

    /**
     * [get] R_TIMESTAMP: {TIMESTAMP(26, 6), refers to BOOK.R_TIMESTAMP} <br />
     * @return The value of the column 'R_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getRTimestamp() {
        return _rTimestamp;
    }

    /**
     * [set] R_TIMESTAMP: {TIMESTAMP(26, 6), refers to BOOK.R_TIMESTAMP} <br />
     * @param rTimestamp The value of the column 'R_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRTimestamp(java.sql.Timestamp rTimestamp) {
        __modifiedProperties.addPropertyName("RTimestamp");
        this._rTimestamp = rTimestamp;
    }

    /**
     * [get] U_USER: {VARCHAR(100), refers to BOOK.U_USER} <br />
     * @return The value of the column 'U_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUUser() {
        return _uUser;
    }

    /**
     * [set] U_USER: {VARCHAR(100), refers to BOOK.U_USER} <br />
     * @param uUser The value of the column 'U_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUUser(String uUser) {
        __modifiedProperties.addPropertyName("UUser");
        this._uUser = uUser;
    }

    /**
     * [get] U_MODULE: {VARCHAR(100), refers to BOOK.U_MODULE, classification=UpdateModuleType} <br />
     * @return The value of the column 'U_MODULE'. (NullAllowed even if selected: for no constraint)
     */
    public String getUModule() {
        return _uModule;
    }

    /**
     * [set] U_MODULE: {VARCHAR(100), refers to BOOK.U_MODULE, classification=UpdateModuleType} <br />
     * @param uModule The value of the column 'U_MODULE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUModule(String uModule) {
        __modifiedProperties.addPropertyName("UModule");
        this._uModule = uModule;
    }

    /**
     * [get] U_TIMESTAMP: {TIMESTAMP(26, 6), refers to BOOK.U_TIMESTAMP} <br />
     * @return The value of the column 'U_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUTimestamp() {
        return _uTimestamp;
    }

    /**
     * [set] U_TIMESTAMP: {TIMESTAMP(26, 6), refers to BOOK.U_TIMESTAMP} <br />
     * @param uTimestamp The value of the column 'U_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUTimestamp(java.sql.Timestamp uTimestamp) {
        __modifiedProperties.addPropertyName("UTimestamp");
        this._uTimestamp = uTimestamp;
    }
}
