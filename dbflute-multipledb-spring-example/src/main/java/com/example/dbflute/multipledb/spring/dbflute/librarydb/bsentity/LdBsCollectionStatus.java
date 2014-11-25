/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdDBMetaInstanceHandler;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdCDef;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;

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
public abstract class LdBsCollectionStatus extends AbstractEntity implements DomainEntity {

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

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
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
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof LdBsCollectionStatus) {
            LdBsCollectionStatus other = (LdBsCollectionStatus)obj;
            if (!xSV(_collectionId, other._collectionId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _collectionId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_collection != null)
        { sb.append(li).append(xbRDS(_collection, "collection")); }
        if (_collectionStatusLookup != null)
        { sb.append(li).append(xbRDS(_collectionStatusLookup, "collectionStatusLookup")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_collectionId));
        sb.append(dm).append(xfND(_collectionStatusCode));
        sb.append(dm).append(xfND(_rUser));
        sb.append(dm).append(xfND(_rModule));
        sb.append(dm).append(xfND(_rTimestamp));
        sb.append(dm).append(xfND(_uUser));
        sb.append(dm).append(xfND(_uModule));
        sb.append(dm).append(xfND(_uTimestamp));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_collection != null)
        { sb.append(dm).append("collection"); }
        if (_collectionStatusLookup != null)
        { sb.append(dm).append("collectionStatusLookup"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LdCollectionStatus clone() {
        return (LdCollectionStatus)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION} <br />
     * @return The value of the column 'COLLECTION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCollectionId() {
        checkSpecifiedProperty("collectionId");
        return _collectionId;
    }

    /**
     * [set] COLLECTION_ID: {PK, IX, NotNull, INTEGER(10), FK to COLLECTION} <br />
     * @param collectionId The value of the column 'COLLECTION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCollectionId(Integer collectionId) {
        registerModifiedProperty("collectionId");
        _collectionId = collectionId;
    }

    /**
     * [get] COLLECTION_STATUS_CODE: {IX, NotNull, CHAR(3), FK to COLLECTION_STATUS_LOOKUP, classification=CollectionStatus} <br />
     * @return The value of the column 'COLLECTION_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCollectionStatusCode() {
        checkSpecifiedProperty("collectionStatusCode");
        return _collectionStatusCode;
    }

    /**
     * [set] COLLECTION_STATUS_CODE: {IX, NotNull, CHAR(3), FK to COLLECTION_STATUS_LOOKUP, classification=CollectionStatus} <br />
     * @param collectionStatusCode The value of the column 'COLLECTION_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCollectionStatusCode(String collectionStatusCode) {
        registerModifiedProperty("collectionStatusCode");
        _collectionStatusCode = collectionStatusCode;
    }

    /**
     * [get] R_USER: {NotNull, VARCHAR(100), default=[default-user]} <br />
     * @return The value of the column 'R_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRUser() {
        checkSpecifiedProperty("RUser");
        return _rUser;
    }

    /**
     * [set] R_USER: {NotNull, VARCHAR(100), default=[default-user]} <br />
     * @param rUser The value of the column 'R_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRUser(String rUser) {
        registerModifiedProperty("RUser");
        _rUser = rUser;
    }

    /**
     * [get] R_MODULE: {NotNull, VARCHAR(100), default=[default-module]} <br />
     * @return The value of the column 'R_MODULE'. (basically NotNull if selected: for the constraint)
     */
    public String getRModule() {
        checkSpecifiedProperty("RModule");
        return _rModule;
    }

    /**
     * [set] R_MODULE: {NotNull, VARCHAR(100), default=[default-module]} <br />
     * @param rModule The value of the column 'R_MODULE'. (basically NotNull if update: for the constraint)
     */
    public void setRModule(String rModule) {
        registerModifiedProperty("RModule");
        _rModule = rModule;
    }

    /**
     * [get] R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} <br />
     * @return The value of the column 'R_TIMESTAMP'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getRTimestamp() {
        checkSpecifiedProperty("RTimestamp");
        return _rTimestamp;
    }

    /**
     * [set] R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} <br />
     * @param rTimestamp The value of the column 'R_TIMESTAMP'. (basically NotNull if update: for the constraint)
     */
    public void setRTimestamp(java.sql.Timestamp rTimestamp) {
        registerModifiedProperty("RTimestamp");
        _rTimestamp = rTimestamp;
    }

    /**
     * [get] U_USER: {NotNull, VARCHAR(100), default=[default-user]} <br />
     * @return The value of the column 'U_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUUser() {
        checkSpecifiedProperty("UUser");
        return _uUser;
    }

    /**
     * [set] U_USER: {NotNull, VARCHAR(100), default=[default-user]} <br />
     * @param uUser The value of the column 'U_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUUser(String uUser) {
        registerModifiedProperty("UUser");
        _uUser = uUser;
    }

    /**
     * [get] U_MODULE: {NotNull, VARCHAR(100), default=[default-module]} <br />
     * @return The value of the column 'U_MODULE'. (basically NotNull if selected: for the constraint)
     */
    public String getUModule() {
        checkSpecifiedProperty("UModule");
        return _uModule;
    }

    /**
     * [set] U_MODULE: {NotNull, VARCHAR(100), default=[default-module]} <br />
     * @param uModule The value of the column 'U_MODULE'. (basically NotNull if update: for the constraint)
     */
    public void setUModule(String uModule) {
        registerModifiedProperty("UModule");
        _uModule = uModule;
    }

    /**
     * [get] U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} <br />
     * @return The value of the column 'U_TIMESTAMP'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getUTimestamp() {
        checkSpecifiedProperty("UTimestamp");
        return _uTimestamp;
    }

    /**
     * [set] U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} <br />
     * @param uTimestamp The value of the column 'U_TIMESTAMP'. (basically NotNull if update: for the constraint)
     */
    public void setUTimestamp(java.sql.Timestamp uTimestamp) {
        registerModifiedProperty("UTimestamp");
        _uTimestamp = uTimestamp;
    }
}
