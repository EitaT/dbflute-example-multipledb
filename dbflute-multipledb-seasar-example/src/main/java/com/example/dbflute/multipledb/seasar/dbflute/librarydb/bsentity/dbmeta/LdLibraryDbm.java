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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
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
    public static class EpgLibraryId implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibrary)et).getLibraryId(); }
        public void write(Entity et, Object vl) { ((LdLibrary)et).setLibraryId(cti(vl)); }
    }
    public static class EpgLibraryName implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibrary)et).getLibraryName(); }
        public void write(Entity et, Object vl) { ((LdLibrary)et).setLibraryName((String)vl); }
    }
    public static class EpgLibraryTypeCode implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibrary)et).getLibraryTypeCode(); }
        public void write(Entity et, Object vl) { ((LdLibrary)et).setLibraryTypeCode((String)vl); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibrary)et).getRUser(); }
        public void write(Entity et, Object vl) { ((LdLibrary)et).setRUser((String)vl); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibrary)et).getRModule(); }
        public void write(Entity et, Object vl) { ((LdLibrary)et).setRModule((String)vl); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibrary)et).getRTimestamp(); }
        public void write(Entity et, Object vl) { ((LdLibrary)et).setRTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibrary)et).getUUser(); }
        public void write(Entity et, Object vl) { ((LdLibrary)et).setUUser((String)vl); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibrary)et).getUModule(); }
        public void write(Entity et, Object vl) { ((LdLibrary)et).setUModule((String)vl); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibrary)et).getUTimestamp(); }
        public void write(Entity et, Object vl) { ((LdLibrary)et).setUTimestamp((java.sql.Timestamp)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgLibraryTypeLookup(), "libraryTypeLookup");
    }
    public class EfpgLibraryTypeLookup implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibrary)et).getLibraryTypeLookup(); }
        public void write(Entity et, Object vl) { ((LdLibrary)et).setLibraryTypeLookup((LdLibraryTypeLookup)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

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
    protected final ColumnInfo _columnLibraryId = cci("LIBRARY_ID", "LIBRARY_ID", null, null, Integer.class, "libraryId", null, true, true, true, "SMALLINT", 5, 0, "GENERATED_BY_DEFAULT", false, null, null, null, "collectionList,libraryUserList,nextLibraryByLibraryIdList,nextLibraryByNextLibraryIdList", null);
    protected final ColumnInfo _columnLibraryName = cci("LIBRARY_NAME", "LIBRARY_NAME", null, null, String.class, "libraryName", null, false, false, true, "VARCHAR", 80, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnLibraryTypeCode = cci("LIBRARY_TYPE_CODE", "LIBRARY_TYPE_CODE", null, null, String.class, "libraryTypeCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "libraryTypeLookup", null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, String.class, "RUser", null, false, false, true, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, String.class, "RModule", null, false, false, true, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.RegisterModuleType);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, java.sql.Timestamp.class, "RTimestamp", null, false, false, true, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, String.class, "UUser", null, false, false, true, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, String.class, "UModule", null, false, false, true, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.UpdateModuleType);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, java.sql.Timestamp.class, "UTimestamp", null, false, false, true, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    /**
     * LIBRARY_ID: {PK, ID, NotNull, SMALLINT(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLibraryId() { return _columnLibraryId; }
    /**
     * LIBRARY_NAME: {UQ, NotNull, VARCHAR(80)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLibraryName() { return _columnLibraryName; }
    /**
     * LIBRARY_TYPE_CODE: {IX, NotNull, CHAR(3), FK to LIBRARY_TYPE_LOOKUP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLibraryTypeCode() { return _columnLibraryTypeCode; }
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
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * LIBRARY_TYPE_LOOKUP by my LIBRARY_TYPE_CODE, named 'libraryTypeLookup'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLibraryTypeLookup() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLibraryTypeCode(), LdLibraryTypeLookupDbm.getInstance().columnLibraryTypeCode());
        return cfi("FK_LIBRARY_LIBRARY_TYPE_LOOKUP", "libraryTypeLookup", this, LdLibraryTypeLookupDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "libraryList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * COLLECTION by LIBRARY_ID, named 'collectionList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCollectionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLibraryId(), LdCollectionDbm.getInstance().columnLibraryId());
        return cri("FK_COLLECTION_LIBRARY", "collectionList", this, LdCollectionDbm.getInstance(), mp, false, "library");
    }
    /**
     * LIBRARY_USER by LIBRARY_ID, named 'libraryUserList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerLibraryUserList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLibraryId(), LdLibraryUserDbm.getInstance().columnLibraryId());
        return cri("FK_LIBRARY_USER_LIBRARY", "libraryUserList", this, LdLibraryUserDbm.getInstance(), mp, false, "library");
    }
    /**
     * NEXT_LIBRARY by LIBRARY_ID, named 'nextLibraryByLibraryIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerNextLibraryByLibraryIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLibraryId(), LdNextLibraryDbm.getInstance().columnLibraryId());
        return cri("FK_NEXT_LIBRARY_LIBRARY_ID", "nextLibraryByLibraryIdList", this, LdNextLibraryDbm.getInstance(), mp, false, "libraryByLibraryId");
    }
    /**
     * NEXT_LIBRARY by NEXT_LIBRARY_ID, named 'nextLibraryByNextLibraryIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerNextLibraryByNextLibraryIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLibraryId(), LdNextLibraryDbm.getInstance().columnNextLibraryId());
        return cri("FK_NEXT_LIBRARY_NEXT_LIBRARY_ID", "nextLibraryByNextLibraryIdList", this, LdNextLibraryDbm.getInstance(), mp, false, "libraryByNextLibraryId");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
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
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdLibrary"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdLibraryCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdLibraryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdLibrary> getEntityType() { return LdLibrary.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdLibrary newEntity() { return new LdLibrary(); }
    public LdLibrary newMyEntity() { return new LdLibrary(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdLibrary)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdLibrary)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
