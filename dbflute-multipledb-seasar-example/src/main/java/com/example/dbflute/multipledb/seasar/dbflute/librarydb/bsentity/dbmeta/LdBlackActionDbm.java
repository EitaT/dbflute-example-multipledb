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
 * The DB meta of BLACK_ACTION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdBlackActionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdBlackActionDbm _instance = new LdBlackActionDbm();
    private LdBlackActionDbm() {}
    public static LdBlackActionDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return LdDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgBlackActionId(), "blackActionId");
        setupEpg(_epgMap, new EpgBlackListId(), "blackListId");
        setupEpg(_epgMap, new EpgBlackActionCode(), "blackActionCode");
        setupEpg(_epgMap, new EpgBlackLevel(), "blackLevel");
        setupEpg(_epgMap, new EpgActionDate(), "actionDate");
        setupEpg(_epgMap, new EpgEvidencePhotograph(), "evidencePhotograph");
        setupEpg(_epgMap, new EpgRUser(), "RUser");
        setupEpg(_epgMap, new EpgRModule(), "RModule");
        setupEpg(_epgMap, new EpgRTimestamp(), "RTimestamp");
        setupEpg(_epgMap, new EpgUUser(), "UUser");
        setupEpg(_epgMap, new EpgUModule(), "UModule");
        setupEpg(_epgMap, new EpgUTimestamp(), "UTimestamp");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgBlackActionId implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackAction)et).getBlackActionId(); }
        public void write(Entity et, Object vl) { ((LdBlackAction)et).setBlackActionId(cti(vl)); }
    }
    public static class EpgBlackListId implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackAction)et).getBlackListId(); }
        public void write(Entity et, Object vl) { ((LdBlackAction)et).setBlackListId(cti(vl)); }
    }
    public static class EpgBlackActionCode implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackAction)et).getBlackActionCode(); }
        public void write(Entity et, Object vl) { ((LdBlackAction)et).setBlackActionCode((String)vl); }
    }
    public static class EpgBlackLevel implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackAction)et).getBlackLevel(); }
        public void write(Entity et, Object vl) { ((LdBlackAction)et).setBlackLevel(cti(vl)); }
    }
    public static class EpgActionDate implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackAction)et).getActionDate(); }
        public void write(Entity et, Object vl) { ((LdBlackAction)et).setActionDate((java.sql.Timestamp)vl); }
    }
    public static class EpgEvidencePhotograph implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackAction)et).getEvidencePhotograph(); }
        public void write(Entity et, Object vl) { ((LdBlackAction)et).setEvidencePhotograph((byte[])vl); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackAction)et).getRUser(); }
        public void write(Entity et, Object vl) { ((LdBlackAction)et).setRUser((String)vl); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackAction)et).getRModule(); }
        public void write(Entity et, Object vl) { ((LdBlackAction)et).setRModule((String)vl); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackAction)et).getRTimestamp(); }
        public void write(Entity et, Object vl) { ((LdBlackAction)et).setRTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackAction)et).getUUser(); }
        public void write(Entity et, Object vl) { ((LdBlackAction)et).setUUser((String)vl); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackAction)et).getUModule(); }
        public void write(Entity et, Object vl) { ((LdBlackAction)et).setUModule((String)vl); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdBlackAction)et).getUTimestamp(); }
        public void write(Entity et, Object vl) { ((LdBlackAction)et).setUTimestamp((java.sql.Timestamp)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BLACK_ACTION";
    protected final String _tablePropertyName = "blackAction";
    protected final TableSqlName _tableSqlName = new TableSqlName("BLACK_ACTION", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBlackActionId = cci("BLACK_ACTION_ID", "BLACK_ACTION_ID", null, null, true, "blackActionId", Integer.class, true, true, "INTEGER", 10, 0, "GENERATED_BY_DEFAULT", false, null, null, null, null, null);
    protected final ColumnInfo _columnBlackListId = cci("BLACK_LIST_ID", "BLACK_LIST_ID", null, null, true, "blackListId", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, "blackList", null, null);
    protected final ColumnInfo _columnBlackActionCode = cci("BLACK_ACTION_CODE", "BLACK_ACTION_CODE", null, null, true, "blackActionCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "blackActionLookup", null, null);
    protected final ColumnInfo _columnBlackLevel = cci("BLACK_LEVEL", "BLACK_LEVEL", null, null, true, "blackLevel", Integer.class, false, false, "SMALLINT", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnActionDate = cci("ACTION_DATE", "ACTION_DATE", null, null, false, "actionDate", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnEvidencePhotograph = cci("EVIDENCE_PHOTOGRAPH", "EVIDENCE_PHOTOGRAPH", null, null, false, "evidencePhotograph", byte[].class, false, false, "BLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, true, "RUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, true, "RModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.RegisterModuleType);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, true, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, true, "UUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", true, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, true, "UModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", true, null, null, null, null, LdCDef.DefMeta.UpdateModuleType);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, true, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", true, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    public ColumnInfo columnBlackActionId() { return _columnBlackActionId; }
    public ColumnInfo columnBlackListId() { return _columnBlackListId; }
    public ColumnInfo columnBlackActionCode() { return _columnBlackActionCode; }
    public ColumnInfo columnBlackLevel() { return _columnBlackLevel; }
    public ColumnInfo columnActionDate() { return _columnActionDate; }
    public ColumnInfo columnEvidencePhotograph() { return _columnEvidencePhotograph; }
    public ColumnInfo columnRUser() { return _columnRUser; }
    public ColumnInfo columnRModule() { return _columnRModule; }
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public ColumnInfo columnUUser() { return _columnUUser; }
    public ColumnInfo columnUModule() { return _columnUModule; }
    public ColumnInfo columnUTimestamp() { return _columnUTimestamp; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBlackActionId());
        ls.add(columnBlackListId());
        ls.add(columnBlackActionCode());
        ls.add(columnBlackLevel());
        ls.add(columnActionDate());
        ls.add(columnEvidencePhotograph());
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
    protected UniqueInfo cpui() { return hpcpui(columnBlackActionId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignBlackList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBlackListId(), LdBlackListDbm.getInstance().columnBlackListId());
        return cfi("FK_BLACK_ACTION_BLACK_LIST", "blackList", this, LdBlackListDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "blackActionList");
    }
    public ForeignInfo foreignBlackActionLookup() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBlackActionCode(), LdBlackActionLookupDbm.getInstance().columnBlackActionCode());
        return cfi("FK_BLACK_ACTION_LOOKUP", "blackActionLookup", this, LdBlackActionLookupDbm.getInstance(), mp, 1, false, false, false, false, null, null, false, "blackActionList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

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
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdBlackAction"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdBlackActionCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdBlackActionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdBlackAction> getEntityType() { return LdBlackAction.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdBlackAction newMyEntity() { return new LdBlackAction(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdBlackAction)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdBlackAction)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
