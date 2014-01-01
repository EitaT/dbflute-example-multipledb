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
 * The DB meta of GARBAGE_PLUS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdGarbagePlusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdGarbagePlusDbm _instance = new LdGarbagePlusDbm();
    private LdGarbagePlusDbm() {}
    public static LdGarbagePlusDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return LdDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgGarbageMemo(), "garbageMemo");
        setupEpg(_epgMap, new EpgGarbageTime(), "garbageTime");
        setupEpg(_epgMap, new EpgGarbageCount(), "garbageCount");
        setupEpg(_epgMap, new EpgRUser(), "RUser");
        setupEpg(_epgMap, new EpgRModule(), "RModule");
        setupEpg(_epgMap, new EpgRTimestamp(), "RTimestamp");
        setupEpg(_epgMap, new EpgUUser(), "UUser");
        setupEpg(_epgMap, new EpgUModule(), "UModule");
        setupEpg(_epgMap, new EpgUTimestamp(), "UTimestamp");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgGarbageMemo implements PropertyGateway {
        public Object read(Entity e) { return ((LdGarbagePlus)e).getGarbageMemo(); }
        public void write(Entity e, Object v) { ((LdGarbagePlus)e).setGarbageMemo((String)v); }
    }
    public static class EpgGarbageTime implements PropertyGateway {
        public Object read(Entity e) { return ((LdGarbagePlus)e).getGarbageTime(); }
        public void write(Entity e, Object v) { ((LdGarbagePlus)e).setGarbageTime((java.sql.Timestamp)v); }
    }
    public static class EpgGarbageCount implements PropertyGateway {
        public Object read(Entity e) { return ((LdGarbagePlus)e).getGarbageCount(); }
        public void write(Entity e, Object v) { ((LdGarbagePlus)e).setGarbageCount(cti(v)); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity e) { return ((LdGarbagePlus)e).getRUser(); }
        public void write(Entity e, Object v) { ((LdGarbagePlus)e).setRUser((String)v); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity e) { return ((LdGarbagePlus)e).getRModule(); }
        public void write(Entity e, Object v) { ((LdGarbagePlus)e).setRModule((String)v); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((LdGarbagePlus)e).getRTimestamp(); }
        public void write(Entity e, Object v) { ((LdGarbagePlus)e).setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity e) { return ((LdGarbagePlus)e).getUUser(); }
        public void write(Entity e, Object v) { ((LdGarbagePlus)e).setUUser((String)v); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity e) { return ((LdGarbagePlus)e).getUModule(); }
        public void write(Entity e, Object v) { ((LdGarbagePlus)e).setUModule((String)v); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((LdGarbagePlus)e).getUTimestamp(); }
        public void write(Entity e, Object v) { ((LdGarbagePlus)e).setUTimestamp((java.sql.Timestamp)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "GARBAGE_PLUS";
    protected final String _tablePropertyName = "garbagePlus";
    protected final TableSqlName _tableSqlName = new TableSqlName("GARBAGE_PLUS", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGarbageMemo = cci("GARBAGE_MEMO", "GARBAGE_MEMO", null, null, false, "garbageMemo", String.class, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnGarbageTime = cci("GARBAGE_TIME", "GARBAGE_TIME", null, null, false, "garbageTime", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnGarbageCount = cci("GARBAGE_COUNT", "GARBAGE_COUNT", null, null, false, "garbageCount", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, true, "RUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, true, "RModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, true, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, true, "UUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, true, "UModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, true, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    public ColumnInfo columnGarbageMemo() { return _columnGarbageMemo; }
    public ColumnInfo columnGarbageTime() { return _columnGarbageTime; }
    public ColumnInfo columnGarbageCount() { return _columnGarbageCount; }
    public ColumnInfo columnRUser() { return _columnRUser; }
    public ColumnInfo columnRModule() { return _columnRModule; }
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public ColumnInfo columnUUser() { return _columnUUser; }
    public ColumnInfo columnUModule() { return _columnUModule; }
    public ColumnInfo columnUTimestamp() { return _columnUTimestamp; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnGarbageMemo());
        ls.add(columnGarbageTime());
        ls.add(columnGarbageCount());
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
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasUpdateDate() { return true; }
    public ColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdGarbagePlus"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdGarbagePlusCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdGarbagePlusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdGarbagePlus> getEntityType() { return LdGarbagePlus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdGarbagePlus newMyEntity() { return new LdGarbagePlus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((LdGarbagePlus)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((LdGarbagePlus)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
