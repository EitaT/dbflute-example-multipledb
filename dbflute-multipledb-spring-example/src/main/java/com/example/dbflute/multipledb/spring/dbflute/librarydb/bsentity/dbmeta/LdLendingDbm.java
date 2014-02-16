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
 * The DB meta of LENDING. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdLendingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdLendingDbm _instance = new LdLendingDbm();
    private LdLendingDbm() {}
    public static LdLendingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgLbUserId(), "lbUserId");
        setupEpg(_epgMap, new EpgLendingDate(), "lendingDate");
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
        public Object read(Entity et) { return ((LdLending)et).getLibraryId(); }
        public void write(Entity et, Object vl) { ((LdLending)et).setLibraryId(cti(vl)); }
    }
    public static class EpgLbUserId implements PropertyGateway {
        public Object read(Entity et) { return ((LdLending)et).getLbUserId(); }
        public void write(Entity et, Object vl) { ((LdLending)et).setLbUserId(cti(vl)); }
    }
    public static class EpgLendingDate implements PropertyGateway {
        public Object read(Entity et) { return ((LdLending)et).getLendingDate(); }
        public void write(Entity et, Object vl) { ((LdLending)et).setLendingDate((java.sql.Timestamp)vl); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdLending)et).getRUser(); }
        public void write(Entity et, Object vl) { ((LdLending)et).setRUser((String)vl); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdLending)et).getRModule(); }
        public void write(Entity et, Object vl) { ((LdLending)et).setRModule((String)vl); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdLending)et).getRTimestamp(); }
        public void write(Entity et, Object vl) { ((LdLending)et).setRTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdLending)et).getUUser(); }
        public void write(Entity et, Object vl) { ((LdLending)et).setUUser((String)vl); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdLending)et).getUModule(); }
        public void write(Entity et, Object vl) { ((LdLending)et).setUModule((String)vl); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdLending)et).getUTimestamp(); }
        public void write(Entity et, Object vl) { ((LdLending)et).setUTimestamp((java.sql.Timestamp)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LENDING";
    protected final String _tablePropertyName = "lending";
    protected final TableSqlName _tableSqlName = new TableSqlName("LENDING", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLibraryId = cci("LIBRARY_ID", "LIBRARY_ID", null, null, true, "libraryId", Integer.class, true, false, "SMALLINT", 5, 0, null, false, null, null, "libraryUser", "lendingCollectionList", null);
    protected final ColumnInfo _columnLbUserId = cci("LB_USER_ID", "LB_USER_ID", null, null, true, "lbUserId", Integer.class, true, false, "INTEGER", 10, 0, null, false, null, null, "libraryUser", "lendingCollectionList", null);
    protected final ColumnInfo _columnLendingDate = cci("LENDING_DATE", "LENDING_DATE", null, null, true, "lendingDate", java.sql.Timestamp.class, true, false, "TIMESTAMP", 26, 6, null, false, null, null, null, "lendingCollectionList", null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, true, "RUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, true, "RModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, true, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, true, "UUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, true, "UModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, true, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    public ColumnInfo columnLibraryId() { return _columnLibraryId; }
    public ColumnInfo columnLbUserId() { return _columnLbUserId; }
    public ColumnInfo columnLendingDate() { return _columnLendingDate; }
    public ColumnInfo columnRUser() { return _columnRUser; }
    public ColumnInfo columnRModule() { return _columnRModule; }
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public ColumnInfo columnUUser() { return _columnUUser; }
    public ColumnInfo columnUModule() { return _columnUModule; }
    public ColumnInfo columnUTimestamp() { return _columnUTimestamp; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLibraryId());
        ls.add(columnLbUserId());
        ls.add(columnLendingDate());
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
        ls.add(columnLendingDate());
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
    public ForeignInfo foreignLibraryUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnLibraryId(), LdLibraryUserDbm.getInstance().columnLibraryId());
        mp.put(columnLbUserId(), LdLibraryUserDbm.getInstance().columnLbUserId());
        return cfi("FK_LENDING_LIBRARY_USER", "libraryUser", this, LdLibraryUserDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "lendingList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerLendingCollectionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnLibraryId(), LdLendingCollectionDbm.getInstance().columnLibraryId());
        mp.put(columnLbUserId(), LdLendingCollectionDbm.getInstance().columnLbUserId());
        mp.put(columnLendingDate(), LdLendingCollectionDbm.getInstance().columnLendingDate());
        return cri("FK_LENDING_COLLECTION_LENDING", "lendingCollectionList", this, LdLendingCollectionDbm.getInstance(), mp, false, "lending");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasUpdateDate() { return true; }
    public ColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdLending"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdLendingCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdLendingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdLending> getEntityType() { return LdLending.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdLending newMyEntity() { return new LdLending(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdLending)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdLending)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
