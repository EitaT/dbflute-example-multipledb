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
 * The DB meta of BLACK_LIST. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdBlackListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdBlackListDbm _instance = new LdBlackListDbm();
    private LdBlackListDbm() {}
    public static LdBlackListDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return LdDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgBlackListId(), "blackListId");
        setupEpg(_epgMap, new EpgLbUserId(), "lbUserId");
        setupEpg(_epgMap, new EpgBlackRank(), "blackRank");
        setupEpg(_epgMap, new EpgRUser(), "RUser");
        setupEpg(_epgMap, new EpgRModule(), "RModule");
        setupEpg(_epgMap, new EpgRTimestamp(), "RTimestamp");
        setupEpg(_epgMap, new EpgUUser(), "UUser");
        setupEpg(_epgMap, new EpgUModule(), "UModule");
        setupEpg(_epgMap, new EpgUTimestamp(), "UTimestamp");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgBlackListId implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackList)et).getBlackListId(); }
        public void write(Entity et, Object vl) { ((LdBlackList)et).setBlackListId(cti(vl)); }
    }
    public static class EpgLbUserId implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackList)et).getLbUserId(); }
        public void write(Entity et, Object vl) { ((LdBlackList)et).setLbUserId(cti(vl)); }
    }
    public static class EpgBlackRank implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackList)et).getBlackRank(); }
        public void write(Entity et, Object vl) { ((LdBlackList)et).setBlackRank((String)vl); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackList)et).getRUser(); }
        public void write(Entity et, Object vl) { ((LdBlackList)et).setRUser((String)vl); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackList)et).getRModule(); }
        public void write(Entity et, Object vl) { ((LdBlackList)et).setRModule((String)vl); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackList)et).getRTimestamp(); }
        public void write(Entity et, Object vl) { ((LdBlackList)et).setRTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackList)et).getUUser(); }
        public void write(Entity et, Object vl) { ((LdBlackList)et).setUUser((String)vl); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackList)et).getUModule(); }
        public void write(Entity et, Object vl) { ((LdBlackList)et).setUModule((String)vl); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackList)et).getUTimestamp(); }
        public void write(Entity et, Object vl) { ((LdBlackList)et).setUTimestamp((java.sql.Timestamp)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BLACK_LIST";
    protected final String _tablePropertyName = "blackList";
    protected final TableSqlName _tableSqlName = new TableSqlName("BLACK_LIST", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBlackListId = cci("BLACK_LIST_ID", "BLACK_LIST_ID", null, null, true, "blackListId", Integer.class, true, true, "INTEGER", 10, 0, "GENERATED_BY_DEFAULT", false, null, null, null, "blackActionList", null);
    protected final ColumnInfo _columnLbUserId = cci("LB_USER_ID", "LB_USER_ID", null, null, true, "lbUserId", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, "lbUser", null, null);
    protected final ColumnInfo _columnBlackRank = cci("BLACK_RANK", "BLACK_RANK", null, null, true, "blackRank", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, true, "RUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, true, "RModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.RegisterModuleType);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, true, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, true, "UUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, true, "UModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.UpdateModuleType);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, true, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    public ColumnInfo columnBlackListId() { return _columnBlackListId; }
    public ColumnInfo columnLbUserId() { return _columnLbUserId; }
    public ColumnInfo columnBlackRank() { return _columnBlackRank; }
    public ColumnInfo columnRUser() { return _columnRUser; }
    public ColumnInfo columnRModule() { return _columnRModule; }
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public ColumnInfo columnUUser() { return _columnUUser; }
    public ColumnInfo columnUModule() { return _columnUModule; }
    public ColumnInfo columnUTimestamp() { return _columnUTimestamp; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBlackListId());
        ls.add(columnLbUserId());
        ls.add(columnBlackRank());
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
    protected UniqueInfo cpui() { return hpcpui(columnBlackListId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignLbUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLbUserId(), LdLbUserDbm.getInstance().columnLbUserId());
        return cfi("FK_BLACK_LIST_LB_USER", "lbUser", this, LdLbUserDbm.getInstance(), mp, 0, true, false, false, false, null, null, false, "blackListAsOne");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerBlackActionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBlackListId(), LdBlackActionDbm.getInstance().columnBlackListId());
        return cri("FK_BLACK_ACTION_BLACK_LIST", "blackActionList", this, LdBlackActionDbm.getInstance(), mp, false, "blackList");
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
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdBlackList"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdBlackListCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdBlackListBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdBlackList> getEntityType() { return LdBlackList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdBlackList newMyEntity() { return new LdBlackList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdBlackList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdBlackList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
