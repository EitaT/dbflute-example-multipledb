/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdEntityDefinedCommonColumn;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdDBMetaInstanceHandler;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdCDef;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.*;

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
public abstract class LdBsBook extends AbstractEntity implements LdEntityDefinedCommonColumn {

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

    /** R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType} */
    protected String _rModule;

    /** R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} */
    protected java.sql.Timestamp _rTimestamp;

    /** U_USER: {NotNull, VARCHAR(100), default=[default-user]} */
    protected String _uUser;

    /** U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType} */
    protected String _uModule;

    /** U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]} */
    protected java.sql.Timestamp _uTimestamp;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** Is common column auto set up effective? */
    protected boolean __canCommonColumnAutoSetup = true;

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

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param isbn : UQ, NotNull, VARCHAR(20). (NotNull)
     */
    public void uniqueBy(String isbn) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("isbn");
        setIsbn(isbn);
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

    /**
     * Get the value of rModule as the classification of RegisterModuleType. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType} <br />
     * 登録モジュールタイプ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public LdCDef.RegisterModuleType getRModuleAsRegisterModuleType() {
        return LdCDef.RegisterModuleType.codeOf(getRModule());
    }

    /**
     * Set the value of rModule as the classification of RegisterModuleType. <br />
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType} <br />
     * 登録モジュールタイプ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setRModuleAsRegisterModuleType(LdCDef.RegisterModuleType cdef) {
        setRModule(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of uModule as the classification of UpdateModuleType. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType} <br />
     * 更新モジュールタイプ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public LdCDef.UpdateModuleType getUModuleAsUpdateModuleType() {
        return LdCDef.UpdateModuleType.codeOf(getUModule());
    }

    /**
     * Set the value of uModule as the classification of UpdateModuleType. <br />
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType} <br />
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
    /** AUTHOR by my AUTHOR_ID, named 'author'. */
    protected LdAuthor _author;

    /**
     * [get] AUTHOR by my AUTHOR_ID, named 'author'.
     * @return The entity of foreign property 'author'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdAuthor getAuthor() {
        return _author;
    }

    /**
     * [set] AUTHOR by my AUTHOR_ID, named 'author'.
     * @param author The entity of foreign property 'author'. (NullAllowed)
     */
    public void setAuthor(LdAuthor author) {
        _author = author;
    }

    /** GENRE by my GENRE_CODE, named 'genre'. */
    protected LdGenre _genre;

    /**
     * [get] GENRE by my GENRE_CODE, named 'genre'.
     * @return The entity of foreign property 'genre'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdGenre getGenre() {
        return _genre;
    }

    /**
     * [set] GENRE by my GENRE_CODE, named 'genre'.
     * @param genre The entity of foreign property 'genre'. (NullAllowed)
     */
    public void setGenre(LdGenre genre) {
        _genre = genre;
    }

    /** PUBLISHER by my PUBLISHER_ID, named 'publisher'. */
    protected LdPublisher _publisher;

    /**
     * [get] PUBLISHER by my PUBLISHER_ID, named 'publisher'.
     * @return The entity of foreign property 'publisher'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdPublisher getPublisher() {
        return _publisher;
    }

    /**
     * [set] PUBLISHER by my PUBLISHER_ID, named 'publisher'.
     * @param publisher The entity of foreign property 'publisher'. (NullAllowed)
     */
    public void setPublisher(LdPublisher publisher) {
        _publisher = publisher;
    }

    /** COLLECTION_STATUS_LOOKUP by my GENRE_CODE, named 'collectionStatusLookupAsNonExist'. */
    protected LdCollectionStatusLookup _collectionStatusLookupAsNonExist;

