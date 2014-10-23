/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.*;

/**
 * The DB meta of BOOK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdBookDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdBookDbm _instance = new LdBookDbm();
    private LdBookDbm() {}
    public static LdBookDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return LdDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgBookId(), "bookId");
        setupEpg(_epgMap, new EpgIsbn(), "isbn");
        setupEpg(_epgMap, new EpgBookName(), "bookName");
        setupEpg(_epgMap, new EpgAuthorId(), "authorId");
        setupEpg(_epgMap, new EpgPublisherId(), "publisherId");
        setupEpg(_epgMap, new EpgGenreCode(), "genreCode");
        setupEpg(_epgMap, new EpgOpeningPart(), "openingPart");
        setupEpg(_epgMap, new EpgMaxLendingDateCount(), "maxLendingDateCount");
        setupEpg(_epgMap, new EpgOutOfUserSelectYn(), "outOfUserSelectYn");
        setupEpg(_epgMap, new EpgOutOfUserSelectReason(), "outOfUserSelectReason");
        setupEpg(_epgMap, new EpgRUser(), "RUser");
        setupEpg(_epgMap, new EpgRModule(), "RModule");
        setupEpg(_epgMap, new EpgRTimestamp(), "RTimestamp");
        setupEpg(_epgMap, new EpgUUser(), "UUser");
        setupEpg(_epgMap, new EpgUModule(), "UModule");
        setupEpg(_epgMap, new EpgUTimestamp(), "UTimestamp");
    }
    public static class EpgBookId implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getBookId(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setBookId(cti(vl)); }
    }
    public static class EpgIsbn implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getIsbn(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setIsbn((String)vl); }
    }
    public static class EpgBookName implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getBookName(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setBookName((String)vl); }
    }
    public static class EpgAuthorId implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getAuthorId(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setAuthorId(cti(vl)); }
    }
    public static class EpgPublisherId implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getPublisherId(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setPublisherId(cti(vl)); }
    }
    public static class EpgGenreCode implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getGenreCode(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setGenreCode((String)vl); }
    }
    public static class EpgOpeningPart implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getOpeningPart(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setOpeningPart((String)vl); }
    }
    public static class EpgMaxLendingDateCount implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getMaxLendingDateCount(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setMaxLendingDateCount(cti(vl)); }
    }
    public static class EpgOutOfUserSelectYn implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getOutOfUserSelectYn(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setOutOfUserSelectYn((String)vl); }
    }
    public static class EpgOutOfUserSelectReason implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getOutOfUserSelectReason(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setOutOfUserSelectReason((String)vl); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getRUser(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setRUser((String)vl); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getRModule(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setRModule((String)vl); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getRTimestamp(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setRTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getUUser(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setUUser((String)vl); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getUModule(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setUModule((String)vl); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getUTimestamp(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setUTimestamp((java.sql.Timestamp)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgAuthor(), "author");
        setupEfpg(_efpgMap, new EfpgGenre(), "genre");
        setupEfpg(_efpgMap, new EfpgPublisher(), "publisher");
        setupEfpg(_efpgMap, new EfpgCollectionStatusLookupAsNonExist(), "collectionStatusLookupAsNonExist");
    }
    public class EfpgAuthor implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getAuthor(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setAuthor((LdAuthor)vl); }
    }
    public class EfpgGenre implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getGenre(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setGenre((LdGenre)vl); }
    }
    public class EfpgPublisher implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getPublisher(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setPublisher((LdPublisher)vl); }
    }
    public class EfpgCollectionStatusLookupAsNonExist implements PropertyGateway {
        public Object read(Entity et) { return ((LdBook)et).getCollectionStatusLookupAsNonExist(); }
        public void write(Entity et, Object vl) { ((LdBook)et).setCollectionStatusLookupAsNonExist((LdCollectionStatusLookup)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BOOK";
    protected final String _tablePropertyName = "book";
    protected final TableSqlName _tableSqlName = new TableSqlName("BOOK", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBookId = cci("BOOK_ID", "BOOK_ID", null, null, Integer.class, "bookId", null, true, true, true, "INTEGER", 10, 0, "GENERATED_BY_DEFAULT", false, null, null, null, "collectionList", null);
    protected final ColumnInfo _columnIsbn = cci("ISBN", "ISBN", null, null, String.class, "isbn", null, false, false, true, "VARCHAR", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBookName = cci("BOOK_NAME", "BOOK_NAME", null, null, String.class, "bookName", null, false, false, true, "VARCHAR", 80, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAuthorId = cci("AUTHOR_ID", "AUTHOR_ID", null, null, Integer.class, "authorId", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, "author", null, null);
    protected final ColumnInfo _columnPublisherId = cci("PUBLISHER_ID", "PUBLISHER_ID", null, null, Integer.class, "publisherId", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, "publisher", null, null);
    protected final ColumnInfo _columnGenreCode = cci("GENRE_CODE", "GENRE_CODE", null, null, String.class, "genreCode", null, false, false, false, "VARCHAR", 24, 0, null, false, null, null, "genre,collectionStatusLookupAsNonExist", null, null);
    protected final ColumnInfo _columnOpeningPart = cci("OPENING_PART", "OPENING_PART", null, null, String.class, "openingPart", null, false, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMaxLendingDateCount = cci("MAX_LENDING_DATE_COUNT", "MAX_LENDING_DATE_COUNT", null, null, Integer.class, "maxLendingDateCount", null, false, false, true, "SMALLINT", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnOutOfUserSelectYn = cci("OUT_OF_USER_SELECT_YN", "OUT_OF_USER_SELECT_YN", null, null, String.class, "outOfUserSelectYn", null, false, false, true, "CHAR", 1, 0, null, false, null, null, null, null, LdCDef.DefMeta.YesNo);
    protected final ColumnInfo _columnOutOfUserSelectReason = cci("OUT_OF_USER_SELECT_REASON", "OUT_OF_USER_SELECT_REASON", null, null, String.class, "outOfUserSelectReason", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, String.class, "RUser", null, false, false, true, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, String.class, "RModule", null, false, false, true, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.RegisterModuleType);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, java.sql.Timestamp.class, "RTimestamp", null, false, false, true, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, String.class, "UUser", null, false, false, true, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, String.class, "UModule", null, false, false, true, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.UpdateModuleType);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, java.sql.Timestamp.class, "UTimestamp", null, false, false, true, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    /**
     * BOOK_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBookId() { return _columnBookId; }
    /**
     * ISBN: {UQ, NotNull, VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIsbn() { return _columnIsbn; }
    /**
     * BOOK_NAME: {NotNull, VARCHAR(80)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBookName() { return _columnBookName; }
    /**
     * AUTHOR_ID: {IX, NotNull, INTEGER(10), FK to AUTHOR}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAuthorId() { return _columnAuthorId; }
    /**
     * PUBLISHER_ID: {IX, NotNull, INTEGER(10), FK to PUBLISHER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPublisherId() { return _columnPublisherId; }
    /**
     * GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenreCode() { return _columnGenreCode; }
    /**
     * OPENING_PART: {CLOB(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOpeningPart() { return _columnOpeningPart; }
    /**
     * MAX_LENDING_DATE_COUNT: {NotNull, SMALLINT(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxLendingDateCount() { return _columnMaxLendingDateCount; }
    /**
     * OUT_OF_USER_SELECT_YN: {NotNull, CHAR(1), classification=YesNo}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOutOfUserSelectYn() { return _columnOutOfUserSelectYn; }
    /**
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOutOfUserSelectReason() { return _columnOutOfUserSelectReason; }
    /**
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRUser() { return _columnRUser; }
    /**
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRModule() { return _columnRModule; }
    /**
     * R_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    /**
     * U_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUUser() { return _columnUUser; }
    /**
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUModule() { return _columnUModule; }
    /**
     * U_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[CURRENT_TIMESTAMP]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUTimestamp() { return _columnUTimestamp; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBookId());
        ls.add(columnIsbn());
        ls.add(columnBookName());
        ls.add(columnAuthorId());
        ls.add(columnPublisherId());
        ls.add(columnGenreCode());
        ls.add(columnOpeningPart());
        ls.add(columnMaxLendingDateCount());
        ls.add(columnOutOfUserSelectYn());
        ls.add(columnOutOfUserSelectReason());
        ls.add(columnRUser());
        ls.add(columnRModule());
        ls.add(columnRTimestamp());
        ls.add(columnUUser());
        ls.add(columnUModule());
        ls.add(columnUTimestamp());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnBookId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * AUTHOR by my AUTHOR_ID, named 'author'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignAuthor() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAuthorId(), LdAuthorDbm.getInstance().columnAuthorId());
        return cfi("FK_BOOK_AUTHOR", "author", this, LdAuthorDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "bookList");
    }
    /**
     * GENRE by my GENRE_CODE, named 'genre'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGenre() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGenreCode(), LdGenreDbm.getInstance().columnGenreCode());
        return cfi("FK_BOOK_GENRE", "genre", this, LdGenreDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "bookList");
    }
    /**
     * PUBLISHER by my PUBLISHER_ID, named 'publisher'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPublisher() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPublisherId(), LdPublisherDbm.getInstance().columnPublisherId());
        return cfi("FK_BOOK_PUBLISHER", "publisher", this, LdPublisherDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "bookList");
    }
    /**
     * COLLECTION_STATUS_LOOKUP by my GENRE_CODE, named 'collectionStatusLookupAsNonExist'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCollectionStatusLookupAsNonExist() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGenreCode(), LdCollectionStatusLookupDbm.getInstance().columnCollectionStatusCode());
        return cfi("FK_DEADLINK_TEST", "collectionStatusLookupAsNonExist", this, LdCollectionStatusLookupDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.COLLECTION_STATUS_NAME = 'nonexist'", null, false, null);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * COLLECTION by BOOK_ID, named 'collectionList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCollectionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBookId(), LdCollectionDbm.getInstance().columnBookId());
        return cri("FK_COLLECTION_BOOK", "collectionList", this, LdCollectionDbm.getInstance(), mp, false, "book");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasUpdateDate() { return true; }
    public ColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRUser(), columnRModule(), columnRTimestamp(), columnUUser(), columnUModule(), columnUTimestamp()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRUser(), columnRModule(), columnRTimestamp(), columnUUser(), columnUModule()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUUser(), columnUModule()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdBook"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdBookCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdBookBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdBook> getEntityType() { return LdBook.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdBook newEntity() { return new LdBook(); }
    public LdBook newMyEntity() { return new LdBook(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdBook)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdBook)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
