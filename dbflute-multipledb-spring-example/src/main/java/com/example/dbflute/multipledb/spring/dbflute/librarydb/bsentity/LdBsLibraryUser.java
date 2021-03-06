/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdDBMetaInstanceHandler;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;

/**
 * The entity of LIBRARY_USER as TABLE. <br />
 * <pre>
 * [primary-key]
 *     LIBRARY_ID, LB_USER_ID
 * 
 * [column]
 *     LIBRARY_ID, LB_USER_ID, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LB_USER, LIBRARY
 * 
 * [referrer table]
 *     LENDING, LENDING_COLLECTION
 * 
 * [foreign property]
 *     lbUser, library
 * 
 * [referrer property]
 *     lendingList, lendingCollectionList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer libraryId = entity.getLibraryId();
 * Integer lbUserId = entity.getLbUserId();
 * String rUser = entity.getRUser();
 * String rModule = entity.getRModule();
 * java.sql.Timestamp rTimestamp = entity.getRTimestamp();
 * String uUser = entity.getUUser();
 * String uModule = entity.getUModule();
 * java.sql.Timestamp uTimestamp = entity.getUTimestamp();
 * entity.setLibraryId(libraryId);
 * entity.setLbUserId(lbUserId);
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
public abstract class LdBsLibraryUser extends AbstractEntity implements DomainEntity {

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
    /** LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LIBRARY} */
    protected Integer _libraryId;

    /** LB_USER_ID: {PK, IX, NotNull, INTEGER(10), FK to LB_USER} */
    protected Integer _lbUserId;

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
        return "LIBRARY_USER";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "libraryUser";
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
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** LB_USER by my LB_USER_ID, named 'lbUser'. */
    protected LdLbUser _lbUser;

    /**
     * [get] LB_USER by my LB_USER_ID, named 'lbUser'.
     * @return The entity of foreign property 'lbUser'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdLbUser getLbUser() {
        return _lbUser;
    }

    /**
     * [set] LB_USER by my LB_USER_ID, named 'lbUser'.
     * @param lbUser The entity of foreign property 'lbUser'. (NullAllowed)
     */
    public void setLbUser(LdLbUser lbUser) {
        _lbUser = lbUser;
    }

    /** LIBRARY by my LIBRARY_ID, named 'library'. */
    protected LdLibrary _library;

    /**
     * [get] LIBRARY by my LIBRARY_ID, named 'library'.
     * @return The entity of foreign property 'library'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdLibrary getLibrary() {
        return _library;
    }

    /**
     * [set] LIBRARY by my LIBRARY_ID, named 'library'.
     * @param library The entity of foreign property 'library'. (NullAllowed)
     */
    public void setLibrary(LdLibrary library) {
        _library = library;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** LENDING by LIBRARY_ID, LB_USER_ID, named 'lendingList'. */
    protected List<LdLending> _lendingList;

    /**
     * [get] LENDING by LIBRARY_ID, LB_USER_ID, named 'lendingList'.
     * @return The entity list of referrer property 'lendingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LdLending> getLendingList() {
        if (_lendingList == null) { _lendingList = newReferrerList(); }
        return _lendingList;
    }

    /**
     * [set] LENDING by LIBRARY_ID, LB_USER_ID, named 'lendingList'.
     * @param lendingList The entity list of referrer property 'lendingList'. (NullAllowed)
     */
    public void setLendingList(List<LdLending> lendingList) {
        _lendingList = lendingList;
    }

    /** LENDING_COLLECTION by LIBRARY_ID, LB_USER_ID, named 'lendingCollectionList'. */
    protected List<LdLendingCollection> _lendingCollectionList;

    /**
     * [get] LENDING_COLLECTION by LIBRARY_ID, LB_USER_ID, named 'lendingCollectionList'.
     * @return The entity list of referrer property 'lendingCollectionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LdLendingCollection> getLendingCollectionList() {
        if (_lendingCollectionList == null) { _lendingCollectionList = newReferrerList(); }
        return _lendingCollectionList;
    }

    /**
     * [set] LENDING_COLLECTION by LIBRARY_ID, LB_USER_ID, named 'lendingCollectionList'.
     * @param lendingCollectionList The entity list of referrer property 'lendingCollectionList'. (NullAllowed)
     */
    public void setLendingCollectionList(List<LdLendingCollection> lendingCollectionList) {
        _lendingCollectionList = lendingCollectionList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof LdBsLibraryUser) {
            LdBsLibraryUser other = (LdBsLibraryUser)obj;
            if (!xSV(_libraryId, other._libraryId)) { return false; }
            if (!xSV(_lbUserId, other._lbUserId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _libraryId);
        hs = xCH(hs, _lbUserId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_lbUser != null)
        { sb.append(li).append(xbRDS(_lbUser, "lbUser")); }
        if (_library != null)
        { sb.append(li).append(xbRDS(_library, "library")); }
        if (_lendingList != null) { for (LdLending et : _lendingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "lendingList")); } } }
        if (_lendingCollectionList != null) { for (LdLendingCollection et : _lendingCollectionList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "lendingCollectionList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_libraryId));
        sb.append(dm).append(xfND(_lbUserId));
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
        if (_lbUser != null)
        { sb.append(dm).append("lbUser"); }
        if (_library != null)
        { sb.append(dm).append("library"); }
        if (_lendingList != null && !_lendingList.isEmpty())
        { sb.append(dm).append("lendingList"); }
        if (_lendingCollectionList != null && !_lendingCollectionList.isEmpty())
        { sb.append(dm).append("lendingCollectionList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LdLibraryUser clone() {
        return (LdLibraryUser)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LIBRARY} <br />
     * @return The value of the column 'LIBRARY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLibraryId() {
        checkSpecifiedProperty("libraryId");
        return _libraryId;
    }

    /**
     * [set] LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LIBRARY} <br />
     * @param libraryId The value of the column 'LIBRARY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLibraryId(Integer libraryId) {
        registerModifiedProperty("libraryId");
        _libraryId = libraryId;
    }

    /**
     * [get] LB_USER_ID: {PK, IX, NotNull, INTEGER(10), FK to LB_USER} <br />
     * @return The value of the column 'LB_USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLbUserId() {
        checkSpecifiedProperty("lbUserId");
        return _lbUserId;
    }

    /**
     * [set] LB_USER_ID: {PK, IX, NotNull, INTEGER(10), FK to LB_USER} <br />
     * @param lbUserId The value of the column 'LB_USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLbUserId(Integer lbUserId) {
        registerModifiedProperty("lbUserId");
        _lbUserId = lbUserId;
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
