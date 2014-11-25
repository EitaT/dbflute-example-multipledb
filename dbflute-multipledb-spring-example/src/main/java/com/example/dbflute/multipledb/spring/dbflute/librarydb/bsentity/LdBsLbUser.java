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
 * The entity of LB_USER as TABLE. <br />
 * <pre>
 * [primary-key]
 *     LB_USER_ID
 * 
 * [column]
 *     LB_USER_ID, LB_USER_NAME, USER_PASSWORD, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     LB_USER_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     BLACK_LIST(AsOne)
 * 
 * [referrer table]
 *     LIBRARY_USER, BLACK_LIST
 * 
 * [foreign property]
 *     blackListAsOne
 * 
 * [referrer property]
 *     libraryUserList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer lbUserId = entity.getLbUserId();
 * String lbUserName = entity.getLbUserName();
 * String userPassword = entity.getUserPassword();
 * String rUser = entity.getRUser();
 * String rModule = entity.getRModule();
 * java.sql.Timestamp rTimestamp = entity.getRTimestamp();
 * String uUser = entity.getUUser();
 * String uModule = entity.getUModule();
 * java.sql.Timestamp uTimestamp = entity.getUTimestamp();
 * entity.setLbUserId(lbUserId);
 * entity.setLbUserName(lbUserName);
 * entity.setUserPassword(userPassword);
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
public abstract class LdBsLbUser extends AbstractEntity implements DomainEntity {

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
    /** LB_USER_ID: {PK, ID, NotNull, INTEGER(10)} */
    protected Integer _lbUserId;

    /** LB_USER_NAME: {NotNull, VARCHAR(80)} */
    protected String _lbUserName;

    /** USER_PASSWORD: {NotNull, VARCHAR(50)} */
    protected String _userPassword;

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
        return "LB_USER";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "lbUser";
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
        if (getLbUserId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** BLACK_LIST by LB_USER_ID, named 'blackListAsOne'. */
    protected LdBlackList _blackListAsOne;

    /**
     * [get] BLACK_LIST by LB_USER_ID, named 'blackListAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'blackListAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public LdBlackList getBlackListAsOne() {
        return _blackListAsOne;
    }

    /**
     * [set] BLACK_LIST by LB_USER_ID, named 'blackListAsOne'.
     * @param blackListAsOne The entity of foreign property(referrer-as-one) 'blackListAsOne'. (NullAllowed)
     */
    public void setBlackListAsOne(LdBlackList blackListAsOne) {
        _blackListAsOne = blackListAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** LIBRARY_USER by LB_USER_ID, named 'libraryUserList'. */
    protected List<LdLibraryUser> _libraryUserList;

    /**
     * [get] LIBRARY_USER by LB_USER_ID, named 'libraryUserList'.
     * @return The entity list of referrer property 'libraryUserList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LdLibraryUser> getLibraryUserList() {
        if (_libraryUserList == null) { _libraryUserList = newReferrerList(); }
        return _libraryUserList;
    }

    /**
     * [set] LIBRARY_USER by LB_USER_ID, named 'libraryUserList'.
     * @param libraryUserList The entity list of referrer property 'libraryUserList'. (NullAllowed)
     */
    public void setLibraryUserList(List<LdLibraryUser> libraryUserList) {
        _libraryUserList = libraryUserList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof LdBsLbUser) {
            LdBsLbUser other = (LdBsLbUser)obj;
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
        hs = xCH(hs, _lbUserId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_blackListAsOne != null)
        { sb.append(li).append(xbRDS(_blackListAsOne, "blackListAsOne")); }
        if (_libraryUserList != null) { for (LdLibraryUser et : _libraryUserList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "libraryUserList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_lbUserId));
        sb.append(dm).append(xfND(_lbUserName));
        sb.append(dm).append(xfND(_userPassword));
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
        if (_blackListAsOne != null)
        { sb.append(dm).append("blackListAsOne"); }
        if (_libraryUserList != null && !_libraryUserList.isEmpty())
        { sb.append(dm).append("libraryUserList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LdLbUser clone() {
        return (LdLbUser)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LB_USER_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'LB_USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLbUserId() {
        checkSpecifiedProperty("lbUserId");
        return _lbUserId;
    }

    /**
     * [set] LB_USER_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @param lbUserId The value of the column 'LB_USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLbUserId(Integer lbUserId) {
        registerModifiedProperty("lbUserId");
        _lbUserId = lbUserId;
    }

    /**
     * [get] LB_USER_NAME: {NotNull, VARCHAR(80)} <br />
     * @return The value of the column 'LB_USER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getLbUserName() {
        checkSpecifiedProperty("lbUserName");
        return _lbUserName;
    }

    /**
     * [set] LB_USER_NAME: {NotNull, VARCHAR(80)} <br />
     * @param lbUserName The value of the column 'LB_USER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setLbUserName(String lbUserName) {
        registerModifiedProperty("lbUserName");
        _lbUserName = lbUserName;
    }

    /**
     * [get] USER_PASSWORD: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'USER_PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    public String getUserPassword() {
        checkSpecifiedProperty("userPassword");
        return _userPassword;
    }

    /**
     * [set] USER_PASSWORD: {NotNull, VARCHAR(50)} <br />
     * @param userPassword The value of the column 'USER_PASSWORD'. (basically NotNull if update: for the constraint)
     */
    public void setUserPassword(String userPassword) {
        registerModifiedProperty("userPassword");
        _userPassword = userPassword;
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
