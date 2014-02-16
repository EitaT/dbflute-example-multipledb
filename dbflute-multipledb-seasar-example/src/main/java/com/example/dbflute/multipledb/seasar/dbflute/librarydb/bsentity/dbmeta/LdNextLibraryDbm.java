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
 * The DB meta of NEXT_LIBRARY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdNextLibraryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdNextLibraryDbm _instance = new LdNextLibraryDbm();
    private LdNextLibraryDbm() {}
    public static LdNextLibraryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgNextLibraryId(), "nextLibraryId");
        setupEpg(_epgMap, new EpgDistanceKm(), "distanceKm");
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
        public Object read(Entity et) { return ((LdNextLibrary)et).getLibraryId(); }
        public void write(Entity et, Object vl) { ((LdNextLibrary)et).setLibraryId(cti(vl)); }
    }
    public static class EpgNextLibraryId implements PropertyGateway {
        public Object read(Entity et) { return ((LdNextLibrary)et).getNextLibraryId(); }
        public void write(Entity et, Object vl) { ((LdNextLibrary)et).setNextLibraryId(cti(vl)); }
    }
    public static class EpgDistanceKm implements PropertyGateway {
        public Object read(Entity et) { return ((LdNextLibrary)et).getDistanceKm(); }
        public void write(Entity et, Object vl) { ((LdNextLibrary)et).setDistanceKm(ctb(vl)); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdNextLibrary)et).getRUser(); }
        public void write(Entity et, Object vl) { ((LdNextLibrary)et).setRUser((String)vl); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdNextLibrary)et).getRModule(); }
        public void write(Entity et, Object vl) { ((LdNextLibrary)et).setRModule((String)vl); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdNextLibrary)et).getRTimestamp(); }
        public void write(Entity et, Object vl) { ((LdNextLibrary)et).setRTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdNextLibrary)et).getUUser(); }
        public void write(Entity et, Object vl) { ((LdNextLibrary)et).setUUser((String)vl); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdNextLibrary)et).getUModule(); }
        public void write(Entity et, Object vl) { ((LdNextLibrary)et).setUModule((String)vl); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdNextLibrary)et).getUTimestamp(); }
        public void write(Entity et, Object vl) { ((LdNextLibrary)et).setUTimestamp((java.sql.Timestamp)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "NEXT_LIBRARY";
    protected final String _tablePropertyName = "nextLibrary";
    protected final TableSqlName _tableSqlName = new TableSqlName("NEXT_LIBRARY", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLibraryId = cci("LIBRARY_ID", "LIBRARY_ID", null, null, true, "libraryId", Integer.class, true, false, "SMALLINT", 5, 0, null, false, null, null, "libraryByLibraryId", null, null);
    protected final ColumnInfo _columnNextLibraryId = cci("NEXT_LIBRARY_ID", "NEXT_LIBRARY_ID", null, null, true, "nextLibraryId", Integer.class, true, false, "SMALLINT", 5, 0, null, false, null, null, "libraryByNextLibraryId", null, null);
    protected final ColumnInfo _columnDistanceKm = cci("DISTANCE_KM", "DISTANCE_KM", null, null, true, "distanceKm", java.math.BigDecimal.class, false, false, "NUMERIC", 4, 2, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, true, "RUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, true, "RModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.RegisterModuleType);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, true, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, true, "UUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, true, "UModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.UpdateModuleType);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, true, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    public ColumnInfo columnLibraryId() { return _columnLibraryId; }
    public ColumnInfo columnNextLibraryId() { return _columnNextLibraryId; }
    public ColumnInfo columnDistanceKm() { return _columnDistanceKm; }
    public ColumnInfo columnRUser() { return _columnRUser; }
    public ColumnInfo columnRModule() { return _columnRModule; }
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public ColumnInfo columnUUser() { return _columnUUser; }
    public ColumnInfo columnUModule() { return _columnUModule; }
    public ColumnInfo columnUTimestamp() { return _columnUTimestamp; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLibraryId());
        ls.add(columnNextLibraryId());
        ls.add(columnDistanceKm());
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
        ls.add(columnNextLibraryId());
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
    public ForeignInfo foreignLibraryByLibraryId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLibraryId(), LdLibraryDbm.getInstance().columnLibraryId());
        return cfi("FK_NEXT_LIBRARY_LIBRARY_ID", "libraryByLibraryId", this, LdLibraryDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "nextLibraryByLibraryIdList");
    }
    public ForeignInfo foreignLibraryByNextLibraryId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNextLibraryId(), LdLibraryDbm.getInstance().columnLibraryId());
        return cfi("FK_NEXT_LIBRARY_NEXT_LIBRARY_ID", "libraryByNextLibraryId", this, LdLibraryDbm.getInstance(), mp, 1, false, false, false, false, null, null, false, "nextLibraryByNextLibraryIdList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

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
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdNextLibrary"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdNextLibraryCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdNextLibraryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdNextLibrary> getEntityType() { return LdNextLibrary.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdNextLibrary newMyEntity() { return new LdNextLibrary(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdNextLibrary)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdNextLibrary)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
