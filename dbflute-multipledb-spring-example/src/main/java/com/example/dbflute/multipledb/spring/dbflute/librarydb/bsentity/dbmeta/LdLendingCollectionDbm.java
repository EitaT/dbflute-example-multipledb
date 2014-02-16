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
 * The DB meta of LENDING_COLLECTION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdLendingCollectionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdLendingCollectionDbm _instance = new LdLendingCollectionDbm();
    private LdLendingCollectionDbm() {}
    public static LdLendingCollectionDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgCollectionId(), "collectionId");
        setupEpg(_epgMap, new EpgReturnLimitDate(), "returnLimitDate");
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
        public Object read(Entity et) { return ((LdLendingCollection)et).getLibraryId(); }
        public void write(Entity et, Object vl) { ((LdLendingCollection)et).setLibraryId(cti(vl)); }
    }
    public static class EpgLbUserId implements PropertyGateway {
        public Object read(Entity et) { return ((LdLendingCollection)et).getLbUserId(); }
        public void write(Entity et, Object vl) { ((LdLendingCollection)et).setLbUserId(cti(vl)); }
    }
    public static class EpgLendingDate implements PropertyGateway {
        public Object read(Entity et) { return ((LdLendingCollection)et).getLendingDate(); }
        public void write(Entity et, Object vl) { ((LdLendingCollection)et).setLendingDate((java.sql.Timestamp)vl); }
    }
    public static class EpgCollectionId implements PropertyGateway {
        public Object read(Entity et) { return ((LdLendingCollection)et).getCollectionId(); }
        public void write(Entity et, Object vl) { ((LdLendingCollection)et).setCollectionId(cti(vl)); }
    }
    public static class EpgReturnLimitDate implements PropertyGateway {
        public Object read(Entity et) { return ((LdLendingCollection)et).getReturnLimitDate(); }
        public void write(Entity et, Object vl) { ((LdLendingCollection)et).setReturnLimitDate((java.sql.Timestamp)vl); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdLendingCollection)et).getRUser(); }
        public void write(Entity et, Object vl) { ((LdLendingCollection)et).setRUser((String)vl); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdLendingCollection)et).getRModule(); }
        public void write(Entity et, Object vl) { ((LdLendingCollection)et).setRModule((String)vl); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdLendingCollection)et).getRTimestamp(); }
        public void write(Entity et, Object vl) { ((LdLendingCollection)et).setRTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdLendingCollection)et).getUUser(); }
        public void write(Entity et, Object vl) { ((LdLendingCollection)et).setUUser((String)vl); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdLendingCollection)et).getUModule(); }
        public void write(Entity et, Object vl) { ((LdLendingCollection)et).setUModule((String)vl); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdLendingCollection)et).getUTimestamp(); }
        public void write(Entity et, Object vl) { ((LdLendingCollection)et).setUTimestamp((java.sql.Timestamp)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LENDING_COLLECTION";
    protected final String _tablePropertyName = "lendingCollection";
    protected final TableSqlName _tableSqlName = new TableSqlName("LENDING_COLLECTION", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLibraryId = cci("LIBRARY_ID", "LIBRARY_ID", null, null, true, "libraryId", Integer.class, true, false, "SMALLINT", 5, 0, null, false, null, null, "lending,libraryUser", null, null);
    protected final ColumnInfo _columnLbUserId = cci("LB_USER_ID", "LB_USER_ID", null, null, true, "lbUserId", Integer.class, true, false, "INTEGER", 10, 0, null, false, null, null, "lending,libraryUser", null, null);
    protected final ColumnInfo _columnLendingDate = cci("LENDING_DATE", "LENDING_DATE", null, null, true, "lendingDate", java.sql.Timestamp.class, true, false, "TIMESTAMP", 26, 6, null, false, null, null, "lending", null, null);
    protected final ColumnInfo _columnCollectionId = cci("COLLECTION_ID", "COLLECTION_ID", null, null, true, "collectionId", Integer.class, true, false, "INTEGER", 10, 0, null, false, null, null, "collection", null, null);
    protected final ColumnInfo _columnReturnLimitDate = cci("RETURN_LIMIT_DATE", "RETURN_LIMIT_DATE", null, null, true, "returnLimitDate", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, true, "RUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, true, "RModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, true, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, true, "UUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, true, "UModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, true, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    public ColumnInfo columnLibraryId() { return _columnLibraryId; }
    public ColumnInfo columnLbUserId() { return _columnLbUserId; }
    public ColumnInfo columnLendingDate() { return _columnLendingDate; }
    public ColumnInfo columnCollectionId() { return _columnCollectionId; }
    public ColumnInfo columnReturnLimitDate() { return _columnReturnLimitDate; }
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
        ls.add(columnCollectionId());
        ls.add(columnReturnLimitDate());
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
        ls.add(columnCollectionId());
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
    public ForeignInfo foreignCollection() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCollectionId(), LdCollectionDbm.getInstance().columnCollectionId());
        return cfi("FK_LENDING_COLLECTION_COL", "collection", this, LdCollectionDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "lendingCollectionList");
    }
    public ForeignInfo foreignLending() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnLibraryId(), LdLendingDbm.getInstance().columnLibraryId());
        mp.put(columnLbUserId(), LdLendingDbm.getInstance().columnLbUserId());
        mp.put(columnLendingDate(), LdLendingDbm.getInstance().columnLendingDate());
        return cfi("FK_LENDING_COLLECTION_LENDING", "lending", this, LdLendingDbm.getInstance(), mp, 1, false, false, false, false, null, null, false, "lendingCollectionList");
    }
    public ForeignInfo foreignLibraryUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnLibraryId(), LdLibraryUserDbm.getInstance().columnLibraryId());
        mp.put(columnLbUserId(), LdLibraryUserDbm.getInstance().columnLbUserId());
        return cfi("FK_TEST_LENDING_COLLECTION", "libraryUser", this, LdLibraryUserDbm.getInstance(), mp, 2, false, false, false, true, null, null, false, "lendingCollectionList");
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
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdLendingCollection"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdLendingCollectionCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdLendingCollectionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdLendingCollection> getEntityType() { return LdLendingCollection.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdLendingCollection newMyEntity() { return new LdLendingCollection(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdLendingCollection)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdLendingCollection)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
