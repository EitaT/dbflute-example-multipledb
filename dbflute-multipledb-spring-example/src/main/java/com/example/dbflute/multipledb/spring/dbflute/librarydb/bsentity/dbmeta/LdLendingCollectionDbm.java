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
 * The DB meta of LENDING_COLLECTION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdLendingCollectionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdLendingCollectionDbm _instance = new LdLendingCollectionDbm();
    private LdLendingCollectionDbm() {}
    public static LdLendingCollectionDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return LdDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgLibraryId(), "libraryId");
        setupEpg(_epgMap, new EpgLbUserId(), "lbUserId");
        setupEpg(_epgMap, new EpgLendingDate(), "lendingDate");
        setupEpg(_epgMap, new EpgCollectionId(), "collectionId");
        setupEpg(_epgMap, new EpgReturnLimitDate(), "returnLimitDate");
        setupEpg(_epgMap, new EpgRUser(), "RUser");
        setupEpg(_epgMap, new EpgRModule(), "RModule");
        setupEpg(_epgMap, new EpgRTimestamp(), "RTimestamp");
        setupEpg(_epgMap, new EpgUUser(), "UUser");
        setupEpg(_epgMap, new EpgUModule(), "UModule");
        setupEpg(_epgMap, new EpgUTimestamp(), "UTimestamp");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgLibraryId implements PropertyGateway {
        public Object read(Entity e) { return ((LdLendingCollection)e).getLibraryId(); }
        public void write(Entity e, Object v) { ((LdLendingCollection)e).setLibraryId(cti(v)); }
    }
    public static class EpgLbUserId implements PropertyGateway {
        public Object read(Entity e) { return ((LdLendingCollection)e).getLbUserId(); }
        public void write(Entity e, Object v) { ((LdLendingCollection)e).setLbUserId(cti(v)); }
    }
    public static class EpgLendingDate implements PropertyGateway {
        public Object read(Entity e) { return ((LdLendingCollection)e).getLendingDate(); }
        public void write(Entity e, Object v) { ((LdLendingCollection)e).setLendingDate((java.sql.Timestamp)v); }
    }
    public static class EpgCollectionId implements PropertyGateway {
        public Object read(Entity e) { return ((LdLendingCollection)e).getCollectionId(); }
        public void write(Entity e, Object v) { ((LdLendingCollection)e).setCollectionId(cti(v)); }
    }
    public static class EpgReturnLimitDate implements PropertyGateway {
        public Object read(Entity e) { return ((LdLendingCollection)e).getReturnLimitDate(); }
        public void write(Entity e, Object v) { ((LdLendingCollection)e).setReturnLimitDate((java.sql.Timestamp)v); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity e) { return ((LdLendingCollection)e).getRUser(); }
        public void write(Entity e, Object v) { ((LdLendingCollection)e).setRUser((String)v); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity e) { return ((LdLendingCollection)e).getRModule(); }
        public void write(Entity e, Object v) { ((LdLendingCollection)e).setRModule((String)v); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((LdLendingCollection)e).getRTimestamp(); }
        public void write(Entity e, Object v) { ((LdLendingCollection)e).setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity e) { return ((LdLendingCollection)e).getUUser(); }
        public void write(Entity e, Object v) { ((LdLendingCollection)e).setUUser((String)v); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity e) { return ((LdLendingCollection)e).getUModule(); }
        public void write(Entity e, Object v) { ((LdLendingCollection)e).setUModule((String)v); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((LdLendingCollection)e).getUTimestamp(); }
        public void write(Entity e, Object v) { ((LdLendingCollection)e).setUTimestamp((java.sql.Timestamp)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LENDING_COLLECTION";
    protected final String _tablePropertyName = "lendingCollection";
    protected final TableSqlName _tableSqlName = new TableSqlName("LENDING_COLLECTION", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLibraryId = cci("LIBRARY_ID", "LIBRARY_ID", null, null, true, "libraryId", Integer.class, true, false, "SMALLINT", 5, 0, null, false, null, null, "lending,libraryUser", null, null);
    protected final ColumnInfo _columnLbUserId = cci("LB_USER_ID", "LB_USER_ID", null, null, true, "lbUserId", Integer.class, true, false, "INTEGER", 10, 0, null, false, null, null, "lending,libraryUser", null, null);
    protected final ColumnInfo _columnLendingDate = cci("LENDING_DATE", "LENDING_DATE", null, null, true, "lendingDate", java.sql.Timestamp.class, true, false, "TIMESTAMP", 26, 6, null, false, null, null, "lending", null, null);
    protected final ColumnInfo _columnCollectionId = cci("COLLECTION_ID", "COLLECTION_ID", null, null, true, "collectionId", Integer.class, true, false, "INTEGER", 10, 0, null, false, null, null, "collection", null, null);
    protected final ColumnInfo _columnReturnLimitDate = cci("RETURN_LIMIT_DATE", "RETURN_LIMIT_DATE", null, null, true, "returnLimitDate", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, true, "RUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, true, "RModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, true, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, true, "UUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, true, "UModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, true, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    public ColumnInfo columnLibraryId() { return _columnLibraryId; }
    public ColumnInfo columnLbUserId() { return _columnLbUserId; }
    public ColumnInfo columnLendingDate() { return _columnLendingDate; }
    public ColumnInfo columnCollectionId() { return _columnCollectionId; }
    public ColumnInfo columnReturnLimitDate() { return _columnReturnLimitDate; }
    public ColumnInfo columnRUser() { return _columnRUser; }
    public ColumnInfo columnRModule() { return _columnRModule; }
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public ColumnInfo columnUUser() { return _columnUUser; }
    public ColumnInfo columnUModule() { return _columnUModule; }
    public ColumnInfo columnUTimestamp() { return _columnUTimestamp; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLibraryId());
        ls.add(columnLbUserId());
        ls.add(columnLendingDate());
        ls.add(columnCollectionId());
        ls.add(columnReturnLimitDate());
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
    protected UniqueInfo cpui() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnLibraryId());
        ls.add(columnLbUserId());
        ls.add(columnLendingDate());
        ls.add(columnCollectionId());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignCollection() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnCollectionId(), LdCollectionDbm.getInstance().columnCollectionId());
        return cfi("FK_LENDING_COLLECTION_COL", "collection", this, LdCollectionDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "lendingCollectionList");
    }
    public ForeignInfo foreignLending() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMapSized(4);
        map.put(columnLibraryId(), LdLendingDbm.getInstance().columnLibraryId());
        map.put(columnLbUserId(), LdLendingDbm.getInstance().columnLbUserId());
        map.put(columnLendingDate(), LdLendingDbm.getInstance().columnLendingDate());
        return cfi("FK_LENDING_COLLECTION_LENDING", "lending", this, LdLendingDbm.getInstance(), map, 1, false, false, false, false, null, null, false, "lendingCollectionList");
    }
    public ForeignInfo foreignLibraryUser() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMapSized(4);
        map.put(columnLibraryId(), LdLibraryUserDbm.getInstance().columnLibraryId());
        map.put(columnLbUserId(), LdLibraryUserDbm.getInstance().columnLbUserId());
        return cfi("FK_TEST_LENDING_COLLECTION", "libraryUser", this, LdLibraryUserDbm.getInstance(), map, 2, false, false, false, true, null, null, false, "lendingCollectionList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasUpdateDate() { return true; }
    public ColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdLendingCollection"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdLendingCollectionCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdLendingCollectionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdLendingCollection> getEntityType() { return LdLendingCollection.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdLendingCollection newMyEntity() { return new LdLendingCollection(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((LdLendingCollection)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((LdLendingCollection)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
