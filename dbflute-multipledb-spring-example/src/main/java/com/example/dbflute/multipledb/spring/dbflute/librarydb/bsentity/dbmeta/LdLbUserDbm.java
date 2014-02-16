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
 * The DB meta of LB_USER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdLbUserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdLbUserDbm _instance = new LdLbUserDbm();
    private LdLbUserDbm() {}
    public static LdLbUserDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return LdDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgLbUserId(), "lbUserId");
        setupEpg(_epgMap, new EpgLbUserName(), "lbUserName");
        setupEpg(_epgMap, new EpgUserPassword(), "userPassword");
        setupEpg(_epgMap, new EpgRUser(), "RUser");
        setupEpg(_epgMap, new EpgRModule(), "RModule");
        setupEpg(_epgMap, new EpgRTimestamp(), "RTimestamp");
        setupEpg(_epgMap, new EpgUUser(), "UUser");
        setupEpg(_epgMap, new EpgUModule(), "UModule");
        setupEpg(_epgMap, new EpgUTimestamp(), "UTimestamp");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgLbUserId implements PropertyGateway {
        public Object read(Entity et) { return ((LdLbUser)et).getLbUserId(); }
        public void write(Entity et, Object vl) { ((LdLbUser)et).setLbUserId(cti(vl)); }
    }
    public static class EpgLbUserName implements PropertyGateway {
        public Object read(Entity et) { return ((LdLbUser)et).getLbUserName(); }
        public void write(Entity et, Object vl) { ((LdLbUser)et).setLbUserName((String)vl); }
    }
    public static class EpgUserPassword implements PropertyGateway {
        public Object read(Entity et) { return ((LdLbUser)et).getUserPassword(); }
        public void write(Entity et, Object vl) { ((LdLbUser)et).setUserPassword((String)vl); }
    }
    public static class EpgRUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdLbUser)et).getRUser(); }
        public void write(Entity et, Object vl) { ((LdLbUser)et).setRUser((String)vl); }
    }
    public static class EpgRModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdLbUser)et).getRModule(); }
        public void write(Entity et, Object vl) { ((LdLbUser)et).setRModule((String)vl); }
    }
    public static class EpgRTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdLbUser)et).getRTimestamp(); }
        public void write(Entity et, Object vl) { ((LdLbUser)et).setRTimestamp((java.sql.Timestamp)vl); }
    }
    public static class EpgUUser implements PropertyGateway {
        public Object read(Entity et) { return ((LdLbUser)et).getUUser(); }
        public void write(Entity et, Object vl) { ((LdLbUser)et).setUUser((String)vl); }
    }
    public static class EpgUModule implements PropertyGateway {
        public Object read(Entity et) { return ((LdLbUser)et).getUModule(); }
        public void write(Entity et, Object vl) { ((LdLbUser)et).setUModule((String)vl); }
    }
    public static class EpgUTimestamp implements PropertyGateway {
        public Object read(Entity et) { return ((LdLbUser)et).getUTimestamp(); }
        public void write(Entity et, Object vl) { ((LdLbUser)et).setUTimestamp((java.sql.Timestamp)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LB_USER";
    protected final String _tablePropertyName = "lbUser";
    protected final TableSqlName _tableSqlName = new TableSqlName("LB_USER", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLbUserId = cci("LB_USER_ID", "LB_USER_ID", null, null, true, "lbUserId", Integer.class, true, true, "INTEGER", 10, 0, "GENERATED_BY_DEFAULT", false, null, null, null, "libraryUserList", null);
    protected final ColumnInfo _columnLbUserName = cci("LB_USER_NAME", "LB_USER_NAME", null, null, true, "lbUserName", String.class, false, false, "VARCHAR", 80, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUserPassword = cci("USER_PASSWORD", "USER_PASSWORD", null, null, true, "userPassword", String.class, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRUser = cci("R_USER", "R_USER", null, null, true, "RUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnRModule = cci("R_MODULE", "R_MODULE", null, null, true, "RModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", "R_TIMESTAMP", null, null, true, "RTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, null, null, null, null, null);
    protected final ColumnInfo _columnUUser = cci("U_USER", "U_USER", null, null, true, "UUser", String.class, false, false, "VARCHAR", 100, 0, "default-user", false, null, null, null, null, null);
    protected final ColumnInfo _columnUModule = cci("U_MODULE", "U_MODULE", null, null, true, "UModule", String.class, false, false, "VARCHAR", 100, 0, "default-module", false, null, null, null, null, null);
    protected final ColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", "U_TIMESTAMP", null, null, true, "UTimestamp", java.sql.Timestamp.class, false, false, "TIMESTAMP", 26, 6, "CURRENT_TIMESTAMP", false, OptimisticLockType.UPDATE_DATE, null, null, null, null);

    public ColumnInfo columnLbUserId() { return _columnLbUserId; }
    public ColumnInfo columnLbUserName() { return _columnLbUserName; }
    public ColumnInfo columnUserPassword() { return _columnUserPassword; }
    public ColumnInfo columnRUser() { return _columnRUser; }
    public ColumnInfo columnRModule() { return _columnRModule; }
    public ColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public ColumnInfo columnUUser() { return _columnUUser; }
    public ColumnInfo columnUModule() { return _columnUModule; }
    public ColumnInfo columnUTimestamp() { return _columnUTimestamp; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLbUserId());
        ls.add(columnLbUserName());
        ls.add(columnUserPassword());
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
    protected UniqueInfo cpui() { return hpcpui(columnLbUserId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignBlackListAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLbUserId(), LdBlackListDbm.getInstance().columnLbUserId());
        return cfi("FK_BLACK_LIST_LB_USER", "blackListAsOne", this, LdBlackListDbm.getInstance(), mp, 0, true, false, true, false, null, null, false, "lbUser");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerLibraryUserList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLbUserId(), LdLibraryUserDbm.getInstance().columnLbUserId());
        return cri("FK_LIBRARY_USER_LB_USER", "libraryUserList", this, LdLibraryUserDbm.getInstance(), mp, false, "lbUser");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasUpdateDate() { return true; }
    public ColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdLbUser"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdLbUserCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdLbUserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdLbUser> getEntityType() { return LdLbUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdLbUser newMyEntity() { return new LdLbUser(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdLbUser)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdLbUser)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
