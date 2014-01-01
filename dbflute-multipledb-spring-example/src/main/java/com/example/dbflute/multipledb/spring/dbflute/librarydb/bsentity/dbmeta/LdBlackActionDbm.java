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
        public Object read(Entity e) { return ((LdBlackAction)e).getBlackActionId(); }
        public void write(Entity e, Object v) { ((LdBlackAction)e).setBlackActionId(cti(v)); }
    }
    public static class EpgBlackListId implements PropertyGateway {
        public Object read(Entity e) { return ((LdBlackAction)e).getBlackListId(); }
        public void write(Entity e, Object v) { ((LdBlackAction)e).setBlackListId(cti(v)); }
    }
    public static class EpgBlackActionCode implements PropertyGateway {
        public Object read(Entity e) { return ((LdBlackAction)e).getBlackActionCode(); }
        public void write(Entity e, Object v) { ((LdBlackAction)e).setBlackActionCode((String)v); }
    }
    public static class EpgBlackLevel implements PropertyGateway {
        public Object read(Entity e) { return ((LdBlackAction)e).getBlackLevel(); }
        public void write(Entity e, Object v) { ((LdBlackAction)e).setBlackLevel(cti(v)); }
    }
    public static class EpgActionDate implements PropertyGateway {
        public Object read(Entity e) { return ((LdBlackAction)e).getActionDate(); }
        public void write(Entity e, Object v) { ((LdBlackAction)e).setActionDate((java.sql.Timestamp)v); }
    }
    public static class EpgEvidencePhotograph implements PropertyGateway {
        public Object read(Entity e) { return ((LdBlackAction)e).getEvidencePhotograph(); }
        public void write(Entity e, Object v) { ((LdBlackAction)e).setEvidencePhotograph((byte[])v); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity e) { return ((LdBlackAction)e).getRUser(); }
        public void write(Entity e, Object v) { ((LdBlackAction)e).setRUser((String)v); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity e) { return ((LdBlackAction)e).getRModule(); }
        public void write(Entity e, Object v) { ((LdBlackAction)e).setRModule((String)v); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((LdBlackAction)e).getRTimestamp(); }
        public void write(Entity e, Object v) { ((LdBlackAction)e).setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity e) { return ((LdBlackAction)e).getUUser(); }
        public void write(Entity e, Object v) { ((LdBlackAction)e).setUUser((String)v); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity e) { return ((LdBlackAction)e).getUModule(); }
        public void write(Entity e, Object v) { ((LdBlackAction)e).setUModule((String)v); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity e) { return ((LdBlackAction)e).getUTimestamp(); }
        public void write(Entity e, Object v) { ((LdBlackAction)e).setUTimestamp((java.sql.Timestamp)v); }
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
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, true, "RUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, true, "RModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, true, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, true, "UUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, true, "UModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, true, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, OptimisticLockType.UPDATE_DATE, null, null, null, null);

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
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnBlackListId(), LdBlackListDbm.getInstance().columnBlackListId());
        return cfi("FK_BLACK_ACTION_BLACK_LIST", "blackList", this, LdBlackListDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "blackActionList");
    }
    public ForeignInfo foreignBlackActionLookup() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnBlackActionCode(), LdBlackActionLookupDbm.getInstance().columnBlackActionCode());
        return cfi("FK_BLACK_ACTION_LOOKUP", "blackActionLookup", this, LdBlackActionLookupDbm.getInstance(), map, 1, false, false, false, false, null, null, false, "blackActionList");
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdBlackAction"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdBlackActionCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdBlackActionBhv"; }

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
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((LdBlackAction)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((LdBlackAction)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
