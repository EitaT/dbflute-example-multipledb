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
 * The DB meta of VENDOR_CONSTRAINT_NAME_AUTO_QUX. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdVendorConstraintNameAutoQuxDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdVendorConstraintNameAutoQuxDbm _instance = new LdVendorConstraintNameAutoQuxDbm();
    private LdVendorConstraintNameAutoQuxDbm() {}
    public static LdVendorConstraintNameAutoQuxDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return LdDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgConstraintNameAutoQuxId(), "constraintNameAutoQuxId");
        setupEpg(_epgMap, new EpgConstraintNameAutoQuxName(), "constraintNameAutoQuxName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgConstraintNameAutoQuxId implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorConstraintNameAutoQux)et).getConstraintNameAutoQuxId(); }
        public void write(Entity et, Object vl) { ((LdVendorConstraintNameAutoQux)et).setConstraintNameAutoQuxId(ctb(vl)); }
    }
    public static class EpgConstraintNameAutoQuxName implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorConstraintNameAutoQux)et).getConstraintNameAutoQuxName(); }
        public void write(Entity et, Object vl) { ((LdVendorConstraintNameAutoQux)et).setConstraintNameAutoQuxName((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_CONSTRAINT_NAME_AUTO_QUX";
    protected final String _tablePropertyName = "vendorConstraintNameAutoQux";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_CONSTRAINT_NAME_AUTO_QUX", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnConstraintNameAutoQuxId = cci("CONSTRAINT_NAME_AUTO_QUX_ID", "CONSTRAINT_NAME_AUTO_QUX_ID", null, null, true, "constraintNameAutoQuxId", java.math.BigDecimal.class, true, false, "NUMERIC", 16, 0, null, false, null, null, null, "vendorConstraintNameAutoRefList", null);
    protected final ColumnInfo _columnConstraintNameAutoQuxName = cci("CONSTRAINT_NAME_AUTO_QUX_NAME", "CONSTRAINT_NAME_AUTO_QUX_NAME", null, null, true, "constraintNameAutoQuxName", String.class, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnConstraintNameAutoQuxId() { return _columnConstraintNameAutoQuxId; }
    public ColumnInfo columnConstraintNameAutoQuxName() { return _columnConstraintNameAutoQuxName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnConstraintNameAutoQuxId());
        ls.add(columnConstraintNameAutoQuxName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnConstraintNameAutoQuxId()); }
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
    public ReferrerInfo referrerVendorConstraintNameAutoRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnConstraintNameAutoQuxId(), LdVendorConstraintNameAutoRefDbm.getInstance().columnConstraintNameAutoQuxId());
        return cri("SQL111023215623823", "vendorConstraintNameAutoRefList", this, LdVendorConstraintNameAutoRefDbm.getInstance(), mp, false, "vendorConstraintNameAutoQux");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdVendorConstraintNameAutoQux"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdVendorConstraintNameAutoQuxCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdVendorConstraintNameAutoQuxBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdVendorConstraintNameAutoQux> getEntityType() { return LdVendorConstraintNameAutoQux.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdVendorConstraintNameAutoQux newMyEntity() { return new LdVendorConstraintNameAutoQux(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdVendorConstraintNameAutoQux)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdVendorConstraintNameAutoQux)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