    /**
     * [get] COLLECTION_STATUS_LOOKUP by my GENRE_CODE, named 'collectionStatusLookupAsNonExist'.
     * @return The entity of foreign property 'collectionStatusLookupAsNonExist'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdCollectionStatusLookup getCollectionStatusLookupAsNonExist() {
        return _collectionStatusLookupAsNonExist;
    }

    /**
     * [set] COLLECTION_STATUS_LOOKUP by my GENRE_CODE, named 'collectionStatusLookupAsNonExist'.
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
     * [get] COLLECTION by BOOK_ID, named 'collectionList'.
     * @return The entity list of referrer property 'collectionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LdCollection> getCollectionList() {
        if (_collectionList == null) { _collectionList = newReferrerList(); }
        return _collectionList;
    }

    /**
     * [set] COLLECTION by BOOK_ID, named 'collectionList'.
     * @param collectionList The entity list of referrer property 'collectionList'. (NullAllowed)
     */
    public void setCollectionList(List<LdCollection> collectionList) {
        _collectionList = collectionList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                       Common Column
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void enableCommonColumnAutoSetup() {
        __canCommonColumnAutoSetup = true;
    }

    /**
     * {@inheritDoc}
     */
    public void disableCommonColumnAutoSetup() {
        __canCommonColumnAutoSetup = false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean canCommonColumnAutoSetup() {
        return __canCommonColumnAutoSetup;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof LdBsBook) {
            LdBsBook other = (LdBsBook)obj;
            if (!xSV(_bookId, other._bookId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _bookId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_author != null)
        { sb.append(li).append(xbRDS(_author, "author")); }
        if (_genre != null)
        { sb.append(li).append(xbRDS(_genre, "genre")); }
        if (_publisher != null)
        { sb.append(li).append(xbRDS(_publisher, "publisher")); }
        if (_collectionStatusLookupAsNonExist != null)
        { sb.append(li).append(xbRDS(_collectionStatusLookupAsNonExist, "collectionStatusLookupAsNonExist")); }
        if (_collectionList != null) { for (LdCollection et : _collectionList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "collectionList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bookId));
        sb.append(dm).append(xfND(_isbn));
        sb.append(dm).append(xfND(_bookName));
        sb.append(dm).append(xfND(_authorId));
        sb.append(dm).append(xfND(_publisherId));
        sb.append(dm).append(xfND(_genreCode));
        sb.append(dm).append(xfND(_openingPart));
        sb.append(dm).append(xfND(_maxLendingDateCount));
        sb.append(dm).append(xfND(_outOfUserSelectYn));
        sb.append(dm).append(xfND(_outOfUserSelectReason));
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
        if (_author != null)
        { sb.append(dm).append("author"); }
        if (_genre != null)
        { sb.append(dm).append("genre"); }
        if (_publisher != null)
        { sb.append(dm).append("publisher"); }
        if (_collectionStatusLookupAsNonExist != null)
        { sb.append(dm).append("collectionStatusLookupAsNonExist"); }
        if (_collectionList != null && !_collectionList.isEmpty())
        { sb.append(dm).append("collectionList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LdBook clone() {
        return (LdBook)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BOOK_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'BOOK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBookId() {
        checkSpecifiedProperty("bookId");
        return _bookId;
    }

    /**
     * [set] BOOK_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @param bookId The value of the column 'BOOK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBookId(Integer bookId) {
        registerModifiedProperty("bookId");
        _bookId = bookId;
    }

    /**
     * [get] ISBN: {UQ, NotNull, VARCHAR(20)} <br />
     * @return The value of the column 'ISBN'. (basically NotNull if selected: for the constraint)
     */
    public String getIsbn() {
        checkSpecifiedProperty("isbn");
        return _isbn;
    }

    /**
     * [set] ISBN: {UQ, NotNull, VARCHAR(20)} <br />
     * @param isbn The value of the column 'ISBN'. (basically NotNull if update: for the constraint)
     */
    public void setIsbn(String isbn) {
        registerModifiedProperty("isbn");
        _isbn = isbn;
    }

    /**
     * [get] BOOK_NAME: {NotNull, VARCHAR(80)} <br />
     * @return The value of the column 'BOOK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getBookName() {
        checkSpecifiedProperty("bookName");
        return _bookName;
    }

    /**
     * [set] BOOK_NAME: {NotNull, VARCHAR(80)} <br />
     * @param bookName The value of the column 'BOOK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setBookName(String bookName) {
        registerModifiedProperty("bookName");
        _bookName = bookName;
    }

    /**
     * [get] AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR} <br />
     * @return The value of the column 'AUTHOR_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAuthorId() {
        checkSpecifiedProperty("authorId");
        return _authorId;
    }

    /**
     * [set] AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR} <br />
     * @param authorId The value of the column 'AUTHOR_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAuthorId(Integer authorId) {
        registerModifiedProperty("authorId");
        _authorId = authorId;
    }

    /**
     * [get] PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER} <br />
     * @return The value of the column 'PUBLISHER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPublisherId() {
        checkSpecifiedProperty("publisherId");
        return _publisherId;
    }

    /**
     * [set] PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER} <br />
     * @param publisherId The value of the column 'PUBLISHER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPublisherId(Integer publisherId) {
        registerModifiedProperty("publisherId");
        _publisherId = publisherId;
    }

    /**
     * [get] GENRE_CODE: {IX, VARCHAR(24), FK to GENRE} <br />
     * @return The value of the column 'GENRE_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getGenreCode() {
        checkSpecifiedProperty("genreCode");
        return _genreCode;
    }

    /**
     * [set] GENRE_CODE: {IX, VARCHAR(24), FK to GENRE} <br />
     * @param genreCode The value of the column 'GENRE_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGenreCode(String genreCode) {
        registerModifiedProperty("genreCode");
        _genreCode = genreCode;
    }

    /**
     * [get] OPENING_PART: {CLOB(2147483647)} <br />
     * @return The value of the column 'OPENING_PART'. (NullAllowed even if selected: for no constraint)
     */
    public String getOpeningPart() {
        checkSpecifiedProperty("openingPart");
        return _openingPart;
    }

    /**
     * [set] OPENING_PART: {CLOB(2147483647)} <br />
     * @param openingPart The value of the column 'OPENING_PART'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOpeningPart(String openingPart) {
        registerModifiedProperty("openingPart");
        _openingPart = openingPart;
    }

    /**
     * [get] MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)} <br />
     * @return The value of the column 'MAX_LENDING_DATE_COUNT'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMaxLendingDateCount() {
        checkSpecifiedProperty("maxLendingDateCount");
        return _maxLendingDateCount;
    }

    /**
     * [set] MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)} <br />
     * @param maxLendingDateCount The value of the column 'MAX_LENDING_DATE_COUNT'. (basically NotNull if update: for the constraint)
     */
    public void setMaxLendingDateCount(Integer maxLendingDateCount) {
        registerModifiedProperty("maxLendingDateCount");
        _maxLendingDateCount = maxLendingDateCount;
    }

    /**
     * [get] OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo} <br />
     * @return The value of the column 'OUT_OF_USER_SELECT_YN'. (basically NotNull if selected: for the constraint)
     */
    public String getOutOfUserSelectYn() {
        checkSpecifiedProperty("outOfUserSelectYn");
        return _outOfUserSelectYn;
    }

    /**
     * [set] OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo} <br />
     * @param outOfUserSelectYn The value of the column 'OUT_OF_USER_SELECT_YN'. (basically NotNull if update: for the constraint)
     */
    public void setOutOfUserSelectYn(String outOfUserSelectYn) {
        registerModifiedProperty("outOfUserSelectYn");
        _outOfUserSelectYn = outOfUserSelectYn;
    }

    /**
     * [get] OUT_OF_USER_SELECT_REASON: {VARCHAR(200)} <br />
     * @return The value of the column 'OUT_OF_USER_SELECT_REASON'. (NullAllowed even if selected: for no constraint)
     */
    public String getOutOfUserSelectReason() {
        checkSpecifiedProperty("outOfUserSelectReason");
        return _outOfUserSelectReason;
    }

    /**
     * [set] OUT_OF_USER_SELECT_REASON: {VARCHAR(200)} <br />
     * @param outOfUserSelectReason The value of the column 'OUT_OF_USER_SELECT_REASON'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOutOfUserSelectReason(String outOfUserSelectReason) {
        registerModifiedProperty("outOfUserSelectReason");
        _outOfUserSelectReason = outOfUserSelectReason;
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
     * [get] R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType} <br />
     * @return The value of the column 'R_MODULE'. (basically NotNull if selected: for the constraint)
     */
    public String getRModule() {
        checkSpecifiedProperty("RModule");
        return _rModule;
    }

    /**
     * [set] R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType} <br />
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
     * [get] U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType} <br />
     * @return The value of the column 'U_MODULE'. (basically NotNull if selected: for the constraint)
     */
    public String getUModule() {
        checkSpecifiedProperty("UModule");
        return _uModule;
    }

    /**
     * [set] U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType} <br />
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
