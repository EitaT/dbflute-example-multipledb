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
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgCollectionId implements PropertyGateway {
        public Object read(Entity e) { return ((LdCollection)e).getCollectionId(); }
        public void write(Entity e, Object v) { ((LdCollection)e).setCollectionId(cti(v)); }
    }
    public static class EpgLibraryId implements PropertyGateway {
        public Object read(Entity e) { return ((LdCollection)e).getLibraryId(); }
        public void write(Entity e, Object v) { ((LdCollection)e).setLibraryId(cti(v)); }
    }
    public static class EpgBookId implements PropertyGateway {
        public Object read(Entity e) { return ((LdCollection)e).getBookId(); }
        public void write(Entity e, Object v) { ((LdCollection)e).setBookId(cti(v)); }
    }
    public static class EpgArrivalDate implements PropertyGateway {
        public Object read(Entity e) { return ((LdCollection)e).getArrivalDate(); }
        public void write(Entity e, Object v) { ((LdCollection)e).setArrivalDate((java.sql.Timestamp)v); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity e) { return ((LdCollection)e).getRUser(); }
        public void write(Entity e, Object v) { ((LdCollection)e).setRUser((String)v); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity e) { return ((LdCollection)e).getRModule(); }
        public void write(Entity e, Object v) { ((LdCollection)e).setRModule((String)v); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((LdCollection)e).getRTimestamp(); }
        public void write(Entity e, Object v) { ((LdCollection)e).setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity e) { return ((LdCollection)e).getUUser(); }
        public void write(Entity e, Object v) { ((LdCollection)e).setUUser((String)v); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity e) { return ((LdCollection)e).getUModule(); }
        public void write(Entity e, Object v) { ((LdCollection)e).setUModule((String)v); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((LdCollection)e).getUTimestamp(); }
        public void write(Entity e, Object v) { ((LdCollection)e).setUTimestamp((java.sql.Timestamp)v); }
    }

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
    protected final ColumnInfo _columnCollectionId = cci("COLLECTION_ID", "COLLECTION_ID", null, null, true, "collectionId", Integer.class, true, true, "INTEGER", 10, 0, "GENERATED_BY_DEFAULT", false, null, null, null, "lendingCollectionList", null);
    protected final ColumnInfo _columnLibraryId = cci("LIBRARY_ID", "LIBRARY_ID", null, null, true, "libraryId", Integer.class, false, false, "SMALLINT", 5, 0, null, false, null, null, "library", null, null);
    protected final ColumnInfo _columnBookId = cci("BOOK_ID", "BOOK_ID", null, null, true, "bookId", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, "book", null, null);
    protected final ColumnInfo _columnArrivalDate = cci("ARRIVAL_DATE", "ARRIVAL_DATE", null, null, true, "arrivalDate", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, true, "RUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, true, "RModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.RegisterModuleType);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, true, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, true, "UUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, true, "UModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.UpdateModuleType);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, true, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    public ColumnInfo columnCollectionId() { return _columnCollectionId; }
    public ColumnInfo columnLibraryId() { return _columnLibraryId; }
    public ColumnInfo columnBookId() { return _columnBookId; }
    public ColumnInfo columnArrivalDate() { return _columnArrivalDate; }
    public ColumnInfo columnRUser() { return _columnRUser; }
    public ColumnInfo columnRModule() { return _columnRModule; }
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public ColumnInfo columnUUser() { return _columnUUser; }
    public ColumnInfo columnUModule() { return _columnUModule; }
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
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignBook() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnBookId(), LdBookDbm.getInstance().columnBookId());
        return cfi("FK_COLLECTION_BOOK", "book", this, LdBookDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "collectionList");
    }
    public ForeignInfo foreignLibrary() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnLibraryId(), LdLibraryDbm.getInstance().columnLibraryId());
        return cfi("FK_COLLECTION_LIBRARY", "library", this, LdLibraryDbm.getInstance(), map, 1, false, false, false, false, null, null, false, "collectionList");
    }
    public ForeignInfo foreignCollectionStatusAsOne() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnCollectionId(), LdCollectionStatusDbm.getInstance().columnCollectionId());
        return cfi("FK_COLLECTION_STATUS_COLLECTION", "collectionStatusAsOne", this, LdCollectionStatusDbm.getInstance(), map, 2, true, false, true, false, null, null, false, "collection");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerLendingCollectionList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnCollectionId(), LdLendingCollectionDbm.getInstance().columnCollectionId());
        return cri("FK_LENDING_COLLECTION_COL", "lendingCollectionList", this, LdLendingCollectionDbm.getInstance(), map, false, "collection");
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
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdCollection"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdCollectionCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdCollectionBhv"; }

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
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((LdCollection)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((LdCollection)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
