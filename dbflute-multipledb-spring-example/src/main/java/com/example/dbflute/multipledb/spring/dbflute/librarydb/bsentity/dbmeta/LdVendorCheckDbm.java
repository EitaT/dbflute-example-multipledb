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
 * The DB meta of VENDOR_CHECK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdVendorCheckDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdVendorCheckDbm _instance = new LdVendorCheckDbm();
    private LdVendorCheckDbm() {}
    public static LdVendorCheckDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return LdDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgVendorCheckId(), "vendorCheckId");
        setupEpg(_epgMap, new EpgTypeOfChar(), "typeOfChar");
        setupEpg(_epgMap, new EpgTypeOfVarchar(), "typeOfVarchar");
        setupEpg(_epgMap, new EpgTypeOfLongVarchar(), "typeOfLongVarchar");
        setupEpg(_epgMap, new EpgTypeOfClob(), "typeOfClob");
        setupEpg(_epgMap, new EpgTypeOfDecimalInteger(), "typeOfDecimalInteger");
        setupEpg(_epgMap, new EpgTypeOfDecimalBigint(), "typeOfDecimalBigint");
        setupEpg(_epgMap, new EpgTypeOfDecimalDecimal(), "typeOfDecimalDecimal");
        setupEpg(_epgMap, new EpgTypeOfBigint(), "typeOfBigint");
        setupEpg(_epgMap, new EpgTypeOfInteger(), "typeOfInteger");
        setupEpg(_epgMap, new EpgTypeOfDate(), "typeOfDate");
        setupEpg(_epgMap, new EpgTypeOfTimestamp(), "typeOfTimestamp");
        setupEpg(_epgMap, new EpgTypeOfTime(), "typeOfTime");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgVendorCheckId implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorCheck)et).getVendorCheckId(); }
        public void write(Entity et, Object vl) { ((LdVendorCheck)et).setVendorCheckId(ctl(vl)); }
    }
    public static class EpgTypeOfChar implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorCheck)et).getTypeOfChar(); }
        public void write(Entity et, Object vl) { ((LdVendorCheck)et).setTypeOfChar((String)vl); }
    }
    public static class EpgTypeOfVarchar implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorCheck)et).getTypeOfVarchar(); }
        public void write(Entity et, Object vl) { ((LdVendorCheck)et).setTypeOfVarchar((String)vl); }
    }
    public static class EpgTypeOfLongVarchar implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorCheck)et).getTypeOfLongVarchar(); }
        public void write(Entity et, Object vl) { ((LdVendorCheck)et).setTypeOfLongVarchar((String)vl); }
    }
    public static class EpgTypeOfClob implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorCheck)et).getTypeOfClob(); }
        public void write(Entity et, Object vl) { ((LdVendorCheck)et).setTypeOfClob((String)vl); }
    }
    public static class EpgTypeOfDecimalInteger implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorCheck)et).getTypeOfDecimalInteger(); }
        public void write(Entity et, Object vl) { ((LdVendorCheck)et).setTypeOfDecimalInteger(ctb(vl)); }
    }
    public static class EpgTypeOfDecimalBigint implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorCheck)et).getTypeOfDecimalBigint(); }
        public void write(Entity et, Object vl) { ((LdVendorCheck)et).setTypeOfDecimalBigint(ctb(vl)); }
    }
    public static class EpgTypeOfDecimalDecimal implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorCheck)et).getTypeOfDecimalDecimal(); }
        public void write(Entity et, Object vl) { ((LdVendorCheck)et).setTypeOfDecimalDecimal(ctb(vl)); }
    }
    public static class EpgTypeOfBigint implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorCheck)et).getTypeOfBigint(); }
        public void write(Entity et, Object vl) { ((LdVendorCheck)et).setTypeOfBigint(ctl(vl)); }
    }
    public static class EpgTypeOfInteger implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorCheck)et).getTypeOfInteger(); }
        public void write(Entity et, Object vl) { ((LdVendorCheck)et).setTypeOfInteger(cti(vl)); }
    }
    public static class EpgTypeOfDate implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorCheck)et).getTypeOfDate(); }
        public void write(Entity et, Object vl) { ((LdVendorCheck)et).setTypeOfDate((java.util.Date)vl); }
    }
    public static class EpgTypeOfTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorCheck)et).getTypeOfTimestamp(); }
        public void write(Entity et, Object vl) { ((LdVendorCheck)et).setTypeOfTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgTypeOfTime implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorCheck)et).getTypeOfTime(); }
        public void write(Entity et, Object vl) { ((LdVendorCheck)et).setTypeOfTime((java.sql.Time)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_CHECK";
    protected final String _tablePropertyName = "vendorCheck";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_CHECK", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorCheckId = cci("VENDOR_CHECK_ID", "VENDOR_CHECK_ID", null, null, true, "vendorCheckId", Long.class, false, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfChar = cci("TYPE_OF_CHAR", "TYPE_OF_CHAR", null, null, false, "typeOfChar", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfVarchar = cci("TYPE_OF_VARCHAR", "TYPE_OF_VARCHAR", null, null, false, "typeOfVarchar", String.class, false, false, "VARCHAR", 32, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfLongVarchar = cci("TYPE_OF_LONG_VARCHAR", "TYPE_OF_LONG_VARCHAR", null, null, false, "typeOfLongVarchar", String.class, false, false, "LONG VARCHAR", 32700, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfClob = cci("TYPE_OF_CLOB", "TYPE_OF_CLOB", null, null, false, "typeOfClob", String.class, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDecimalInteger = cci("TYPE_OF_DECIMAL_INTEGER", "TYPE_OF_DECIMAL_INTEGER", null, null, false, "typeOfDecimalInteger", java.math.BigDecimal.class, false, false, "DECIMAL", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDecimalBigint = cci("TYPE_OF_DECIMAL_BIGINT", "TYPE_OF_DECIMAL_BIGINT", null, null, false, "typeOfDecimalBigint", java.math.BigDecimal.class, false, false, "DECIMAL", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDecimalDecimal = cci("TYPE_OF_DECIMAL_DECIMAL", "TYPE_OF_DECIMAL_DECIMAL", null, null, false, "typeOfDecimalDecimal", java.math.BigDecimal.class, false, false, "DECIMAL", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBigint = cci("TYPE_OF_BIGINT", "TYPE_OF_BIGINT", null, null, false, "typeOfBigint", Long.class, false, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfInteger = cci("TYPE_OF_INTEGER", "TYPE_OF_INTEGER", null, null, false, "typeOfInteger", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfDate = cci("TYPE_OF_DATE", "TYPE_OF_DATE", null, null, false, "typeOfDate", java.util.Date.class, false, false, "DATE", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTimestamp = cci("TYPE_OF_TIMESTAMP", "TYPE_OF_TIMESTAMP", null, null, false, "typeOfTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfTime = cci("TYPE_OF_TIME", "TYPE_OF_TIME", null, null, false, "typeOfTime", java.sql.Time.class, false, false, "TIME", 8, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    public ColumnInfo columnTypeOfChar() { return _columnTypeOfChar; }
    public ColumnInfo columnTypeOfVarchar() { return _columnTypeOfVarchar; }
    public ColumnInfo columnTypeOfLongVarchar() { return _columnTypeOfLongVarchar; }
    public ColumnInfo columnTypeOfClob() { return _columnTypeOfClob; }
    public ColumnInfo columnTypeOfDecimalInteger() { return _columnTypeOfDecimalInteger; }
    public ColumnInfo columnTypeOfDecimalBigint() { return _columnTypeOfDecimalBigint; }
    public ColumnInfo columnTypeOfDecimalDecimal() { return _columnTypeOfDecimalDecimal; }
    public ColumnInfo columnTypeOfBigint() { return _columnTypeOfBigint; }
    public ColumnInfo columnTypeOfInteger() { return _columnTypeOfInteger; }
    public ColumnInfo columnTypeOfDate() { return _columnTypeOfDate; }
    public ColumnInfo columnTypeOfTimestamp() { return _columnTypeOfTimestamp; }
    public ColumnInfo columnTypeOfTime() { return _columnTypeOfTime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnTypeOfChar());
        ls.add(columnTypeOfVarchar());
        ls.add(columnTypeOfLongVarchar());
        ls.add(columnTypeOfClob());
        ls.add(columnTypeOfDecimalInteger());
        ls.add(columnTypeOfDecimalBigint());
        ls.add(columnTypeOfDecimalDecimal());
        ls.add(columnTypeOfBigint());
        ls.add(columnTypeOfInteger());
        ls.add(columnTypeOfDate());
        ls.add(columnTypeOfTimestamp());
        ls.add(columnTypeOfTime());
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdVendorCheck"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdVendorCheckCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdVendorCheckBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdVendorCheck> getEntityType() { return LdVendorCheck.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdVendorCheck newMyEntity() { return new LdVendorCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdVendorCheck)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdVendorCheck)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
