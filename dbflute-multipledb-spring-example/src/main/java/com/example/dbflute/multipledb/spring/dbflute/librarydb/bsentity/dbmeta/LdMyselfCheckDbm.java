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
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMyselfCheckId(), "myselfCheckId");
        setupEpg(_epgMap, new EpgMyselfCheckName(), "myselfCheckName");
        setupEpg(_epgMap, new EpgMyselfId(), "myselfId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMyselfCheckId implements PropertyGateway {
        public Object read(Entity e) { return ((LdMyselfCheck)e).getMyselfCheckId(); }
        public void write(Entity e, Object v) { ((LdMyselfCheck)e).setMyselfCheckId(cti(v)); }
    }
    public static class EpgMyselfCheckName implements PropertyGateway {
        public Object read(Entity e) { return ((LdMyselfCheck)e).getMyselfCheckName(); }
        public void write(Entity e, Object v) { ((LdMyselfCheck)e).setMyselfCheckName((String)v); }
    }
    public static class EpgMyselfId implements PropertyGateway {
        public Object read(Entity e) { return ((LdMyselfCheck)e).getMyselfId(); }
        public void write(Entity e, Object v) { ((LdMyselfCheck)e).setMyselfId(cti(v)); }
    }

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
    protected final ColumnInfo _columnMyselfCheckId = cci("MYSELF_CHECK_ID", "MYSELF_CHECK_ID", null, null, true, "myselfCheckId", Integer.class, true, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMyselfCheckName = cci("MYSELF_CHECK_NAME", "MYSELF_CHECK_NAME", null, null, true, "myselfCheckName", String.class, false, false, "VARCHAR", 80, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMyselfId = cci("MYSELF_ID", "MYSELF_ID", null, null, false, "myselfId", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, "myself", null, null);

    public ColumnInfo columnMyselfCheckId() { return _columnMyselfCheckId; }
    public ColumnInfo columnMyselfCheckName() { return _columnMyselfCheckName; }
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
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignMyself() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMyselfId(), LdMyselfDbm.getInstance().columnMyselfId());
        return cfi("FK_MYSELF_CHECK_SELF", "myself", this, LdMyselfDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "myselfCheckList");
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
    public Entity newEntity() { return newMyEntity(); }
    public LdMyselfCheck newMyEntity() { return new LdMyselfCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((LdMyselfCheck)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((LdMyselfCheck)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
