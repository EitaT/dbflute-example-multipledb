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
 * The DB meta of GENRE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdGenreDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdGenreDbm _instance = new LdGenreDbm();
    private LdGenreDbm() {}
    public static LdGenreDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgGenreCode(), "genreCode");
        setupEpg(_epgMap, new EpgGenreName(), "genreName");
        setupEpg(_epgMap, new EpgHierarchyLevel(), "hierarchyLevel");
        setupEpg(_epgMap, new EpgHierarchyOrder(), "hierarchyOrder");
        setupEpg(_epgMap, new EpgParentGenreCode(), "parentGenreCode");
        setupEpg(_epgMap, new EpgRUser(), "RUser");
        setupEpg(_epgMap, new EpgRModule(), "RModule");
        setupEpg(_epgMap, new EpgRTimestamp(), "RTimestamp");
        setupEpg(_epgMap, new EpgUUser(), "UUser");
        setupEpg(_epgMap, new EpgUModule(), "UModule");
        setupEpg(_epgMap, new EpgUTimestamp(), "UTimestamp");
    }
    public static class EpgGenreCode implements PropertyGateway {
        public Object read(Entity et) { return ((LdGenre)et).getGenreCode(); }
        public void write(Entity et, Object vl) { ((LdGenre)et).setGenreCode((String)vl); }
    }
    public static class EpgGenreName implements PropertyGateway {
        public Object read(Entity et) { return ((LdGenre)et).getGenreName(); }
        public void write(Entity et, Object vl) { ((LdGenre)et).setGenreName((String)vl); }
    }
    public static class EpgHierarchyLevel implements PropertyGateway {
        public Object read(Entity et) { return ((LdGenre)et).getHierarchyLevel(); }
        public void write(Entity et, Object vl) { ((LdGenre)et).setHierarchyLevel(ctb(vl)); }
    }
    public static class EpgHierarchyOrder implements PropertyGateway {
        public Object read(Entity et) { return ((LdGenre)et).getHierarchyOrder(); }
        public void write(Entity et, Object vl) { ((LdGenre)et).setHierarchyOrder(ctb(vl)); }
    }
    public static class EpgParentGenreCode implements PropertyGateway {
        public Object read(Entity et) { return ((LdGenre)et).getParentGenreCode(); }
        public void write(Entity et, Object vl) { ((LdGenre)et).setParentGenreCode((String)vl); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdGenre)et).getRUser(); }
        public void write(Entity et, Object vl) { ((LdGenre)et).setRUser((String)vl); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdGenre)et).getRModule(); }
        public void write(Entity et, Object vl) { ((LdGenre)et).setRModule((String)vl); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdGenre)et).getRTimestamp(); }
        public void write(Entity et, Object vl) { ((LdGenre)et).setRTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdGenre)et).getUUser(); }
        public void write(Entity et, Object vl) { ((LdGenre)et).setUUser((String)vl); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdGenre)et).getUModule(); }
        public void write(Entity et, Object vl) { ((LdGenre)et).setUModule((String)vl); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdGenre)et).getUTimestamp(); }
        public void write(Entity et, Object vl) { ((LdGenre)et).setUTimestamp((java.sql.Timestamp)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgGenreSelf(), "genreSelf");
    }
    public class EfpgGenreSelf implements PropertyGateway {
        public Object read(Entity et) { return ((LdGenre)et).getGenreSelf(); }
        public void write(Entity et, Object vl) { ((LdGenre)et).setGenreSelf((LdGenre)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "GENRE";
    protected final String _tablePropertyName = "genre";
    protected final TableSqlName _tableSqlName = new TableSqlName("GENRE", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGenreCode = cci("GENRE_CODE", "GENRE_CODE", null, null, String.class, "genreCode", null, true, false, true, "VARCHAR", 24, 0, null, false, null, null, null, "bookList,genreSelfList", null);
    protected final ColumnInfo _columnGenreName = cci("GENRE_NAME", "GENRE_NAME", null, null, String.class, "genreName", null, false, false, true, "VARCHAR", 80, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnHierarchyLevel = cci("HIERARCHY_LEVEL", "HIERARCHY_LEVEL", null, null, java.math.BigDecimal.class, "hierarchyLevel", null, false, false, true, "NUMERIC", 9, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnHierarchyOrder = cci("HIERARCHY_ORDER", "HIERARCHY_ORDER", null, null, java.math.BigDecimal.class, "hierarchyOrder", null, false, false, true, "NUMERIC", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnParentGenreCode = cci("PARENT_GENRE_CODE", "PARENT_GENRE_CODE", null, null, String.class, "parentGenreCode", null, false, false, false, "VARCHAR", 24, 0, null, false, null, null, "genreSelf", null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, String.class, "RUser", null, false, false, true, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, String.class, "RModule", null, false, false, true, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.RegisterModuleType);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, java.sql.Timestamp.class, "RTimestamp", null, false, false, true, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, String.class, "UUser", null, false, false, true, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, String.class, "UModule", null, false, false, true, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.UpdateModuleType);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, java.sql.Timestamp.class, "UTimestamp", null, false, false, true, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    /**
     * GENRE_CODE: {PK, NotNull, VARCHAR(24)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenreCode() { return _columnGenreCode; }
    /**
     * GENRE_NAME: {NotNull, VARCHAR(80)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenreName() { return _columnGenreName; }
    /**
     * HIERARCHY_LEVEL: {NotNull, NUMERIC(9)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHierarchyLevel() { return _columnHierarchyLevel; }
    /**
     * HIERARCHY_ORDER: {NotNull, NUMERIC(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHierarchyOrder() { return _columnHierarchyOrder; }
    /**
     * PARENT_GENRE_CODE: {IX, VARCHAR(24), FK to GENRE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParentGenreCode() { return _columnParentGenreCode; }
    /**
     * R_USER: {NotNull, VARCHAR(100), default=[default-user]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRUser() { return _columnRUser; }
    /**
     * R_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=RegisterModuleType}
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
     * U_MODULE: {NotNull, VARCHAR(100), default=[default-module], classification=UpdateModuleType}
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
        ls.add(columnGenreCode());
        ls.add(columnGenreName());
        ls.add(columnHierarchyLevel());
        ls.add(columnHierarchyOrder());
        ls.add(columnParentGenreCode());
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
    protected UniqueInfo cpui() { return hpcpui(columnGenreCode()); }
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
     * GENRE by my PARENT_GENRE_CODE, named 'genreSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGenreSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnParentGenreCode(), LdGenreDbm.getInstance().columnGenreCode());
        return cfi("FK_GENRE_GENRE", "genreSelf", this, LdGenreDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "genreSelfList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * BOOK by GENRE_CODE, named 'bookList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBookList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGenreCode(), LdBookDbm.getInstance().columnGenreCode());
        return cri("FK_BOOK_GENRE", "bookList", this, LdBookDbm.getInstance(), mp, false, "genre");
    }
    /**
     * GENRE by PARENT_GENRE_CODE, named 'genreSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerGenreSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGenreCode(), LdGenreDbm.getInstance().columnParentGenreCode());
        return cri("FK_GENRE_GENRE", "genreSelfList", this, LdGenreDbm.getInstance(), mp, false, "genreSelf");
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
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdGenre"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdGenreCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdGenreBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdGenre> getEntityType() { return LdGenre.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdGenre newEntity() { return new LdGenre(); }
    public LdGenre newMyEntity() { return new LdGenre(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdGenre)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdGenre)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
