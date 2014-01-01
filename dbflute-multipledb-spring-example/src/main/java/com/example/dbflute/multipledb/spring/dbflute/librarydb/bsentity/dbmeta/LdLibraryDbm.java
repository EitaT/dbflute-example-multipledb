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
 * The DB meta of LIBRARY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdLibraryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdLibraryDbm _instance = new LdLibraryDbm();
    private LdLibraryDbm() {}
    public static LdLibraryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgLibraryName(), "libraryName");
        setupEpg(_epgMap, new EpgLibraryTypeCode(), "libraryTypeCode");
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
        public Object read(Entity e) { return ((LdLibrary)e).getLibraryId(); }
        public void write(Entity e, Object v) { ((LdLibrary)e).setLibraryId(cti(v)); }
    }
    public static class EpgLibraryName implements PropertyGateway {
        public Object read(Entity e) { return ((LdLibrary)e).getLibraryName(); }
        public void write(Entity e, Object v) { ((LdLibrary)e).setLibraryName((String)v); }
    }
    public static class EpgLibraryTypeCode implements PropertyGateway {
        public Object read(Entity e) { return ((LdLibrary)e).getLibraryTypeCode(); }
        public void write(Entity e, Object v) { ((LdLibrary)e).setLibraryTypeCode((String)v); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity e) { return ((LdLibrary)e).getRUser(); }
        public void write(Entity e, Object v) { ((LdLibrary)e).setRUser((String)v); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity e) { return ((LdLibrary)e).getRModule(); }
        public void write(Entity e, Object v) { ((LdLibrary)e).setRModule((String)v); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((LdLibrary)e).getRTimestamp(); }
        public void write(Entity e, Object v) { ((LdLibrary)e).setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity e) { return ((LdLibrary)e).getUUser(); }
        public void write(Entity e, Object v) { ((LdLibrary)e).setUUser((String)v); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity e) { return ((LdLibrary)e).getUModule(); }
        public void write(Entity e, Object v) { ((LdLibrary)e).setUModule((String)v); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((LdLibrary)e).getUTimestamp(); }
        public void write(Entity e, Object v) { ((LdLibrary)e).setUTimestamp((java.sql.Timestamp)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LIBRARY";
    protected final String _tablePropertyName = "library";
    protected final TableSqlName _tableSqlName = new TableSqlName("LIBRARY", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLibraryId = cci("LIBRARY_ID", "LIBRARY_ID", null, null, true, "libraryId", Integer.class, true, true, "SMALLINT", 5, 0, "GENERATED_BY_DEFAULT", false, null, null, null, "collectionList,libraryUserList,nextLibraryByLibraryIdList,nextLibraryByNextLibraryIdList", null);
    protected final ColumnInfo _columnLibraryName = cci("LIBRARY_NAME", "LIBRARY_NAME", null, null, true, "libraryName", String.class, false, false, "VARCHAR", 80, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnLibraryTypeCode = cci("LIBRARY_TYPE_CODE", "LIBRARY_TYPE_CODE", null, null, true, "libraryTypeCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "libraryTypeLookup", null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, true, "RUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, true, "RModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, true, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, true, "UUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, true, "UModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, true, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    public ColumnInfo columnLibraryId() { return _columnLibraryId; }
    public ColumnInfo columnLibraryName() { return _columnLibraryName; }
    public ColumnInfo columnLibraryTypeCode() { return _columnLibraryTypeCode; }
    public ColumnInfo columnRUser() { return _columnRUser; }
    public ColumnInfo columnRModule() { return _columnRModule; }
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public ColumnInfo columnUUser() { return _columnUUser; }
    public ColumnInfo columnUModule() { return _columnUModule; }
    public ColumnInfo columnUTimestamp() { return _columnUTimestamp; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLibraryId());
        ls.add(columnLibraryName());
        ls.add(columnLibraryTypeCode());
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
    protected UniqueInfo cpui() { return hpcpui(columnLibraryId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignLibraryTypeLookup() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnLibraryTypeCode(), LdLibraryTypeLookupDbm.getInstance().columnLibraryTypeCode());
        return cfi("FK_LIBRARY_LIBRARY_TYPE_LOOKUP", "libraryTypeLookup", this, LdLibraryTypeLookupDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "libraryList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerCollectionList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnLibraryId(), LdCollectionDbm.getInstance().columnLibraryId());
        return cri("FK_COLLECTION_LIBRARY", "collectionList", this, LdCollectionDbm.getInstance(), map, false, "library");
    }
    public ReferrerInfo referrerLibraryUserList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnLibraryId(), LdLibraryUserDbm.getInstance().columnLibraryId());
        return cri("FK_LIBRARY_USER_LIBRARY", "libraryUserList", this, LdLibraryUserDbm.getInstance(), map, false, "library");
    }
    public ReferrerInfo referrerNextLibraryByLibraryIdList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnLibraryId(), LdNextLibraryDbm.getInstance().columnLibraryId());
        return cri("FK_NEXT_LIBRARY_LIBRARY_ID", "nextLibraryByLibraryIdList", this, LdNextLibraryDbm.getInstance(), map, false, "libraryByLibraryId");
    }
    public ReferrerInfo referrerNextLibraryByNextLibraryIdList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnLibraryId(), LdNextLibraryDbm.getInstance().columnNextLibraryId());
        return cri("FK_NEXT_LIBRARY_NEXT_LIBRARY_ID", "nextLibraryByNextLibraryIdList", this, LdNextLibraryDbm.getInstance(), map, false, "libraryByNextLibraryId");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasUpdateDate() { return true; }
    public ColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdLibrary"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdLibraryCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdLibraryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdLibrary> getEntityType() { return LdLibrary.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdLibrary newMyEntity() { return new LdLibrary(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((LdLibrary)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((LdLibrary)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
