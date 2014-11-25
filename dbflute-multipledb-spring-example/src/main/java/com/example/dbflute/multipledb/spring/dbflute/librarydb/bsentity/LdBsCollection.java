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
 * The entity of COLLECTION as TABLE. <br />
 * <pre>
 * [primary-key]
 *     COLLECTION_ID
 * 
 * [column]
 *     COLLECTION_ID, LIBRARY_ID, BOOK_ID, ARRIVAL_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     COLLECTION_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     BOOK, LIBRARY, COLLECTION_STATUS(AsOne)
 * 
 * [referrer table]
 *     LENDING_COLLECTION, COLLECTION_STATUS
 * 
 * [foreign property]
 *     book, library, collectionStatusAsOne
 * 
 * [referrer property]
 *     lendingCollectionList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer collectionId = entity.getCollectionId();
 * Integer libraryId = entity.getLibraryId();
 * Integer bookId = entity.getBookId();
 * java.sql.Timestamp arrivalDate = entity.getArrivalDate();
 * String rUser = entity.getRUser();
 * String rModule = entity.getRModule();
 * java.sql.Timestamp rTimestamp = entity.getRTimestamp();
 * String uUser = entity.getUUser();
 * String uModule = entity.getUModule();
 * java.sql.Timestamp uTimestamp = entity.getUTimestamp();
 * entity.setCollectionId(collectionId);
 * entity.setLibraryId(libraryId);
 * entity.setBookId(bookId);
 * entity.setArrivalDate(arrivalDate);
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
public abstract class LdBsCollection extends AbstractEntity implements DomainEntity {

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
    /** COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)} */
    protected Integer _collectionId;

    /** LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY} */
    protected Integer _libraryId;

    /** BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK} */
    protected Integer _bookId;

    /** ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)} */
    protected java.sql.Timestamp _arrivalDate;

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
        return "COLLECTION";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "collection";
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

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param libraryId : UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY. (NotNull)
     * @param bookId : +UQ, IX, NotNull, INTEGER(10), FK to BOOK. (NotNull)
     */
    public void uniqueBy(Integer libraryId, Integer bookId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("libraryId");
        __uniqueDrivenProperties.addPropertyName("bookId");
        setLibraryId(libraryId);setBookId(bookId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** BOOK by my BOOK_ID, named 'book'. */
    protected LdBook _book;

    /**
     * [get] BOOK by my BOOK_ID, named 'book'.
     * @return The entity of foreign property 'book'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public LdBook getBook() {
        return _book;
    }

    /**
     * [set] BOOK by my BOOK_ID, named 'book'.
     * @param book The entity of foreign property 'book'. (NullAllowed)
     */
    public void setBook(LdBook book) {
        _book = book;
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

    /** COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'. */
    protected LdCollectionStatus _collectionStatusAsOne;

    /**
     * [get] COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'collectionStatusAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public LdCollectionStatus getCollectionStatusAsOne() {
        return _collectionStatusAsOne;
    }

    /**
     * [set] COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
     * @param collectionStatusAsOne The entity of foreign property(referrer-as-one) 'collectionStatusAsOne'. (NullAllowed)
     */
    public void setCollectionStatusAsOne(LdCollectionStatus collectionStatusAsOne) {
        _collectionStatusAsOne = collectionStatusAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionList'. */
    protected List<LdLendingCollection> _lendingCollectionList;

    /**
     * [get] LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionList'.
     * @return The entity list of referrer property 'lendingCollectionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LdLendingCollection> getLendingCollectionList() {
        if (_lendingCollectionList == null) { _lendingCollectionList = newReferrerList(); }
        return _lendingCollectionList;
    }

    /**
     * [set] LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionList'.
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
        if (obj instanceof LdBsCollection) {
            LdBsCollection other = (LdBsCollection)obj;
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
        if (_book != null)
        { sb.append(li).append(xbRDS(_book, "book")); }
        if (_library != null)
        { sb.append(li).append(xbRDS(_library, "library")); }
        if (_collectionStatusAsOne != null)
        { sb.append(li).append(xbRDS(_collectionStatusAsOne, "collectionStatusAsOne")); }
        if (_lendingCollectionList != null) { for (LdLendingCollection et : _lendingCollectionList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "lendingCollectionList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_collectionId));
        sb.append(dm).append(xfND(_libraryId));
        sb.append(dm).append(xfND(_bookId));
        sb.append(dm).append(xfND(_arrivalDate));
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
        if (_book != null)
        { sb.append(dm).append("book"); }
        if (_library != null)
        { sb.append(dm).append("library"); }
        if (_collectionStatusAsOne != null)
        { sb.append(dm).append("collectionStatusAsOne"); }
        if (_lendingCollectionList != null && !_lendingCollectionList.isEmpty())
        { sb.append(dm).append("lendingCollectionList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LdCollection clone() {
        return (LdCollection)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'COLLECTION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCollectionId() {
        checkSpecifiedProperty("collectionId");
        return _collectionId;
    }

    /**
     * [set] COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @param collectionId The value of the column 'COLLECTION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCollectionId(Integer collectionId) {
        registerModifiedProperty("collectionId");
        _collectionId = collectionId;
    }

    /**
     * [get] LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY} <br />
     * @return The value of the column 'LIBRARY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLibraryId() {
        checkSpecifiedProperty("libraryId");
        return _libraryId;
    }

    /**
     * [set] LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY} <br />
     * @param libraryId The value of the column 'LIBRARY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLibraryId(Integer libraryId) {
        registerModifiedProperty("libraryId");
        _libraryId = libraryId;
    }

    /**
     * [get] BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK} <br />
     * @return The value of the column 'BOOK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBookId() {
        checkSpecifiedProperty("bookId");
        return _bookId;
    }

    /**
     * [set] BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK} <br />
     * @param bookId The value of the column 'BOOK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBookId(Integer bookId) {
        registerModifiedProperty("bookId");
        _bookId = bookId;
    }

    /**
     * [get] ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)} <br />
     * @return The value of the column 'ARRIVAL_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getArrivalDate() {
        checkSpecifiedProperty("arrivalDate");
        return _arrivalDate;
    }

    /**
     * [set] ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)} <br />
     * @param arrivalDate The value of the column 'ARRIVAL_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setArrivalDate(java.sql.Timestamp arrivalDate) {
        registerModifiedProperty("arrivalDate");
        _arrivalDate = arrivalDate;
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
