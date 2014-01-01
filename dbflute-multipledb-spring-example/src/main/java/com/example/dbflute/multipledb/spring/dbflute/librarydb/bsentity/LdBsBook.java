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
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdCDef;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;

/**
 * The entity of BOOK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     BOOK_ID
 * 
 * [column]
 *     BOOK_ID, ISBN, BOOK_NAME, AUTHOR_ID, PUBLISHER_ID, GENRE_CODE, OPENING_PART, MAX_LENDING_DATE_COUNT, OUT_OF_USER_SELECT_YN, OUT_OF_USER_SELECT_REASON, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     BOOK_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     AUTHOR, GENRE, PUBLISHER, COLLECTION_STATUS_LOOKUP(AsNonExist)
 * 
 * [referrer table]
 *     COLLECTION
 * 
 * [foreign property]
 *     author, genre, publisher, collectionStatusLookupAsNonExist
 * 
 * [referrer property]
 *     collectionList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer bookId = entity.getBookId();
 * String isbn = entity.getIsbn();
 * String bookName = entity.getBookName();
 * Integer authorId = entity.getAuthorId();
 * Integer publisherId = entity.getPublisherId();
 * String genreCode = entity.getGenreCode();
 * String openingPart = entity.getOpeningPart();
 * Integer maxLendingDateCount = entity.getMaxLendingDateCount();
 * String outOfUserSelectYn = entity.getOutOfUserSelectYn();
 * String outOfUserSelectReason = entity.getOutOfUserSelectReason();
 * String rUser = entity.getRUser();
 * String rModule = entity.getRModule();
 * java.sql.Timestamp rTimestamp = entity.getRTimestamp();
 * String uUser = entity.getUUser();
 * String uModule = entity.getUModule();
 * java.sql.Timestamp uTimestamp = entity.getUTimestamp();
 * entity.setBookId(bookId);
 * entity.setIsbn(isbn);
 * entity.setBookName(bookName);
 * entity.setAuthorId(authorId);
 * entity.setPublisherId(publisherId);
 * entity.setGenreCode(genreCode);
 * entity.setOpeningPart(openingPart);
 * entity.setMaxLendingDateCount(maxLendingDateCount);
 * entity.setOutOfUserSelectYn(outOfUserSelectYn);
 * entity.setOutOfUserSelectReason(outOfUserSelectReason);
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
public abstract class LdBsBook implements Entity, Serializable, Cloneable {

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
    /** BOOK_ID: {PK, ID, NotNull, INTEGER(10)} */
    protected Integer _bookId;

    /** ISBN: {UQ, NotNull, VARCHAR(20)} */
    protected String _isbn;

    /** BOOK_NAME: {NotNull, VARCHAR(80)} */
    protected String _bookName;

    /** AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR} */
    protected Integer _authorId;

    /** PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER} */
    protected Integer _publisherId;

    /** GENRE_CODE: {IX, VARCHAR(24), FK to GENRE} */
    protected String _genreCode;

    /** OPENING_PART: {CLOB(2147483647)} */
    protected String _openingPart;

    /** MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)} */
    protected Integer _maxLendingDateCount;

    /** OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo} */
    protected String _outOfUserSelectYn;

    /** OUT_OF_USER_SELECT_REASON: {VARCHAR(200)} */
    protected String _outOfUserSelectReason;

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
        return "BOOK";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "book";
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
        if (getBookId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of outOfUserSelectYn as the classification of YesNo. <br />
     * OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo} <br />
     * はいいいえを示す
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public LdCDef.YesNo getOutOfUserSelectYnAsYesNo() {
        return LdCDef.YesNo.codeOf(getOutOfUserSelectYn());
    }

    /**
     * Set the value of outOfUserSelectYn as the classification of YesNo. <br />
     * OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo} <br />
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
    /** AUTHOR by my AUTHOR_ID, named 'author'. */
    protected LdAuthor _author;

    /**
     * AUTHOR by my AUTHOR_ID, named 'author'.
     * @return The entity of foreign property 'author'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdAuthor getAuthor() {
        return _author;
    }

    /**
     * AUTHOR by my AUTHOR_ID, named 'author'.
     * @param author The entity of foreign property 'author'. (NullAllowed)
     */
    public void setAuthor(LdAuthor author) {
        _author = author;
    }

    /** GENRE by my GENRE_CODE, named 'genre'. */
    protected LdGenre _genre;

    /**
     * GENRE by my GENRE_CODE, named 'genre'.
     * @return The entity of foreign property 'genre'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdGenre getGenre() {
        return _genre;
    }

    /**
     * GENRE by my GENRE_CODE, named 'genre'.
     * @param genre The entity of foreign property 'genre'. (NullAllowed)
     */
    public void setGenre(LdGenre genre) {
        _genre = genre;
    }

    /** PUBLISHER by my PUBLISHER_ID, named 'publisher'. */
    protected LdPublisher _publisher;

    /**
     * PUBLISHER by my PUBLISHER_ID, named 'publisher'.
     * @return The entity of foreign property 'publisher'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdPublisher getPublisher() {
        return _publisher;
    }

    /**
     * PUBLISHER by my PUBLISHER_ID, named 'publisher'.
     * @param publisher The entity of foreign property 'publisher'. (NullAllowed)
     */
    public void setPublisher(LdPublisher publisher) {
        _publisher = publisher;
    }

    /** COLLECTION_STATUS_LOOKUP by my GENRE_CODE, named 'collectionStatusLookupAsNonExist'. */
    protected LdCollectionStatusLookup _collectionStatusLookupAsNonExist;

    /**
     * COLLECTION_STATUS_LOOKUP by my GENRE_CODE, named 'collectionStatusLookupAsNonExist'.
     * @return The entity of foreign property 'collectionStatusLookupAsNonExist'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdCollectionStatusLookup getCollectionStatusLookupAsNonExist() {
        return _collectionStatusLookupAsNonExist;
    }

    /**
     * COLLECTION_STATUS_LOOKUP by my GENRE_CODE, named 'collectionStatusLookupAsNonExist'.
     * @param collectionStatusLookupAsNonExist The entity of foreign property 'collectionStatusLookupAsNonExist'. (NullAllowed)
     */
    public void setCollectionStatusLookupAsNonExist(LdCollectionStatusLookup collectionStatusLookupAsNonExist) {
        _collectionStatusLookupAsNonExist = collectionStatusLookupAsNonExist;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** COLLECTION by BOOK_ID, named 'collectionList'. */
    protected List<LdCollection> _collectionList;

    /**
     * COLLECTION by BOOK_ID, named 'collectionList'.
     * @return The entity list of referrer property 'collectionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LdCollection> getCollectionList() {
        if (_collectionList == null) { _collectionList = newReferrerList(); }
        return _collectionList;
    }

    /**
     * COLLECTION by BOOK_ID, named 'collectionList'.
     * @param collectionList The entity list of referrer property 'collectionList'. (NullAllowed)
     */
    public void setCollectionList(List<LdCollection> collectionList) {
        _collectionList = collectionList;
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
     * @param other The other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof LdBsBook)) { return false; }
        LdBsBook otherEntity = (LdBsBook)other;
        if (!xSV(getBookId(), otherEntity.getBookId())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getBookId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
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
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String l = "\n  ";
        if (_author != null)
        { sb.append(l).append(xbRDS(_author, "author")); }
        if (_genre != null)
        { sb.append(l).append(xbRDS(_genre, "genre")); }
        if (_publisher != null)
        { sb.append(l).append(xbRDS(_publisher, "publisher")); }
        if (_collectionStatusLookupAsNonExist != null)
        { sb.append(l).append(xbRDS(_collectionStatusLookupAsNonExist, "collectionStatusLookupAsNonExist")); }
        if (_collectionList != null) { for (Entity e : _collectionList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "collectionList")); } } }
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
        sb.append(delimiter).append(getBookId());
        sb.append(delimiter).append(getIsbn());
        sb.append(delimiter).append(getBookName());
        sb.append(delimiter).append(getAuthorId());
        sb.append(delimiter).append(getPublisherId());
        sb.append(delimiter).append(getGenreCode());
        sb.append(delimiter).append(getOpeningPart());
        sb.append(delimiter).append(getMaxLendingDateCount());
        sb.append(delimiter).append(getOutOfUserSelectYn());
        sb.append(delimiter).append(getOutOfUserSelectReason());
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
        if (_author != null) { sb.append(c).append("author"); }
        if (_genre != null) { sb.append(c).append("genre"); }
        if (_publisher != null) { sb.append(c).append("publisher"); }
        if (_collectionStatusLookupAsNonExist != null) { sb.append(c).append("collectionStatusLookupAsNonExist"); }
        if (_collectionList != null && !_collectionList.isEmpty())
        { sb.append(c).append("collectionList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public LdBook clone() {
        try {
            return (LdBook)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BOOK_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'BOOK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBookId() {
        return _bookId;
    }

    /**
     * [set] BOOK_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @param bookId The value of the column 'BOOK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBookId(Integer bookId) {
        __modifiedProperties.addPropertyName("bookId");
        this._bookId = bookId;
    }

    /**
     * [get] ISBN: {UQ, NotNull, VARCHAR(20)} <br />
     * @return The value of the column 'ISBN'. (basically NotNull if selected: for the constraint)
     */
    public String getIsbn() {
        return _isbn;
    }

    /**
     * [set] ISBN: {UQ, NotNull, VARCHAR(20)} <br />
     * @param isbn The value of the column 'ISBN'. (basically NotNull if update: for the constraint)
     */
    public void setIsbn(String isbn) {
        __modifiedProperties.addPropertyName("isbn");
        this._isbn = isbn;
    }

    /**
     * [get] BOOK_NAME: {NotNull, VARCHAR(80)} <br />
     * @return The value of the column 'BOOK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getBookName() {
        return _bookName;
    }

    /**
     * [set] BOOK_NAME: {NotNull, VARCHAR(80)} <br />
     * @param bookName The value of the column 'BOOK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setBookName(String bookName) {
        __modifiedProperties.addPropertyName("bookName");
        this._bookName = bookName;
    }

    /**
     * [get] AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR} <br />
     * @return The value of the column 'AUTHOR_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAuthorId() {
        return _authorId;
    }

    /**
     * [set] AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR} <br />
     * @param authorId The value of the column 'AUTHOR_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAuthorId(Integer authorId) {
        __modifiedProperties.addPropertyName("authorId");
        this._authorId = authorId;
    }

    /**
     * [get] PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER} <br />
     * @return The value of the column 'PUBLISHER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPublisherId() {
        return _publisherId;
    }

    /**
     * [set] PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER} <br />
     * @param publisherId The value of the column 'PUBLISHER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPublisherId(Integer publisherId) {
        __modifiedProperties.addPropertyName("publisherId");
        this._publisherId = publisherId;
    }

    /**
     * [get] GENRE_CODE: {IX, VARCHAR(24), FK to GENRE} <br />
     * @return The value of the column 'GENRE_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getGenreCode() {
        return _genreCode;
    }

    /**
     * [set] GENRE_CODE: {IX, VARCHAR(24), FK to GENRE} <br />
     * @param genreCode The value of the column 'GENRE_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGenreCode(String genreCode) {
        __modifiedProperties.addPropertyName("genreCode");
        this._genreCode = genreCode;
    }

    /**
     * [get] OPENING_PART: {CLOB(2147483647)} <br />
     * @return The value of the column 'OPENING_PART'. (NullAllowed even if selected: for no constraint)
     */
    public String getOpeningPart() {
        return _openingPart;
    }

    /**
     * [set] OPENING_PART: {CLOB(2147483647)} <br />
     * @param openingPart The value of the column 'OPENING_PART'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOpeningPart(String openingPart) {
        __modifiedProperties.addPropertyName("openingPart");
        this._openingPart = openingPart;
    }

    /**
     * [get] MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)} <br />
     * @return The value of the column 'MAX_LENDING_DATE_COUNT'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMaxLendingDateCount() {
        return _maxLendingDateCount;
    }

    /**
     * [set] MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)} <br />
     * @param maxLendingDateCount The value of the column 'MAX_LENDING_DATE_COUNT'. (basically NotNull if update: for the constraint)
     */
    public void setMaxLendingDateCount(Integer maxLendingDateCount) {
        __modifiedProperties.addPropertyName("maxLendingDateCount");
        this._maxLendingDateCount = maxLendingDateCount;
    }

    /**
     * [get] OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo} <br />
     * @return The value of the column 'OUT_OF_USER_SELECT_YN'. (basically NotNull if selected: for the constraint)
     */
    public String getOutOfUserSelectYn() {
        return _outOfUserSelectYn;
    }

    /**
     * [set] OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo} <br />
     * @param outOfUserSelectYn The value of the column 'OUT_OF_USER_SELECT_YN'. (basically NotNull if update: for the constraint)
     */
    public void setOutOfUserSelectYn(String outOfUserSelectYn) {
        __modifiedProperties.addPropertyName("outOfUserSelectYn");
        this._outOfUserSelectYn = outOfUserSelectYn;
    }

    /**
     * [get] OUT_OF_USER_SELECT_REASON: {VARCHAR(200)} <br />
     * @return The value of the column 'OUT_OF_USER_SELECT_REASON'. (NullAllowed even if selected: for no constraint)
     */
    public String getOutOfUserSelectReason() {
        return _outOfUserSelectReason;
    }

    /**
     * [set] OUT_OF_USER_SELECT_REASON: {VARCHAR(200)} <br />
     * @param outOfUserSelectReason The value of the column 'OUT_OF_USER_SELECT_REASON'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOutOfUserSelectReason(String outOfUserSelectReason) {
        __modifiedProperties.addPropertyName("outOfUserSelectReason");
        this._outOfUserSelectReason = outOfUserSelectReason;
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
