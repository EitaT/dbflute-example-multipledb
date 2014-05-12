/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.customize;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdCDef;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.customize.*;

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

    /** R_MODULE: {VARCHAR(100), refers to BOOK.R_MODULE} */
    protected String _rModule;

    /** R_TIMESTAMP: {TIMESTAMP(26, 6), refers to BOOK.R_TIMESTAMP} */
    protected java.sql.Timestamp _rTimestamp;

    /** U_USER: {VARCHAR(100), refers to BOOK.U_USER} */
    protected String _uUser;

    /** U_MODULE: {VARCHAR(100), refers to BOOK.U_MODULE} */
    protected String _uModule;

    /** U_TIMESTAMP: {TIMESTAMP(26, 6), refers to BOOK.U_TIMESTAMP} */
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
        return com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.customize.dbmeta.LdBookStatisticDbm.getInstance();
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

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of outOfUserSelectYn as Yes (y). <br />
     * はい
     */
    public void setOutOfUserSelectYn_Yes() {
        setOutOfUserSelectYnAsYesNo(LdCDef.YesNo.Yes);
    }

    /**
     * Set the value of outOfUserSelectYn as No (n). <br />
     * いいえ
     */
    public void setOutOfUserSelectYn_No() {
        setOutOfUserSelectYnAsYesNo(LdCDef.YesNo.No);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of outOfUserSelectYn Yes? <br />
     * はい
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOutOfUserSelectYnYes() {
        LdCDef.YesNo cdef = getOutOfUserSelectYnAsYesNo();
        return cdef != null ? cdef.equals(LdCDef.YesNo.Yes) : false;
    }

    /**
     * Is the value of outOfUserSelectYn No? <br />
     * いいえ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOutOfUserSelectYnNo() {
        LdCDef.YesNo cdef = getOutOfUserSelectYnAsYesNo();
        return cdef != null ? cdef.equals(LdCDef.YesNo.No) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'outOfUserSelectYn' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getOutOfUserSelectYnName() {
        LdCDef.YesNo cdef = getOutOfUserSelectYnAsYesNo();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'outOfUserSelectYn' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getOutOfUserSelectYnAlias() {
        LdCDef.YesNo cdef = getOutOfUserSelectYnAsYesNo();
        return cdef != null ? cdef.alias() : null;
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
        result = xCH(result, getBookId());
        result = xCH(result, getBookName());
        result = xCH(result, getCollectionCount());
        result = xCH(result, getOutOfUserSelectYn());
        result = xCH(result, getRUser());
        result = xCH(result, getRModule());
        result = xCH(result, getRTimestamp());
        result = xCH(result, getUUser());
        result = xCH(result, getUModule());
        result = xCH(result, getUTimestamp());
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
        String delimiter = ", ";
        sb.append(delimiter).append(getBookId());
        sb.append(delimiter).append(getBookName());
        sb.append(delimiter).append(getCollectionCount());
        sb.append(delimiter).append(getOutOfUserSelectYn());
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
     * [get] R_MODULE: {VARCHAR(100), refers to BOOK.R_MODULE} <br />
     * @return The value of the column 'R_MODULE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRModule() {
        return _rModule;
    }

    /**
     * [set] R_MODULE: {VARCHAR(100), refers to BOOK.R_MODULE} <br />
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
     * [get] U_MODULE: {VARCHAR(100), refers to BOOK.U_MODULE} <br />
     * @return The value of the column 'U_MODULE'. (NullAllowed even if selected: for no constraint)
     */
    public String getUModule() {
        return _uModule;
    }

    /**
     * [set] U_MODULE: {VARCHAR(100), refers to BOOK.U_MODULE} <br />
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
