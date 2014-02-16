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
 * The DB meta of GARBAGE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdGarbageDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdGarbageDbm _instance = new LdGarbageDbm();
    private LdGarbageDbm() {}
    public static LdGarbageDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgRTimestamp(), "RTimestamp");
        setupEpg(_epgMap, new EpgUUser(), "UUser");
        setupEpg(_epgMap, new EpgUTimestamp(), "UTimestamp");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgGarbageMemo implements PropertyGateway {
        public Object read(Entity et) { return ((LdGarbage)et).getGarbageMemo(); }
        public void write(Entity et, Object vl) { ((LdGarbage)et).setGarbageMemo((String)vl); }
    }
    public static class EpgGarbageTime implements PropertyGateway {
        public Object read(Entity et) { return ((LdGarbage)et).getGarbageTime(); }
        public void write(Entity et, Object vl) { ((LdGarbage)et).setGarbageTime((java.sql.Timestamp)vl); }
    }
    public static class EpgGarbageCount implements PropertyGateway {
        public Object read(Entity et) { return ((LdGarbage)et).getGarbageCount(); }
        public void write(Entity et, Object vl) { ((LdGarbage)et).setGarbageCount(cti(vl)); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdGarbage)et).getRUser(); }
        public void write(Entity et, Object vl) { ((LdGarbage)et).setRUser((String)vl); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdGarbage)et).getRTimestamp(); }
        public void write(Entity et, Object vl) { ((LdGarbage)et).setRTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdGarbage)et).getUUser(); }
        public void write(Entity et, Object vl) { ((LdGarbage)et).setUUser((String)vl); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdGarbage)et).getUTimestamp(); }
        public void write(Entity et, Object vl) { ((LdGarbage)et).setUTimestamp((java.sql.Timestamp)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "GARBAGE";
    protected final String _tablePropertyName = "garbage";
    protected final TableSqlName _tableSqlName = new TableSqlName("GARBAGE", _tableDbName);
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
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, false, "RUser", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, false, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, false, "UUser", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, false, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, null, false, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    public ColumnInfo columnGarbageMemo() { return _columnGarbageMemo; }
    public ColumnInfo columnGarbageTime() { return _columnGarbageTime; }
    public ColumnInfo columnGarbageCount() { return _columnGarbageCount; }
    public ColumnInfo columnRUser() { return _columnRUser; }
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public ColumnInfo columnUUser() { return _columnUUser; }
    public ColumnInfo columnUTimestamp() { return _columnUTimestamp; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnGarbageMemo());
        ls.add(columnGarbageTime());
        ls.add(columnGarbageCount());
        ls.add(columnRUser());
        ls.add(columnRTimestamp());
        ls.add(columnUUser());
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
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdGarbage"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdGarbageCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdGarbageBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdGarbage> getEntityType() { return LdGarbage.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdGarbage newMyEntity() { return new LdGarbage(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdGarbage)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdGarbage)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
