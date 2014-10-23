/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.customize.*;

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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
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
    public static class EpgBookId implements PropertyGateway {
        public Object read(Entity et) { return ((LdBookStatistic)et).getBookId(); }
        public void write(Entity et, Object vl) { ((LdBookStatistic)et).setBookId(cti(vl)); }
    }
    public static class EpgBookName implements PropertyGateway {
        public Object read(Entity et) { return ((LdBookStatistic)et).getBookName(); }
        public void write(Entity et, Object vl) { ((LdBookStatistic)et).setBookName((String)vl); }
    }
    public static class EpgCollectionCount implements PropertyGateway {
        public Object read(Entity et) { return ((LdBookStatistic)et).getCollectionCount(); }
        public void write(Entity et, Object vl) { ((LdBookStatistic)et).setCollectionCount(cti(vl)); }
    }
    public static class EpgOutOfUserSelectYn implements PropertyGateway {
        public Object read(Entity et) { return ((LdBookStatistic)et).getOutOfUserSelectYn(); }
        public void write(Entity et, Object vl) { ((LdBookStatistic)et).setOutOfUserSelectYn((String)vl); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdBookStatistic)et).getRUser(); }
        public void write(Entity et, Object vl) { ((LdBookStatistic)et).setRUser((String)vl); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdBookStatistic)et).getRModule(); }
        public void write(Entity et, Object vl) { ((LdBookStatistic)et).setRModule((String)vl); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdBookStatistic)et).getRTimestamp(); }
        public void write(Entity et, Object vl) { ((LdBookStatistic)et).setRTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdBookStatistic)et).getUUser(); }
        public void write(Entity et, Object vl) { ((LdBookStatistic)et).setUUser((String)vl); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdBookStatistic)et).getUModule(); }
        public void write(Entity et, Object vl) { ((LdBookStatistic)et).setUModule((String)vl); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdBookStatistic)et).getUTimestamp(); }
        public void write(Entity et, Object vl) { ((LdBookStatistic)et).setUTimestamp((java.sql.Timestamp)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

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
    protected final ColumnInfo _columnBookId = cci("BOOK_ID", "BOOK_ID", null, null, Integer.class, "bookId", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBookName = cci("BOOK_NAME", "BOOK_NAME", null, null, String.class, "bookName", null, false, false, false, "VARCHAR", 80, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCollectionCount = cci("COLLECTION_COUNT", "COLLECTION_COUNT", null, null, Integer.class, "collectionCount", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnOutOfUserSelectYn = cci("OUT_OF_USER_SELECT_YN", "OUT_OF_USER_SELECT_YN", null, null, String.class, "outOfUserSelectYn", null, false, false, false, "CHAR", 1, 0, null, false, null, null, null, null, LdCDef.DefMeta.YesNo);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, String.class, "RUser", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, String.class, "RModule", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, java.sql.Timestamp.class, "RTimestamp", null, false, false, false, "TIMESTAMP", 26, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, String.class, "UUser", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, String.class, "UModule", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, java.sql.Timestamp.class, "UTimestamp", null, false, false, false, "TIMESTAMP", 26, 6, null, false, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    /**
     * BOOK_ID: {INTEGER(10), refers to BOOK.BOOK_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBookId() { return _columnBookId; }
    /**
     * BOOK_NAME: {VARCHAR(80), refers to BOOK.BOOK_NAME}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBookName() { return _columnBookName; }
    /**
     * COLLECTION_COUNT: {INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCollectionCount() { return _columnCollectionCount; }
    /**
     * OUT_OF_USER_SELECT_YN: {CHAR(1), refers to BOOK.OUT_OF_USER_SELECT_YN, classification=YesNo}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOutOfUserSelectYn() { return _columnOutOfUserSelectYn; }
    /**
     * R_USER: {VARCHAR(100), refers to BOOK.R_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRUser() { return _columnRUser; }
    /**
     * R_MODULE: {VARCHAR(100), refers to BOOK.R_MODULE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRModule() { return _columnRModule; }
    /**
     * R_TIMESTAMP: {TIMESTAMP(26, 6), refers to BOOK.R_TIMESTAMP}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    /**
     * U_USER: {VARCHAR(100), refers to BOOK.U_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUUser() { return _columnUUser; }
    /**
     * U_MODULE: {VARCHAR(100), refers to BOOK.U_MODULE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUModule() { return _columnUModule; }
    /**
     * U_TIMESTAMP: {TIMESTAMP(26, 6), refers to BOOK.U_TIMESTAMP}
     * @return The information object of specified column. (NotNull)
     */
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
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
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
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.customize.LdBookStatistic"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdBookStatistic> getEntityType() { return LdBookStatistic.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdBookStatistic newEntity() { return new LdBookStatistic(); }
    public LdBookStatistic newMyEntity() { return new LdBookStatistic(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdBookStatistic)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdBookStatistic)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
