/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.*;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.*;

/**
 * The DB meta of MYSELF_CHECK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdMyselfCheckDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdMyselfCheckDbm _instance = new LdMyselfCheckDbm();
    private LdMyselfCheckDbm() {}
    public static LdMyselfCheckDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgMyselfCheckId(), "myselfCheckId");
        setupEpg(_epgMap, new EpgMyselfCheckName(), "myselfCheckName");
        setupEpg(_epgMap, new EpgMyselfId(), "myselfId");
    }
    public static class EpgMyselfCheckId implements PropertyGateway {
        public Object read(Entity et) { return ((LdMyselfCheck)et).getMyselfCheckId(); }
        public void write(Entity et, Object vl) { ((LdMyselfCheck)et).setMyselfCheckId(cti(vl)); }
    }
    public static class EpgMyselfCheckName implements PropertyGateway {
        public Object read(Entity et) { return ((LdMyselfCheck)et).getMyselfCheckName(); }
        public void write(Entity et, Object vl) { ((LdMyselfCheck)et).setMyselfCheckName((String)vl); }
    }
    public static class EpgMyselfId implements PropertyGateway {
        public Object read(Entity et) { return ((LdMyselfCheck)et).getMyselfId(); }
        public void write(Entity et, Object vl) { ((LdMyselfCheck)et).setMyselfId(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgMyself(), "myself");
    }
    public class EfpgMyself implements PropertyGateway {
        public Object read(Entity et) { return ((LdMyselfCheck)et).getMyself(); }
        public void write(Entity et, Object vl) { ((LdMyselfCheck)et).setMyself((LdMyself)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MYSELF_CHECK";
    protected final String _tablePropertyName = "myselfCheck";
    protected final TableSqlName _tableSqlName = new TableSqlName("MYSELF_CHECK", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMyselfCheckId = cci("MYSELF_CHECK_ID", "MYSELF_CHECK_ID", null, null, Integer.class, "myselfCheckId", null, true, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMyselfCheckName = cci("MYSELF_CHECK_NAME", "MYSELF_CHECK_NAME", null, null, String.class, "myselfCheckName", null, false, false, true, "VARCHAR", 80, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMyselfId = cci("MYSELF_ID", "MYSELF_ID", null, null, Integer.class, "myselfId", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, "myself", null, null);

    /**
     * MYSELF_CHECK_ID: {PK, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMyselfCheckId() { return _columnMyselfCheckId; }
    /**
     * MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMyselfCheckName() { return _columnMyselfCheckName; }
    /**
     * MYSELF_ID: {IX, INTEGER(10), FK to MYSELF}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMyselfId() { return _columnMyselfId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMyselfCheckId());
        ls.add(columnMyselfCheckName());
        ls.add(columnMyselfId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMyselfCheckId()); }
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
     * MYSELF by my MYSELF_ID, named 'myself'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMyself() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMyselfId(), LdMyselfDbm.getInstance().columnMyselfId());
        return cfi("FK_MYSELF_CHECK_SELF", "myself", this, LdMyselfDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "myselfCheckList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdMyselfCheck"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdMyselfCheckCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdMyselfCheckBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdMyselfCheck> getEntityType() { return LdMyselfCheck.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdMyselfCheck newEntity() { return new LdMyselfCheck(); }
    public LdMyselfCheck newMyEntity() { return new LdMyselfCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdMyselfCheck)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdMyselfCheck)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
