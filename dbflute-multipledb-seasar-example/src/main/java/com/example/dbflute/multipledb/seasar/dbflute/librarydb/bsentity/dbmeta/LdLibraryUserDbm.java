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
 * The DB meta of LIBRARY_USER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdLibraryUserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdLibraryUserDbm _instance = new LdLibraryUserDbm();
    private LdLibraryUserDbm() {}
    public static LdLibraryUserDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgLbUserId(), "lbUserId");
        setupEpg(_epgMap, new EpgRUser(), "RUser");
        setupEpg(_epgMap, new EpgRModule(), "RModule");
        setupEpg(_epgMap, new EpgRTimestamp(), "RTimestamp");
        setupEpg(_epgMap, new EpgUUser(), "UUser");
        setupEpg(_epgMap, new EpgUModule(), "UModule");
        setupEpg(_epgMap, new EpgUTimestamp(), "UTimestamp");
    }
    public static class EpgLibraryId implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibraryUser)et).getLibraryId(); }
        public void write(Entity et, Object vl) { ((LdLibraryUser)et).setLibraryId(cti(vl)); }
    }
    public static class EpgLbUserId implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibraryUser)et).getLbUserId(); }
        public void write(Entity et, Object vl) { ((LdLibraryUser)et).setLbUserId(cti(vl)); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibraryUser)et).getRUser(); }
        public void write(Entity et, Object vl) { ((LdLibraryUser)et).setRUser((String)vl); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibraryUser)et).getRModule(); }
        public void write(Entity et, Object vl) { ((LdLibraryUser)et).setRModule((String)vl); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibraryUser)et).getRTimestamp(); }
        public void write(Entity et, Object vl) { ((LdLibraryUser)et).setRTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibraryUser)et).getUUser(); }
        public void write(Entity et, Object vl) { ((LdLibraryUser)et).setUUser((String)vl); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibraryUser)et).getUModule(); }
        public void write(Entity et, Object vl) { ((LdLibraryUser)et).setUModule((String)vl); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibraryUser)et).getUTimestamp(); }
        public void write(Entity et, Object vl) { ((LdLibraryUser)et).setUTimestamp((java.sql.Timestamp)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgLbUser(), "lbUser");
        setupEfpg(_efpgMap, new EfpgLibrary(), "library");
    }
    public class EfpgLbUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibraryUser)et).getLbUser(); }
        public void write(Entity et, Object vl) { ((LdLibraryUser)et).setLbUser((LdLbUser)vl); }
    }
    public class EfpgLibrary implements PropertyGateway {
        public Object read(Entity et) { return ((LdLibraryUser)et).getLibrary(); }
        public void write(Entity et, Object vl) { ((LdLibraryUser)et).setLibrary((LdLibrary)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LIBRARY_USER";
    protected final String _tablePropertyName = "libraryUser";
    protected final TableSqlName _tableSqlName = new TableSqlName("LIBRARY_USER", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLibraryId = cci("LIBRARY_ID", "LIBRARY_ID", null, null, Integer.class, "libraryId", null, true, false, true, "SMALLINT", 5, 0, null, false, null, null, "library", "lendingList,lendingCollectionList", null);
    protected final ColumnInfo _columnLbUserId = cci("LB_USER_ID", "LB_USER_ID", null, null, Integer.class, "lbUserId", null, true, false, true, "INTEGER", 10, 0, null, false, null, null, "lbUser", "lendingList,lendingCollectionList", null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, String.class, "RUser", null, false, false, true, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, String.class, "RModule", null, false, false, true, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.RegisterModuleType);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, java.sql.Timestamp.class, "RTimestamp", null, false, false, true, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, String.class, "UUser", null, false, false, true, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, String.class, "UModule", null, false, false, true, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.UpdateModuleType);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, java.sql.Timestamp.class, "UTimestamp", null, false, false, true, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    /**
     * LIBRARY_ID: {PK, IX, NotNull, SMALLINT(5), FK to LIBRARY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLibraryId() { return _columnLibraryId; }
    /**
     * LB_USER_ID: {PK, IX, NotNull, INTEGER(10), FK to LB_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLbUserId() { return _columnLbUserId; }
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
        ls.add(columnLbUserId());
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
        ls.add(columnLbUserId());
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
     * LB_USER by my LB_USER_ID, named 'lbUser'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLbUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLbUserId(), LdLbUserDbm.getInstance().columnLbUserId());
        return cfi("FK_LIBRARY_USER_LB_USER", "lbUser", this, LdLbUserDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "libraryUserList");
    }
    /**
     * LIBRARY by my LIBRARY_ID, named 'library'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLibrary() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLibraryId(), LdLibraryDbm.getInstance().columnLibraryId());
        return cfi("FK_LIBRARY_USER_LIBRARY", "library", this, LdLibraryDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "libraryUserList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * LENDING by LIBRARY_ID, LB_USER_ID, named 'lendingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerLendingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnLibraryId(), LdLendingDbm.getInstance().columnLibraryId());
        mp.put(columnLbUserId(), LdLendingDbm.getInstance().columnLbUserId());
        return cri("FK_LENDING_LIBRARY_USER", "lendingList", this, LdLendingDbm.getInstance(), mp, false, "libraryUser");
    }
    /**
     * LENDING_COLLECTION by LIBRARY_ID, LB_USER_ID, named 'lendingCollectionList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerLendingCollectionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnLibraryId(), LdLendingCollectionDbm.getInstance().columnLibraryId());
        mp.put(columnLbUserId(), LdLendingCollectionDbm.getInstance().columnLbUserId());
        return cri("FK_TEST_LENDING_COLLECTION", "lendingCollectionList", this, LdLendingCollectionDbm.getInstance(), mp, false, "libraryUser");
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
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdLibraryUser"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdLibraryUserCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdLibraryUserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdLibraryUser> getEntityType() { return LdLibraryUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdLibraryUser newMyEntity() { return new LdLibraryUser(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdLibraryUser)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdLibraryUser)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
