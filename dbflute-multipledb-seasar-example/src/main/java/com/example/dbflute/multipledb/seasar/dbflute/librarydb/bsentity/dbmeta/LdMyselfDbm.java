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
 * The DB meta of MYSELF. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdMyselfDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdMyselfDbm _instance = new LdMyselfDbm();
    private LdMyselfDbm() {}
    public static LdMyselfDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return LdDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMyselfId(), "myselfId");
        setupEpg(_epgMap, new EpgMyselfName(), "myselfName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMyselfId implements PropertyGateway {
        public Object read(Entity et) { return ((LdMyself)et).getMyselfId(); }
        public void write(Entity et, Object vl) { ((LdMyself)et).setMyselfId(cti(vl)); }
    }
    public static class EpgMyselfName implements PropertyGateway {
        public Object read(Entity et) { return ((LdMyself)et).getMyselfName(); }
        public void write(Entity et, Object vl) { ((LdMyself)et).setMyselfName((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MYSELF";
    protected final String _tablePropertyName = "myself";
    protected final TableSqlName _tableSqlName = new TableSqlName("MYSELF", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMyselfId = cci("MYSELF_ID", "MYSELF_ID", null, null, true, "myselfId", Integer.class, true, false, "INTEGER", 10, 0, null, false, null, null, null, "myselfCheckList", null);
    protected final ColumnInfo _columnMyselfName = cci("MYSELF_NAME", "MYSELF_NAME", null, null, true, "myselfName", String.class, false, false, "VARCHAR", 80, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnMyselfId() { return _columnMyselfId; }
    public ColumnInfo columnMyselfName() { return _columnMyselfName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMyselfId());
        ls.add(columnMyselfName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMyselfId()); }
    public boolean hasPrimaryKey() { return true; }
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
    public ReferrerInfo referrerMyselfCheckList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMyselfId(), LdMyselfCheckDbm.getInstance().columnMyselfId());
        return cri("FK_MYSELF_CHECK_SELF", "myselfCheckList", this, LdMyselfCheckDbm.getInstance(), mp, false, "myself");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdMyself"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdMyselfCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdMyselfBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdMyself> getEntityType() { return LdMyself.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdMyself newMyEntity() { return new LdMyself(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdMyself)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdMyself)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
