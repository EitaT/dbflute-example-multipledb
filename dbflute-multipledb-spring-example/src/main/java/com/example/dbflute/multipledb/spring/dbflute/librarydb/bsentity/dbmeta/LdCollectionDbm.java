/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;

/**
 * The DB meta of COLLECTION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdCollectionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdCollectionDbm _instance = new LdCollectionDbm();
    private LdCollectionDbm() {}
    public static LdCollectionDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgCollectionId(), "collectionId");
        setupEpg(_epgMap, new EpgLibraryId(), "libraryId");
        setupEpg(_epgMap, new EpgBookId(), "bookId");
        setupEpg(_epgMap, new EpgArrivalDate(), "arrivalDate");
        setupEpg(_epgMap, new EpgRUser(), "RUser");
        setupEpg(_epgMap, new EpgRModule(), "RModule");
        setupEpg(_epgMap, new EpgRTimestamp(), "RTimestamp");
        setupEpg(_epgMap, new EpgUUser(), "UUser");
        setupEpg(_epgMap, new EpgUModule(), "UModule");
        setupEpg(_epgMap, new EpgUTimestamp(), "UTimestamp");
    }
    public static class EpgCollectionId implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollection)et).getCollectionId(); }
        public void write(Entity et, Object vl) { ((LdCollection)et).setCollectionId(cti(vl)); }
    }
    public static class EpgLibraryId implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollection)et).getLibraryId(); }
        public void write(Entity et, Object vl) { ((LdCollection)et).setLibraryId(cti(vl)); }
    }
    public static class EpgBookId implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollection)et).getBookId(); }
        public void write(Entity et, Object vl) { ((LdCollection)et).setBookId(cti(vl)); }
    }
    public static class EpgArrivalDate implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollection)et).getArrivalDate(); }
        public void write(Entity et, Object vl) { ((LdCollection)et).setArrivalDate((java.sql.Timestamp)vl); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollection)et).getRUser(); }
        public void write(Entity et, Object vl) { ((LdCollection)et).setRUser((String)vl); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollection)et).getRModule(); }
        public void write(Entity et, Object vl) { ((LdCollection)et).setRModule((String)vl); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollection)et).getRTimestamp(); }
        public void write(Entity et, Object vl) { ((LdCollection)et).setRTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollection)et).getUUser(); }
        public void write(Entity et, Object vl) { ((LdCollection)et).setUUser((String)vl); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollection)et).getUModule(); }
        public void write(Entity et, Object vl) { ((LdCollection)et).setUModule((String)vl); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollection)et).getUTimestamp(); }
        public void write(Entity et, Object vl) { ((LdCollection)et).setUTimestamp((java.sql.Timestamp)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgBook(), "book");
        setupEfpg(_efpgMap, new EfpgLibrary(), "library");
    }
    public class EfpgBook implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollection)et).getBook(); }
        public void write(Entity et, Object vl) { ((LdCollection)et).setBook((LdBook)vl); }
    }
    public class EfpgLibrary implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollection)et).getLibrary(); }
        public void write(Entity et, Object vl) { ((LdCollection)et).setLibrary((LdLibrary)vl); }
    }
    {
        setupEfpg(_efpgMap, new EfpgCollectionStatusAsOne(), "collectionStatusAsOne");
    }
    public class EfpgCollectionStatusAsOne implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollection)et).getCollectionStatusAsOne(); }
        public void write(Entity et, Object vl) { ((LdCollection)et).setCollectionStatusAsOne((LdCollectionStatus)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "COLLECTION";
    protected final String _tablePropertyName = "collection";
    protected final TableSqlName _tableSqlName = new TableSqlName("COLLECTION", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCollectionId = cci("COLLECTION_ID", "COLLECTION_ID", null, null, Integer.class, "collectionId", null, true, true, true, "INTEGER", 10, 0, "GENERATED_BY_DEFAULT", false, null, null, null, "lendingCollectionList", null);
    protected final ColumnInfo _columnLibraryId = cci("LIBRARY_ID", "LIBRARY_ID", null, null, Integer.class, "libraryId", null, false, false, true, "SMALLINT", 5, 0, null, false, null, null, "library", null, null);
    protected final ColumnInfo _columnBookId = cci("BOOK_ID", "BOOK_ID", null, null, Integer.class, "bookId", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, "book", null, null);
    protected final ColumnInfo _columnArrivalDate = cci("ARRIVAL_DATE", "ARRIVAL_DATE", null, null, java.sql.Timestamp.class, "arrivalDate", null, false, false, true, "TIMESTAMP", 26, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, String.class, "RUser", null, false, false, true, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, String.class, "RModule", null, false, false, true, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, java.sql.Timestamp.class, "RTimestamp", null, false, false, true, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, String.class, "UUser", null, false, false, true, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, String.class, "UModule", null, false, false, true, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, java.sql.Timestamp.class, "UTimestamp", null, false, false, true, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    /**
     * COLLECTION_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCollectionId() { return _columnCollectionId; }
    /**
     * LIBRARY_ID: {UQ+, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLibraryId() { return _columnLibraryId; }
    /**
     * BOOK_ID: {+UQ, IX, NotNull, INTEGER(10), FK to BOOK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBookId() { return _columnBookId; }
    /**
     * ARRIVAL_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArrivalDate() { return _columnArrivalDate; }
    /**
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRUser() { return _columnRUser; }
    /**
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
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
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module]}
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
        ls.add(columnCollectionId());
        ls.add(columnLibraryId());
        ls.add(columnBookId());
        ls.add(columnArrivalDate());
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
    protected UniqueInfo cpui() { return hpcpui(columnCollectionId()); }
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
     * BOOK by my BOOK_ID, named 'book'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBook() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBookId(), LdBookDbm.getInstance().columnBookId());
        return cfi("FK_COLLECTION_BOOK", "book", this, LdBookDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "collectionList");
    }
    /**
     * LIBRARY by my LIBRARY_ID, named 'library'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLibrary() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLibraryId(), LdLibraryDbm.getInstance().columnLibraryId());
        return cfi("FK_COLLECTION_LIBRARY", "library", this, LdLibraryDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "collectionList");
    }
    /**
     * COLLECTION_STATUS by COLLECTION_ID, named 'collectionStatusAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignCollectionStatusAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCollectionId(), LdCollectionStatusDbm.getInstance().columnCollectionId());
        return cfi("FK_COLLECTION_STATUS_COLLECTION", "collectionStatusAsOne", this, LdCollectionStatusDbm.getInstance(), mp, 2, null, true, false, true, false, null, null, false, "collection");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * LENDING_COLLECTION by COLLECTION_ID, named 'lendingCollectionList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerLendingCollectionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCollectionId(), LdLendingCollectionDbm.getInstance().columnCollectionId());
        return cri("FK_LENDING_COLLECTION_COL", "lendingCollectionList", this, LdLendingCollectionDbm.getInstance(), mp, false, "collection");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasUpdateDate() { return true; }
    public ColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdCollection"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdCollectionCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdCollectionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdCollection> getEntityType() { return LdCollection.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdCollection newMyEntity() { return new LdCollection(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdCollection)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdCollection)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
