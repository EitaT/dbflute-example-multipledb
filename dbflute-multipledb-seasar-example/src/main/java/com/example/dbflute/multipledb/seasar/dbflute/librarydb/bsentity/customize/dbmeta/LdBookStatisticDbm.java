/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.*;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.customize.*;

/**
 * The DB meta of BookStatistic. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdBookStatisticDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdBookStatisticDbm _instance = new LdBookStatisticDbm();
    private LdBookStatisticDbm() {}
    public static LdBookStatisticDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return LdDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgBookId(), "bookId");
        setupEpg(_epgMap, new EpgBookName(), "bookName");
        setupEpg(_epgMap, new EpgCollectionCount(), "collectionCount");
        setupEpg(_epgMap, new EpgOutOfUserSelectYn(), "outOfUserSelectYn");
        setupEpg(_epgMap, new EpgRUser(), "RUser");
        setupEpg(_epgMap, new EpgRModule(), "RModule");
        setupEpg(_epgMap, new EpgRTimestamp(), "RTimestamp");
        setupEpg(_epgMap, new EpgUUser(), "UUser");
        setupEpg(_epgMap, new EpgUModule(), "UModule");
        setupEpg(_epgMap, new EpgUTimestamp(), "UTimestamp");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgBookId implements PropertyGateway {
        public Object read(Entity e) { return ((LdBookStatistic)e).getBookId(); }
        public void write(Entity e, Object v) { ((LdBookStatistic)e).setBookId(cti(v)); }
    }
    public static class EpgBookName implements PropertyGateway {
        public Object read(Entity e) { return ((LdBookStatistic)e).getBookName(); }
        public void write(Entity e, Object v) { ((LdBookStatistic)e).setBookName((String)v); }
    }
    public static class EpgCollectionCount implements PropertyGateway {
        public Object read(Entity e) { return ((LdBookStatistic)e).getCollectionCount(); }
        public void write(Entity e, Object v) { ((LdBookStatistic)e).setCollectionCount(cti(v)); }
    }
    public static class EpgOutOfUserSelectYn implements PropertyGateway {
        public Object read(Entity e) { return ((LdBookStatistic)e).getOutOfUserSelectYn(); }
        public void write(Entity e, Object v) { ((LdBookStatistic)e).setOutOfUserSelectYn((String)v); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity e) { return ((LdBookStatistic)e).getRUser(); }
        public void write(Entity e, Object v) { ((LdBookStatistic)e).setRUser((String)v); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity e) { return ((LdBookStatistic)e).getRModule(); }
        public void write(Entity e, Object v) { ((LdBookStatistic)e).setRModule((String)v); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((LdBookStatistic)e).getRTimestamp(); }
        public void write(Entity e, Object v) { ((LdBookStatistic)e).setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity e) { return ((LdBookStatistic)e).getUUser(); }
        public void write(Entity e, Object v) { ((LdBookStatistic)e).setUUser((String)v); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity e) { return ((LdBookStatistic)e).getUModule(); }
        public void write(Entity e, Object v) { ((LdBookStatistic)e).setUModule((String)v); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((LdBookStatistic)e).getUTimestamp(); }
        public void write(Entity e, Object v) { ((LdBookStatistic)e).setUTimestamp((java.sql.Timestamp)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BookStatistic";
    protected final String _tablePropertyName = "bookStatistic";
    protected final TableSqlName _tableSqlName = new TableSqlName("BookStatistic", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBookId = cci("BOOK_ID", "BOOK_ID", null, null, false, "bookId", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBookName = cci("BOOK_NAME", "BOOK_NAME", null, null, false, "bookName", String.class, false, false, "VARCHAR", 80, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCollectionCount = cci("COLLECTION_COUNT", "COLLECTION_COUNT", null, null, false, "collectionCount", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnOutOfUserSelectYn = cci("OUT_OF_USER_SELECT_YN", "OUT_OF_USER_SELECT_YN", null, null, false, "outOfUserSelectYn", String.class, false, false, "CHAR", 1, 0, null, false, null, null, null, null, LdCDef.DefMeta.YesNo);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, false, "RUser", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, false, "RModule", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, LdCDef.DefMeta.RegisterModuleType);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, false, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, false, "UUser", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, false, "UModule", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, LdCDef.DefMeta.UpdateModuleType);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, false, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, null, false, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    public ColumnInfo columnBookId() { return _columnBookId; }
    public ColumnInfo columnBookName() { return _columnBookName; }
    public ColumnInfo columnCollectionCount() { return _columnCollectionCount; }
    public ColumnInfo columnOutOfUserSelectYn() { return _columnOutOfUserSelectYn; }
    public ColumnInfo columnRUser() { return _columnRUser; }
    public ColumnInfo columnRModule() { return _columnRModule; }
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public ColumnInfo columnUUser() { return _columnUUser; }
    public ColumnInfo columnUModule() { return _columnUModule; }
    public ColumnInfo columnUTimestamp() { return _columnUTimestamp; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBookId());
        ls.add(columnBookName());
        ls.add(columnCollectionCount());
        ls.add(columnOutOfUserSelectYn());
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
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasUpdateDate() { return true; }
    public ColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.customize.LdBookStatistic"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdBookStatistic> getEntityType() { return LdBookStatistic.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdBookStatistic newMyEntity() { return new LdBookStatistic(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((LdBookStatistic)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((LdBookStatistic)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
