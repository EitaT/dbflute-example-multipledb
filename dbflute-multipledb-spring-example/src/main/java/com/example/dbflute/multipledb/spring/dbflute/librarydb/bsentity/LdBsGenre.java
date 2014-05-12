/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
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
public abstract class LdBsGenre implements Entity, Serializable, Cloneable {

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
     * GENRE by my PARENT_GENRE_CODE, named 'genreSelf'.
     * @return The entity of foreign property 'genreSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdGenre getGenreSelf() {
        return _genreSelf;
    }

    /**
     * GENRE by my PARENT_GENRE_CODE, named 'genreSelf'.
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
     * BOOK by GENRE_CODE, named 'bookList'.
     * @return The entity list of referrer property 'bookList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LdBook> getBookList() {
        if (_bookList == null) { _bookList = newReferrerList(); }
        return _bookList;
    }

    /**
     * BOOK by GENRE_CODE, named 'bookList'.
     * @param bookList The entity list of referrer property 'bookList'. (NullAllowed)
     */
    public void setBookList(List<LdBook> bookList) {
        _bookList = bookList;
    }

    /** GENRE by PARENT_GENRE_CODE, named 'genreSelfList'. */
    protected List<LdGenre> _genreSelfList;

    /**
     * GENRE by PARENT_GENRE_CODE, named 'genreSelfList'.
     * @return The entity list of referrer property 'genreSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LdGenre> getGenreSelfList() {
        if (_genreSelfList == null) { _genreSelfList = newReferrerList(); }
        return _genreSelfList;
    }

    /**
     * GENRE by PARENT_GENRE_CODE, named 'genreSelfList'.
     * @param genreSelfList The entity list of referrer property 'genreSelfList'. (NullAllowed)
     */
    public void setGenreSelfList(List<LdGenre> genreSelfList) {
        _genreSelfList = genreSelfList;
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
        if (obj == null || !(obj instanceof LdBsGenre)) { return false; }
        LdBsGenre other = (LdBsGenre)obj;
        if (!xSV(getGenreCode(), other.getGenreCode())) { return false; }
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
        result = xCH(result, getGenreCode());
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
        if (_genreSelf != null)
        { sb.append(l).append(xbRDS(_genreSelf, "genreSelf")); }
        if (_bookList != null) { for (Entity e : _bookList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "bookList")); } } }
        if (_genreSelfList != null) { for (Entity e : _genreSelfList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "genreSelfList")); } } }
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
        sb.append(delimiter).append(getGenreCode());
        sb.append(delimiter).append(getGenreName());
        sb.append(delimiter).append(getHierarchyLevel());
        sb.append(delimiter).append(getHierarchyOrder());
        sb.append(delimiter).append(getParentGenreCode());
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
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_genreSelf != null) { sb.append(c).append("genreSelf"); }
        if (_bookList != null && !_bookList.isEmpty())
        { sb.append(c).append("bookList"); }
        if (_genreSelfList != null && !_genreSelfList.isEmpty())
        { sb.append(c).append("genreSelfList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public LdGenre clone() {
        try {
            return (LdGenre)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] GENRE_CODE: {PK, NotNull, VARCHAR(24)} <br />
     * @return The value of the column 'GENRE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getGenreCode() {
        return _genreCode;
    }

    /**
     * [set] GENRE_CODE: {PK, NotNull, VARCHAR(24)} <br />
     * @param genreCode The value of the column 'GENRE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setGenreCode(String genreCode) {
        __modifiedProperties.addPropertyName("genreCode");
        this._genreCode = genreCode;
    }

    /**
     * [get] GENRE_NAME: {NotNull, VARCHAR(80)} <br />
     * @return The value of the column 'GENRE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getGenreName() {
        return _genreName;
    }

    /**
     * [set] GENRE_NAME: {NotNull, VARCHAR(80)} <br />
     * @param genreName The value of the column 'GENRE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setGenreName(String genreName) {
        __modifiedProperties.addPropertyName("genreName");
        this._genreName = genreName;
    }

    /**
     * [get] HIERARCHY_LEVEL: {NotNull, NUMERIC(9)} <br />
     * @return The value of the column 'HIERARCHY_LEVEL'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getHierarchyLevel() {
        return _hierarchyLevel;
    }

    /**
     * [set] HIERARCHY_LEVEL: {NotNull, NUMERIC(9)} <br />
     * @param hierarchyLevel The value of the column 'HIERARCHY_LEVEL'. (basically NotNull if update: for the constraint)
     */
    public void setHierarchyLevel(java.math.BigDecimal hierarchyLevel) {
        __modifiedProperties.addPropertyName("hierarchyLevel");
        this._hierarchyLevel = hierarchyLevel;
    }

    /**
     * [get] HIERARCHY_ORDER: {NotNull, NUMERIC(10)} <br />
     * @return The value of the column 'HIERARCHY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getHierarchyOrder() {
        return _hierarchyOrder;
    }

    /**
     * [set] HIERARCHY_ORDER: {NotNull, NUMERIC(10)} <br />
     * @param hierarchyOrder The value of the column 'HIERARCHY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setHierarchyOrder(java.math.BigDecimal hierarchyOrder) {
        __modifiedProperties.addPropertyName("hierarchyOrder");
        this._hierarchyOrder = hierarchyOrder;
    }

    /**
     * [get] PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE} <br />
     * @return The value of the column 'PARENT_GENRE_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getParentGenreCode() {
        return _parentGenreCode;
    }

    /**
     * [set] PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE} <br />
     * @param parentGenreCode The value of the column 'PARENT_GENRE_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParentGenreCode(String parentGenreCode) {
        __modifiedProperties.addPropertyName("parentGenreCode");
        this._parentGenreCode = parentGenreCode;
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
