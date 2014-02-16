/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
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
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
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
    protected final ColumnInfo _columnBookId = cci("BOOK_ID", "BOOK_ID", null, null, true, "bookId", Integer.class, true, true, "INTEGER", 10, 0, "GENERATED_BY_DEFAULT", false, null, null, null, "collectionList", null);
    protected final ColumnInfo _columnIsbn = cci("ISBN", "ISBN", null, null, true, "isbn", String.class, false, false, "VARCHAR", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBookName = cci("BOOK_NAME", "BOOK_NAME", null, null, true, "bookName", String.class, false, false, "VARCHAR", 80, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAuthorId = cci("AUTHOR_ID", "AUTHOR_ID", null, null, true, "authorId", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, "author", null, null);
    protected final ColumnInfo _columnPublisherId = cci("PUBLISHER_ID", "PUBLISHER_ID", null, null, true, "publisherId", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, "publisher", null, null);
    protected final ColumnInfo _columnGenreCode = cci("GENRE_CODE", "GENRE_CODE", null, null, false, "genreCode", String.class, false, false, "VARCHAR", 24, 0, null, false, null, null, "genre,collectionStatusLookupAsNonExist", null, null);
    protected final ColumnInfo _columnOpeningPart = cci("OPENING_PART", "OPENING_PART", null, null, false, "openingPart", String.class, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMaxLendingDateCount = cci("MAX_LENDING_DATE_COUNT", "MAX_LENDING_DATE_COUNT", null, null, true, "maxLendingDateCount", Integer.class, false, false, "SMALLINT", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnOutOfUserSelectYn = cci("OUT_OF_USER_SELECT_YN", "OUT_OF_USER_SELECT_YN", null, null, true, "outOfUserSelectYn", String.class, false, false, "CHAR", 1, 0, null, false, null, null, null, null, LdCDef.DefMeta.YesNo);
    protected final ColumnInfo _columnOutOfUserSelectReason = cci("OUT_OF_USER_SELECT_REASON", "OUT_OF_USER_SELECT_REASON", null, null, false, "outOfUserSelectReason", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, true, "RUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, true, "RModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.RegisterModuleType);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, true, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, true, "UUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, true, "UModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.UpdateModuleType);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, true, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    public ColumnInfo columnBookId() { return _columnBookId; }
    public ColumnInfo columnIsbn() { return _columnIsbn; }
    public ColumnInfo columnBookName() { return _columnBookName; }
    public ColumnInfo columnAuthorId() { return _columnAuthorId; }
    public ColumnInfo columnPublisherId() { return _columnPublisherId; }
    public ColumnInfo columnGenreCode() { return _columnGenreCode; }
    public ColumnInfo columnOpeningPart() { return _columnOpeningPart; }
    public ColumnInfo columnMaxLendingDateCount() { return _columnMaxLendingDateCount; }
    public ColumnInfo columnOutOfUserSelectYn() { return _columnOutOfUserSelectYn; }
    public ColumnInfo columnOutOfUserSelectReason() { return _columnOutOfUserSelectReason; }
    public ColumnInfo columnRUser() { return _columnRUser; }
    public ColumnInfo columnRModule() { return _columnRModule; }
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public ColumnInfo columnUUser() { return _columnUUser; }
    public ColumnInfo columnUModule() { return _columnUModule; }
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
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignAuthor() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAuthorId(), LdAuthorDbm.getInstance().columnAuthorId());
        return cfi("FK_BOOK_AUTHOR", "author", this, LdAuthorDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "bookList");
    }
    public ForeignInfo foreignGenre() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGenreCode(), LdGenreDbm.getInstance().columnGenreCode());
        return cfi("FK_BOOK_GENRE", "genre", this, LdGenreDbm.getInstance(), mp, 1, false, false, false, false, null, null, false, "bookList");
    }
    public ForeignInfo foreignPublisher() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPublisherId(), LdPublisherDbm.getInstance().columnPublisherId());
        return cfi("FK_BOOK_PUBLISHER", "publisher", this, LdPublisherDbm.getInstance(), mp, 2, false, false, false, false, null, null, false, "bookList");
    }
    public ForeignInfo foreignCollectionStatusLookupAsNonExist() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGenreCode(), LdCollectionStatusLookupDbm.getInstance().columnCollectionStatusCode());
        return cfi("FK_DEADLINK_TEST", "collectionStatusLookupAsNonExist", this, LdCollectionStatusLookupDbm.getInstance(), mp, 3, false, false, false, true, "$$foreignAlias$$.COLLECTION_STATUS_NAME = 'nonexist'", null, false, null);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
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
    public Entity newEntity() { return newMyEntity(); }
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
