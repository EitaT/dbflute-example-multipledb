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
 * The DB meta of COLLECTION_STATUS_LOOKUP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdCollectionStatusLookupDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdCollectionStatusLookupDbm _instance = new LdCollectionStatusLookupDbm();
    private LdCollectionStatusLookupDbm() {}
    public static LdCollectionStatusLookupDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return LdDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgCollectionStatusCode(), "collectionStatusCode");
        setupEpg(_epgMap, new EpgCollectionStatusName(), "collectionStatusName");
        setupEpg(_epgMap, new EpgRUser(), "RUser");
        setupEpg(_epgMap, new EpgRModule(), "RModule");
        setupEpg(_epgMap, new EpgRTimestamp(), "RTimestamp");
        setupEpg(_epgMap, new EpgUUser(), "UUser");
        setupEpg(_epgMap, new EpgUModule(), "UModule");
        setupEpg(_epgMap, new EpgUTimestamp(), "UTimestamp");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgCollectionStatusCode implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollectionStatusLookup)et).getCollectionStatusCode(); }
        public void write(Entity et, Object vl) { ((LdCollectionStatusLookup)et).setCollectionStatusCode((String)vl); }
    }
    public static class EpgCollectionStatusName implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollectionStatusLookup)et).getCollectionStatusName(); }
        public void write(Entity et, Object vl) { ((LdCollectionStatusLookup)et).setCollectionStatusName((String)vl); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollectionStatusLookup)et).getRUser(); }
        public void write(Entity et, Object vl) { ((LdCollectionStatusLookup)et).setRUser((String)vl); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollectionStatusLookup)et).getRModule(); }
        public void write(Entity et, Object vl) { ((LdCollectionStatusLookup)et).setRModule((String)vl); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollectionStatusLookup)et).getRTimestamp(); }
        public void write(Entity et, Object vl) { ((LdCollectionStatusLookup)et).setRTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollectionStatusLookup)et).getUUser(); }
        public void write(Entity et, Object vl) { ((LdCollectionStatusLookup)et).setUUser((String)vl); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollectionStatusLookup)et).getUModule(); }
        public void write(Entity et, Object vl) { ((LdCollectionStatusLookup)et).setUModule((String)vl); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdCollectionStatusLookup)et).getUTimestamp(); }
        public void write(Entity et, Object vl) { ((LdCollectionStatusLookup)et).setUTimestamp((java.sql.Timestamp)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "COLLECTION_STATUS_LOOKUP";
    protected final String _tablePropertyName = "collectionStatusLookup";
    protected final TableSqlName _tableSqlName = new TableSqlName("COLLECTION_STATUS_LOOKUP", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCollectionStatusCode = cci("COLLECTION_STATUS_CODE", "COLLECTION_STATUS_CODE", null, null, true, "collectionStatusCode", String.class, true, false, "CHAR", 3, 0, null, false, null, null, null, "collectionStatusList", LdCDef.DefMeta.CollectionStatus);
    protected final ColumnInfo _columnCollectionStatusName = cci("COLLECTION_STATUS_NAME", "COLLECTION_STATUS_NAME", null, null, true, "collectionStatusName", String.class, false, false, "VARCHAR", 80, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, true, "RUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, true, "RModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.RegisterModuleType);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, true, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, true, "UUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, true, "UModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.UpdateModuleType);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, true, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    public ColumnInfo columnCollectionStatusCode() { return _columnCollectionStatusCode; }
    public ColumnInfo columnCollectionStatusName() { return _columnCollectionStatusName; }
    public ColumnInfo columnRUser() { return _columnRUser; }
    public ColumnInfo columnRModule() { return _columnRModule; }
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public ColumnInfo columnUUser() { return _columnUUser; }
    public ColumnInfo columnUModule() { return _columnUModule; }
    public ColumnInfo columnUTimestamp() { return _columnUTimestamp; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCollectionStatusCode());
        ls.add(columnCollectionStatusName());
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
    protected UniqueInfo cpui() { return hpcpui(columnCollectionStatusCode()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerCollectionStatusList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCollectionStatusCode(), LdCollectionStatusDbm.getInstance().columnCollectionStatusCode());
        return cri("FK_COLLECTION_STATUS_LOOKUP", "collectionStatusList", this, LdCollectionStatusDbm.getInstance(), mp, false, "collectionStatusLookup");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
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
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdCollectionStatusLookup"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdCollectionStatusLookupCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdCollectionStatusLookupBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdCollectionStatusLookup> getEntityType() { return LdCollectionStatusLookup.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdCollectionStatusLookup newMyEntity() { return new LdCollectionStatusLookup(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdCollectionStatusLookup)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdCollectionStatusLookup)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
