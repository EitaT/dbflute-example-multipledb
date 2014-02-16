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
 * The DB meta of COLLECTION_STATUS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdCollectionStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdCollectionStatusDbm _instance = new LdCollectionStatusDbm();
    private LdCollectionStatusDbm() {}
    public static LdCollectionStatusDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgCollectionStatusCode(), "collectionStatusCode");
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
        public Object read(Entity et) { return ((LdCollectionStatus)et).getCollectionId(); }
        public void write(Entity et, Object vl) { ((LdCollectionStatus)et).setCollectionId(cti(vl)); }
    }
    public static class EpgCollectionStatusCode implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollectionStatus)et).getCollectionStatusCode(); }
        public void write(Entity et, Object vl) { ((LdCollectionStatus)et).setCollectionStatusCode((String)vl); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollectionStatus)et).getRUser(); }
        public void write(Entity et, Object vl) { ((LdCollectionStatus)et).setRUser((String)vl); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollectionStatus)et).getRModule(); }
        public void write(Entity et, Object vl) { ((LdCollectionStatus)et).setRModule((String)vl); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollectionStatus)et).getRTimestamp(); }
        public void write(Entity et, Object vl) { ((LdCollectionStatus)et).setRTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollectionStatus)et).getUUser(); }
        public void write(Entity et, Object vl) { ((LdCollectionStatus)et).setUUser((String)vl); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollectionStatus)et).getUModule(); }
        public void write(Entity et, Object vl) { ((LdCollectionStatus)et).setUModule((String)vl); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollectionStatus)et).getUTimestamp(); }
        public void write(Entity et, Object vl) { ((LdCollectionStatus)et).setUTimestamp((java.sql.Timestamp)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "COLLECTION_STATUS";
    protected final String _tablePropertyName = "collectionStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("COLLECTION_STATUS", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCollectionId = cci("COLLECTION_ID", "COLLECTION_ID", null, null, true, "collectionId", Integer.class, true, false, "INTEGER", 10, 0, null, false, null, null, "collection", null, null);
    protected final ColumnInfo _columnCollectionStatusCode = cci("COLLECTION_STATUS_CODE", "COLLECTION_STATUS_CODE", null, null, true, "collectionStatusCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "collectionStatusLookup", null, LdCDef.DefMeta.CollectionStatus);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, true, "RUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, true, "RModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, true, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, true, "UUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, true, "UModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, true, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    public ColumnInfo columnCollectionId() { return _columnCollectionId; }
    public ColumnInfo columnCollectionStatusCode() { return _columnCollectionStatusCode; }
    public ColumnInfo columnRUser() { return _columnRUser; }
    public ColumnInfo columnRModule() { return _columnRModule; }
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public ColumnInfo columnUUser() { return _columnUUser; }
    public ColumnInfo columnUModule() { return _columnUModule; }
    public ColumnInfo columnUTimestamp() { return _columnUTimestamp; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCollectionId());
        ls.add(columnCollectionStatusCode());
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
    public ForeignInfo foreignCollection() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCollectionId(), LdCollectionDbm.getInstance().columnCollectionId());
        return cfi("FK_COLLECTION_STATUS_COLLECTION", "collection", this, LdCollectionDbm.getInstance(), mp, 0, true, false, false, false, null, null, false, "collectionStatusAsOne");
    }
    public ForeignInfo foreignCollectionStatusLookup() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCollectionStatusCode(), LdCollectionStatusLookupDbm.getInstance().columnCollectionStatusCode());
        return cfi("FK_COLLECTION_STATUS_LOOKUP", "collectionStatusLookup", this, LdCollectionStatusLookupDbm.getInstance(), mp, 1, false, false, false, false, null, null, false, "collectionStatusList");
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
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdCollectionStatus"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdCollectionStatusCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdCollectionStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdCollectionStatus> getEntityType() { return LdCollectionStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdCollectionStatus newMyEntity() { return new LdCollectionStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdCollectionStatus)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdCollectionStatus)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
