/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
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
public abstract class LdBsLbUser implements Entity, Serializable, Cloneable {

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
        if (obj == null || !(obj instanceof LdBsLbUser)) { return false; }
        LdBsLbUser other = (LdBsLbUser)obj;
        if (!xSV(getLbUserId(), other.getLbUserId())) { return false; }
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
        hs = xCH(hs, getLbUserId());
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
        if (_blackListAsOne != null)
        { sb.append(li).append(xbRDS(_blackListAsOne, "blackListAsOne")); }
        if (_libraryUserList != null) { for (Entity et : _libraryUserList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "libraryUserList")); } } }
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
        sb.append(dm).append(getLbUserId());
        sb.append(dm).append(getLbUserName());
        sb.append(dm).append(getUserPassword());
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
        if (_blackListAsOne != null) { sb.append(cm).append("blackListAsOne"); }
        if (_libraryUserList != null && !_libraryUserList.isEmpty())
        { sb.append(cm).append("libraryUserList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public LdLbUser clone() {
        try {
            return (LdLbUser)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LB_USER_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'LB_USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLbUserId() {
        return _lbUserId;
    }

    /**
     * [set] LB_USER_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @param lbUserId The value of the column 'LB_USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLbUserId(Integer lbUserId) {
        __modifiedProperties.addPropertyName("lbUserId");
        _lbUserId = lbUserId;
    }

    /**
     * [get] LB_USER_NAME: {NotNull, VARCHAR(80)} <br />
     * @return The value of the column 'LB_USER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getLbUserName() {
        return _lbUserName;
    }

    /**
     * [set] LB_USER_NAME: {NotNull, VARCHAR(80)} <br />
     * @param lbUserName The value of the column 'LB_USER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setLbUserName(String lbUserName) {
        __modifiedProperties.addPropertyName("lbUserName");
        _lbUserName = lbUserName;
    }

    /**
     * [get] USER_PASSWORD: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'USER_PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    public String getUserPassword() {
        return _userPassword;
    }

    /**
     * [set] USER_PASSWORD: {NotNull, VARCHAR(50)} <br />
     * @param userPassword The value of the column 'USER_PASSWORD'. (basically NotNull if update: for the constraint)
     */
    public void setUserPassword(String userPassword) {
        __modifiedProperties.addPropertyName("userPassword");
        _userPassword = userPassword;
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
