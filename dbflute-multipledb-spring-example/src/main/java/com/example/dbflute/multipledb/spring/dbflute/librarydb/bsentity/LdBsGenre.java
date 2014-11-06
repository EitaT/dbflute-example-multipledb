/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdDBMetaInstanceHandler;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;

/**
 * The entity of GENRE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     GENRE_CODE
 * 
 * [column]
 *     GENRE_CODE, GENRE_NAME, HIERARCHY_LEVEL, HIERARCHY_ORDER, PARENT_GENRE_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     GENRE
 * 
 * [referrer table]
 *     BOOK, GENRE
 * 
 * [foreign property]
 *     genreSelf
 * 
 * [referrer property]
 *     bookList, genreSelfList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String genreCode = entity.getGenreCode();
 * String genreName = entity.getGenreName();
 * java.math.BigDecimal hierarchyLevel = entity.getHierarchyLevel();
 * java.math.BigDecimal hierarchyOrder = entity.getHierarchyOrder();
 * String parentGenreCode = entity.getParentGenreCode();
 * String rUser = entity.getRUser();
 * String rModule = entity.getRModule();
 * java.sql.Timestamp rTimestamp = entity.getRTimestamp();
 * String uUser = entity.getUUser();
 * String uModule = entity.getUModule();
 * java.sql.Timestamp uTimestamp = entity.getUTimestamp();
 * entity.setGenreCode(genreCode);
 * entity.setGenreName(genreName);
 * entity.setHierarchyLevel(hierarchyLevel);
 * entity.setHierarchyOrder(hierarchyOrder);
 * entity.setParentGenreCode(parentGenreCode);
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
public abstract class LdBsGenre extends AbstractEntity {

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
    /** GENRE_CODE: {PK, NotNull, VARCHAR(24)} */
    protected String _genreCode;

    /** GENRE_NAME: {NotNull, VARCHAR(80)} */
    protected String _genreName;

    /** HIERARCHY_LEVEL: {NotNull, NUMERIC(9)} */
    protected java.math.BigDecimal _hierarchyLevel;

    /** HIERARCHY_ORDER: {NotNull, NUMERIC(10)} */
    protected java.math.BigDecimal _hierarchyOrder;

    /** PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE} */
    protected String _parentGenreCode;

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
        return "GENRE";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "genre";
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
        if (getGenreCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** GENRE by my PARENT_GENRE_CODE, named 'genreSelf'. */
    protected LdGenre _genreSelf;

    /**
     * [get] GENRE by my PARENT_GENRE_CODE, named 'genreSelf'.
     * @return The entity of foreign property 'genreSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdGenre getGenreSelf() {
        return _genreSelf;
    }

    /**
     * [set] GENRE by my PARENT_GENRE_CODE, named 'genreSelf'.
     * @param genreSelf The entity of foreign property 'genreSelf'. (NullAllowed)
     */
    public void setGenreSelf(LdGenre genreSelf) {
        _genreSelf = genreSelf;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** BOOK by GENRE_CODE, named 'bookList'. */
    protected List<LdBook> _bookList;

    /**
     * [get] BOOK by GENRE_CODE, named 'bookList'.
     * @return The entity list of referrer property 'bookList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LdBook> getBookList() {
        if (_bookList == null) { _bookList = newReferrerList(); }
        return _bookList;
    }

    /**
     * [set] BOOK by GENRE_CODE, named 'bookList'.
     * @param bookList The entity list of referrer property 'bookList'. (NullAllowed)
     */
    public void setBookList(List<LdBook> bookList) {
        _bookList = bookList;
    }

    /** GENRE by PARENT_GENRE_CODE, named 'genreSelfList'. */
    protected List<LdGenre> _genreSelfList;

    /**
     * [get] GENRE by PARENT_GENRE_CODE, named 'genreSelfList'.
     * @return The entity list of referrer property 'genreSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LdGenre> getGenreSelfList() {
        if (_genreSelfList == null) { _genreSelfList = newReferrerList(); }
        return _genreSelfList;
    }

    /**
     * [set] GENRE by PARENT_GENRE_CODE, named 'genreSelfList'.
     * @param genreSelfList The entity list of referrer property 'genreSelfList'. (NullAllowed)
     */
    public void setGenreSelfList(List<LdGenre> genreSelfList) {
        _genreSelfList = genreSelfList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof LdBsGenre) {
            LdBsGenre other = (LdBsGenre)obj;
            if (!xSV(_genreCode, other._genreCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _genreCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_genreSelf != null)
        { sb.append(li).append(xbRDS(_genreSelf, "genreSelf")); }
        if (_bookList != null) { for (LdBook et : _bookList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bookList")); } } }
        if (_genreSelfList != null) { for (LdGenre et : _genreSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "genreSelfList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_genreCode));
        sb.append(dm).append(xfND(_genreName));
        sb.append(dm).append(xfND(_hierarchyLevel));
        sb.append(dm).append(xfND(_hierarchyOrder));
        sb.append(dm).append(xfND(_parentGenreCode));
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
        if (_genreSelf != null)
        { sb.append(dm).append("genreSelf"); }
        if (_bookList != null && !_bookList.isEmpty())
        { sb.append(dm).append("bookList"); }
        if (_genreSelfList != null && !_genreSelfList.isEmpty())
        { sb.append(dm).append("genreSelfList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LdGenre clone() {
        return (LdGenre)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] GENRE_CODE: {PK, NotNull, VARCHAR(24)} <br />
     * @return The value of the column 'GENRE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getGenreCode() {
        checkSpecifiedProperty("genreCode");
        return _genreCode;
    }

    /**
     * [set] GENRE_CODE: {PK, NotNull, VARCHAR(24)} <br />
     * @param genreCode The value of the column 'GENRE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setGenreCode(String genreCode) {
        registerModifiedProperty("genreCode");
        _genreCode = genreCode;
    }

    /**
     * [get] GENRE_NAME: {NotNull, VARCHAR(80)} <br />
     * @return The value of the column 'GENRE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getGenreName() {
        checkSpecifiedProperty("genreName");
        return _genreName;
    }

    /**
     * [set] GENRE_NAME: {NotNull, VARCHAR(80)} <br />
     * @param genreName The value of the column 'GENRE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setGenreName(String genreName) {
        registerModifiedProperty("genreName");
        _genreName = genreName;
    }

    /**
     * [get] HIERARCHY_LEVEL: {NotNull, NUMERIC(9)} <br />
     * @return The value of the column 'HIERARCHY_LEVEL'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getHierarchyLevel() {
        checkSpecifiedProperty("hierarchyLevel");
        return _hierarchyLevel;
    }

    /**
     * [set] HIERARCHY_LEVEL: {NotNull, NUMERIC(9)} <br />
     * @param hierarchyLevel The value of the column 'HIERARCHY_LEVEL'. (basically NotNull if update: for the constraint)
     */
    public void setHierarchyLevel(java.math.BigDecimal hierarchyLevel) {
        registerModifiedProperty("hierarchyLevel");
        _hierarchyLevel = hierarchyLevel;
    }

    /**
     * [get] HIERARCHY_ORDER: {NotNull, NUMERIC(10)} <br />
     * @return The value of the column 'HIERARCHY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getHierarchyOrder() {
        checkSpecifiedProperty("hierarchyOrder");
        return _hierarchyOrder;
    }

    /**
     * [set] HIERARCHY_ORDER: {NotNull, NUMERIC(10)} <br />
     * @param hierarchyOrder The value of the column 'HIERARCHY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setHierarchyOrder(java.math.BigDecimal hierarchyOrder) {
        registerModifiedProperty("hierarchyOrder");
        _hierarchyOrder = hierarchyOrder;
    }

    /**
     * [get] PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE} <br />
     * @return The value of the column 'PARENT_GENRE_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getParentGenreCode() {
        checkSpecifiedProperty("parentGenreCode");
        return _parentGenreCode;
    }

    /**
     * [set] PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE} <br />
     * @param parentGenreCode The value of the column 'PARENT_GENRE_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParentGenreCode(String parentGenreCode) {
        registerModifiedProperty("parentGenreCode");
        _parentGenreCode = parentGenreCode;
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
