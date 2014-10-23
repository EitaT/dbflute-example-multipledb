/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;

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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
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
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgLibraryByLibraryId(), "libraryByLibraryId");
        setupEfpg(_efpgMap, new EfpgLibraryByNextLibraryId(), "libraryByNextLibraryId");
    }
    public class EfpgLibraryByLibraryId implements PropertyGateway {
        public Object read(Entity et) { return ((LdNextLibrary)et).getLibraryByLibraryId(); }
        public void write(Entity et, Object vl) { ((LdNextLibrary)et).setLibraryByLibraryId((LdLibrary)vl); }
    }
    public class EfpgLibraryByNextLibraryId implements PropertyGateway {
        public Object read(Entity et) { return ((LdNextLibrary)et).getLibraryByNextLibraryId(); }
        public void write(Entity et, Object vl) { ((LdNextLibrary)et).setLibraryByNextLibraryId((LdLibrary)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

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
    protected final ColumnInfo _columnLibraryId = cci("LIBRARY_ID", "LIBRARY_ID", null, null, Integer.class, "libraryId", null, true, false, true, "SMALLINT", 5, 0, null, false, null, null, "libraryByLibraryId", null, null);
    protected final ColumnInfo _columnNextLibraryId = cci("NEXT_LIBRARY_ID", "NEXT_LIBRARY_ID", null, null, Integer.class, "nextLibraryId", null, true, false, true, "SMALLINT", 5, 0, null, false, null, null, "libraryByNextLibraryId", null, null);
    protected final ColumnInfo _columnDistanceKm = cci("DISTANCE_KM", "DISTANCE_KM", null, null, java.math.BigDecimal.class, "distanceKm", null, false, false, true, "NUMERIC", 4, 2, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, String.class, "RUser", null, false, false, true, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, String.class, "RModule", null, false, false, true, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, java.sql.Timestamp.class, "RTimestamp", null, false, false, true, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, String.class, "UUser", null, false, false, true, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, String.class, "UModule", null, false, false, true, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, java.sql.Timestamp.class, "UTimestamp", null, false, false, true, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    /**
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLibraryId() { return _columnLibraryId; }
    /**
     * NEXT_LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNextLibraryId() { return _columnNextLibraryId; }
    /**
     * DISTANCE_KM: {NotNull, NUMERIC(4, 2)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistanceKm() { return _columnDistanceKm; }
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
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * LIBRARY by my LIBRARY_ID, named 'libraryByLibraryId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLibraryByLibraryId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLibraryId(), LdLibraryDbm.getInstance().columnLibraryId());
        return cfi("FK_NEXT_LIBRARY_LIBRARY_ID", "libraryByLibraryId", this, LdLibraryDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "nextLibraryByLibraryIdList");
    }
    /**
     * LIBRARY by my NEXT_LIBRARY_ID, named 'libraryByNextLibraryId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLibraryByNextLibraryId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNextLibraryId(), LdLibraryDbm.getInstance().columnLibraryId());
        return cfi("FK_NEXT_LIBRARY_NEXT_LIBRARY_ID", "libraryByNextLibraryId", this, LdLibraryDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "nextLibraryByNextLibraryIdList");
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
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdNextLibrary"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdNextLibraryCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdNextLibraryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdNextLibrary> getEntityType() { return LdNextLibrary.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdNextLibrary newEntity() { return new LdNextLibrary(); }
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
