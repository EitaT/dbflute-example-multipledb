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
 * The DB meta of LIBRARY_TYPE_LOOKUP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdLibraryTypeLookupDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdLibraryTypeLookupDbm _instance = new LdLibraryTypeLookupDbm();
    private LdLibraryTypeLookupDbm() {}
    public static LdLibraryTypeLookupDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return LdDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgLibraryTypeCode(), "libraryTypeCode");
        setupEpg(_epgMap, new EpgLibraryTypeName(), "libraryTypeName");
        setupEpg(_epgMap, new EpgRUser(), "RUser");
        setupEpg(_epgMap, new EpgRModule(), "RModule");
        setupEpg(_epgMap, new EpgRTimestamp(), "RTimestamp");
        setupEpg(_epgMap, new EpgUUser(), "UUser");
        setupEpg(_epgMap, new EpgUModule(), "UModule");
        setupEpg(_epgMap, new EpgUTimestamp(), "UTimestamp");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgLibraryTypeCode implements PropertyGateway {
        public Object read(Entity e) { return ((LdLibraryTypeLookup)e).getLibraryTypeCode(); }
        public void write(Entity e, Object v) { ((LdLibraryTypeLookup)e).setLibraryTypeCode((String)v); }
    }
    public static class EpgLibraryTypeName implements PropertyGateway {
        public Object read(Entity e) { return ((LdLibraryTypeLookup)e).getLibraryTypeName(); }
        public void write(Entity e, Object v) { ((LdLibraryTypeLookup)e).setLibraryTypeName((String)v); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity e) { return ((LdLibraryTypeLookup)e).getRUser(); }
        public void write(Entity e, Object v) { ((LdLibraryTypeLookup)e).setRUser((String)v); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity e) { return ((LdLibraryTypeLookup)e).getRModule(); }
        public void write(Entity e, Object v) { ((LdLibraryTypeLookup)e).setRModule((String)v); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((LdLibraryTypeLookup)e).getRTimestamp(); }
        public void write(Entity e, Object v) { ((LdLibraryTypeLookup)e).setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity e) { return ((LdLibraryTypeLookup)e).getUUser(); }
        public void write(Entity e, Object v) { ((LdLibraryTypeLookup)e).setUUser((String)v); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity e) { return ((LdLibraryTypeLookup)e).getUModule(); }
        public void write(Entity e, Object v) { ((LdLibraryTypeLookup)e).setUModule((String)v); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((LdLibraryTypeLookup)e).getUTimestamp(); }
        public void write(Entity e, Object v) { ((LdLibraryTypeLookup)e).setUTimestamp((java.sql.Timestamp)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LIBRARY_TYPE_LOOKUP";
    protected final String _tablePropertyName = "libraryTypeLookup";
    protected final TableSqlName _tableSqlName = new TableSqlName("LIBRARY_TYPE_LOOKUP", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLibraryTypeCode = cci("LIBRARY_TYPE_CODE", "LIBRARY_TYPE_CODE", null, null, true, "libraryTypeCode", String.class, true, false, "CHAR", 3, 0, null, false, null, null, null, "libraryList", null);
    protected final ColumnInfo _columnLibraryTypeName = cci("LIBRARY_TYPE_NAME", "LIBRARY_TYPE_NAME", null, null, true, "libraryTypeName", String.class, false, false, "VARCHAR", 80, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, true, "RUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, true, "RModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.RegisterModuleType);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, true, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, true, "UUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, true, "UModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.UpdateModuleType);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, true, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    public ColumnInfo columnLibraryTypeCode() { return _columnLibraryTypeCode; }
    public ColumnInfo columnLibraryTypeName() { return _columnLibraryTypeName; }
    public ColumnInfo columnRUser() { return _columnRUser; }
    public ColumnInfo columnRModule() { return _columnRModule; }
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public ColumnInfo columnUUser() { return _columnUUser; }
    public ColumnInfo columnUModule() { return _columnUModule; }
    public ColumnInfo columnUTimestamp() { return _columnUTimestamp; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLibraryTypeCode());
        ls.add(columnLibraryTypeName());
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
    protected UniqueInfo cpui() { return hpcpui(columnLibraryTypeCode()); }
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
    public ReferrerInfo referrerLibraryList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnLibraryTypeCode(), LdLibraryDbm.getInstance().columnLibraryTypeCode());
        return cri("FK_LIBRARY_LIBRARY_TYPE_LOOKUP", "libraryList", this, LdLibraryDbm.getInstance(), map, false, "libraryTypeLookup");
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
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdLibraryTypeLookup"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdLibraryTypeLookupCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdLibraryTypeLookupBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdLibraryTypeLookup> getEntityType() { return LdLibraryTypeLookup.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdLibraryTypeLookup newMyEntity() { return new LdLibraryTypeLookup(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((LdLibraryTypeLookup)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((LdLibraryTypeLookup)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
