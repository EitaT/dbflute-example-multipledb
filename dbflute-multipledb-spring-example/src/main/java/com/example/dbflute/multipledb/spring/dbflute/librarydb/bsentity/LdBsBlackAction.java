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
public abstract class LdBsBlackAction extends AbstractEntity implements DomainEntity {

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
    //                                                                    Foreign Property
    //                                                                    ================
    /** BLACK_LIST by my BLACK_LIST_ID, named 'blackList'. */
    protected LdBlackList _blackList;

    /**
     * [get] BLACK_LIST by my BLACK_LIST_ID, named 'blackList'.
     * @return The entity of foreign property 'blackList'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdBlackList getBlackList() {
        return _blackList;
    }

    /**
     * [set] BLACK_LIST by my BLACK_LIST_ID, named 'blackList'.
     * @param blackList The entity of foreign property 'blackList'. (NullAllowed)
     */
    public void setBlackList(LdBlackList blackList) {
        _blackList = blackList;
    }

    /** BLACK_ACTION_LOOKUP by my BLACK_ACTION_CODE, named 'blackActionLookup'. */
    protected LdBlackActionLookup _blackActionLookup;

    /**
     * [get] BLACK_ACTION_LOOKUP by my BLACK_ACTION_CODE, named 'blackActionLookup'.
     * @return The entity of foreign property 'blackActionLookup'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdBlackActionLookup getBlackActionLookup() {
        return _blackActionLookup;
    }

    /**
     * [set] BLACK_ACTION_LOOKUP by my BLACK_ACTION_CODE, named 'blackActionLookup'.
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
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof LdBsBlackAction) {
            LdBsBlackAction other = (LdBsBlackAction)obj;
            if (!xSV(_blackActionId, other._blackActionId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _blackActionId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_blackList != null)
        { sb.append(li).append(xbRDS(_blackList, "blackList")); }
        if (_blackActionLookup != null)
        { sb.append(li).append(xbRDS(_blackActionLookup, "blackActionLookup")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_blackActionId));
        sb.append(dm).append(xfND(_blackListId));
        sb.append(dm).append(xfND(_blackActionCode));
        sb.append(dm).append(xfND(_blackLevel));
        sb.append(dm).append(xfND(_actionDate));
        sb.append(dm).append(xfBA(_evidencePhotograph));
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
        if (_blackList != null)
        { sb.append(dm).append("blackList"); }
        if (_blackActionLookup != null)
        { sb.append(dm).append("blackActionLookup"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LdBlackAction clone() {
        return (LdBlackAction)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'BLACK_ACTION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBlackActionId() {
        checkSpecifiedProperty("blackActionId");
        return _blackActionId;
    }

    /**
     * [set] BLACK_ACTION_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @param blackActionId The value of the column 'BLACK_ACTION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBlackActionId(Integer blackActionId) {
        registerModifiedProperty("blackActionId");
        _blackActionId = blackActionId;
    }

    /**
     * [get] BLACK_LIST_ID: {IX, NotNull, INTEGER(10), FK to BLACK_LIST} <br />
     * @return The value of the column 'BLACK_LIST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBlackListId() {
        checkSpecifiedProperty("blackListId");
        return _blackListId;
    }

    /**
     * [set] BLACK_LIST_ID: {IX, NotNull, INTEGER(10), FK to BLACK_LIST} <br />
     * @param blackListId The value of the column 'BLACK_LIST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBlackListId(Integer blackListId) {
        registerModifiedProperty("blackListId");
        _blackListId = blackListId;
    }

    /**
     * [get] BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP} <br />
     * @return The value of the column 'BLACK_ACTION_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getBlackActionCode() {
        checkSpecifiedProperty("blackActionCode");
        return _blackActionCode;
    }

    /**
     * [set] BLACK_ACTION_CODE: {IX, NotNull, CHAR(3), FK to BLACK_ACTION_LOOKUP} <br />
     * @param blackActionCode The value of the column 'BLACK_ACTION_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setBlackActionCode(String blackActionCode) {
        registerModifiedProperty("blackActionCode");
        _blackActionCode = blackActionCode;
    }

    /**
     * [get] BLACK_LEVEL: {NotNull, SMALLINT(5)} <br />
     * @return The value of the column 'BLACK_LEVEL'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBlackLevel() {
        checkSpecifiedProperty("blackLevel");
        return _blackLevel;
    }

    /**
     * [set] BLACK_LEVEL: {NotNull, SMALLINT(5)} <br />
     * @param blackLevel The value of the column 'BLACK_LEVEL'. (basically NotNull if update: for the constraint)
     */
    public void setBlackLevel(Integer blackLevel) {
        registerModifiedProperty("blackLevel");
        _blackLevel = blackLevel;
    }

    /**
     * [get] ACTION_DATE: {TIMESTAMP(26, 6)} <br />
     * @return The value of the column 'ACTION_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getActionDate() {
        checkSpecifiedProperty("actionDate");
        return _actionDate;
    }

    /**
     * [set] ACTION_DATE: {TIMESTAMP(26, 6)} <br />
     * @param actionDate The value of the column 'ACTION_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setActionDate(java.sql.Timestamp actionDate) {
        registerModifiedProperty("actionDate");
        _actionDate = actionDate;
    }

    /**
     * [get] EVIDENCE_PHOTOGRAPH: {BLOB(2147483647)} <br />
     * @return The value of the column 'EVIDENCE_PHOTOGRAPH'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getEvidencePhotograph() {
        checkSpecifiedProperty("evidencePhotograph");
        return _evidencePhotograph;
    }

    /**
     * [set] EVIDENCE_PHOTOGRAPH: {BLOB(2147483647)} <br />
     * @param evidencePhotograph The value of the column 'EVIDENCE_PHOTOGRAPH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEvidencePhotograph(byte[] evidencePhotograph) {
        registerModifiedProperty("evidencePhotograph");
        _evidencePhotograph = evidencePhotograph;
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
