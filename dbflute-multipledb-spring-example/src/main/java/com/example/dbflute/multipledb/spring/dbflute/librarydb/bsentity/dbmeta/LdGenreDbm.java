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
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgGenreCode implements PropertyGateway {
        public Object read(Entity e) { return ((LdGenre)e).getGenreCode(); }
        public void write(Entity e, Object v) { ((LdGenre)e).setGenreCode((String)v); }
    }
    public static class EpgGenreName implements PropertyGateway {
        public Object read(Entity e) { return ((LdGenre)e).getGenreName(); }
        public void write(Entity e, Object v) { ((LdGenre)e).setGenreName((String)v); }
    }
    public static class EpgHierarchyLevel implements PropertyGateway {
        public Object read(Entity e) { return ((LdGenre)e).getHierarchyLevel(); }
        public void write(Entity e, Object v) { ((LdGenre)e).setHierarchyLevel(ctb(v)); }
    }
    public static class EpgHierarchyOrder implements PropertyGateway {
        public Object read(Entity e) { return ((LdGenre)e).getHierarchyOrder(); }
        public void write(Entity e, Object v) { ((LdGenre)e).setHierarchyOrder(ctb(v)); }
    }
    public static class EpgParentGenreCode implements PropertyGateway {
        public Object read(Entity e) { return ((LdGenre)e).getParentGenreCode(); }
        public void write(Entity e, Object v) { ((LdGenre)e).setParentGenreCode((String)v); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity e) { return ((LdGenre)e).getRUser(); }
        public void write(Entity e, Object v) { ((LdGenre)e).setRUser((String)v); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity e) { return ((LdGenre)e).getRModule(); }
        public void write(Entity e, Object v) { ((LdGenre)e).setRModule((String)v); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((LdGenre)e).getRTimestamp(); }
        public void write(Entity e, Object v) { ((LdGenre)e).setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity e) { return ((LdGenre)e).getUUser(); }
        public void write(Entity e, Object v) { ((LdGenre)e).setUUser((String)v); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity e) { return ((LdGenre)e).getUModule(); }
        public void write(Entity e, Object v) { ((LdGenre)e).setUModule((String)v); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((LdGenre)e).getUTimestamp(); }
        public void write(Entity e, Object v) { ((LdGenre)e).setUTimestamp((java.sql.Timestamp)v); }
    }

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
    protected final ColumnInfo _columnGenreCode = cci("GENRE_CODE", "GENRE_CODE", null, null, true, "genreCode", String.class, true, false, "VARCHAR", 24, 0, null, false, null, null, null, "bookList,genreSelfList", null);
    protected final ColumnInfo _columnGenreName = cci("GENRE_NAME", "GENRE_NAME", null, null, true, "genreName", String.class, false, false, "VARCHAR", 80, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnHierarchyLevel = cci("HIERARCHY_LEVEL", "HIERARCHY_LEVEL", null, null, true, "hierarchyLevel", java.math.BigDecimal.class, false, false, "NUMERIC", 9, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnHierarchyOrder = cci("HIERARCHY_ORDER", "HIERARCHY_ORDER", null, null, true, "hierarchyOrder", java.math.BigDecimal.class, false, false, "NUMERIC", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnParentGenreCode = cci("PARENT_GENRE_CODE", "PARENT_GENRE_CODE", null, null, false, "parentGenreCode", String.class, false, false, "VARCHAR", 24, 0, null, false, null, null, "genreSelf", null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, true, "RUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, true, "RModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, true, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, true, "UUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, true, "UModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, true, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    public ColumnInfo columnGenreCode() { return _columnGenreCode; }
    public ColumnInfo columnGenreName() { return _columnGenreName; }
    public ColumnInfo columnHierarchyLevel() { return _columnHierarchyLevel; }
    public ColumnInfo columnHierarchyOrder() { return _columnHierarchyOrder; }
    public ColumnInfo columnParentGenreCode() { return _columnParentGenreCode; }
    public ColumnInfo columnRUser() { return _columnRUser; }
    public ColumnInfo columnRModule() { return _columnRModule; }
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public ColumnInfo columnUUser() { return _columnUUser; }
    public ColumnInfo columnUModule() { return _columnUModule; }
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
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignGenreSelf() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnParentGenreCode(), LdGenreDbm.getInstance().columnGenreCode());
        return cfi("FK_GENRE_GENRE", "genreSelf", this, LdGenreDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "genreSelfList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerBookList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnGenreCode(), LdBookDbm.getInstance().columnGenreCode());
        return cri("FK_BOOK_GENRE", "bookList", this, LdBookDbm.getInstance(), map, false, "genre");
    }
    public ReferrerInfo referrerGenreSelfList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnGenreCode(), LdGenreDbm.getInstance().columnParentGenreCode());
        return cri("FK_GENRE_GENRE", "genreSelfList", this, LdGenreDbm.getInstance(), map, false, "genreSelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasUpdateDate() { return true; }
    public ColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdGenre"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdGenreCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdGenreBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdGenre> getEntityType() { return LdGenre.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdGenre newMyEntity() { return new LdGenre(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((LdGenre)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((LdGenre)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
