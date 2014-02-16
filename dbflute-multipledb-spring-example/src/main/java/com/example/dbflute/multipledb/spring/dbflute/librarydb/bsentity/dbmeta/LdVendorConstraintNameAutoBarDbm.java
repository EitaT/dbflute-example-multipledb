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
 * The DB meta of VENDOR_CONSTRAINT_NAME_AUTO_BAR. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdVendorConstraintNameAutoBarDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdVendorConstraintNameAutoBarDbm _instance = new LdVendorConstraintNameAutoBarDbm();
    private LdVendorConstraintNameAutoBarDbm() {}
    public static LdVendorConstraintNameAutoBarDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return LdDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgConstraintNameAutoBarId(), "constraintNameAutoBarId");
        setupEpg(_epgMap, new EpgConstraintNameAutoBarName(), "constraintNameAutoBarName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgConstraintNameAutoBarId implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorConstraintNameAutoBar)et).getConstraintNameAutoBarId(); }
        public void write(Entity et, Object vl) { ((LdVendorConstraintNameAutoBar)et).setConstraintNameAutoBarId(ctb(vl)); }
    }
    public static class EpgConstraintNameAutoBarName implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorConstraintNameAutoBar)et).getConstraintNameAutoBarName(); }
        public void write(Entity et, Object vl) { ((LdVendorConstraintNameAutoBar)et).setConstraintNameAutoBarName((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_CONSTRAINT_NAME_AUTO_BAR";
    protected final String _tablePropertyName = "vendorConstraintNameAutoBar";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_CONSTRAINT_NAME_AUTO_BAR", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnConstraintNameAutoBarId = cci("CONSTRAINT_NAME_AUTO_BAR_ID", "CONSTRAINT_NAME_AUTO_BAR_ID", null, null, true, "constraintNameAutoBarId", java.math.BigDecimal.class, true, false, "NUMERIC", 16, 0, null, false, null, null, null, "vendorConstraintNameAutoRefList", null);
    protected final ColumnInfo _columnConstraintNameAutoBarName = cci("CONSTRAINT_NAME_AUTO_BAR_NAME", "CONSTRAINT_NAME_AUTO_BAR_NAME", null, null, true, "constraintNameAutoBarName", String.class, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnConstraintNameAutoBarId() { return _columnConstraintNameAutoBarId; }
    public ColumnInfo columnConstraintNameAutoBarName() { return _columnConstraintNameAutoBarName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnConstraintNameAutoBarId());
        ls.add(columnConstraintNameAutoBarName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnConstraintNameAutoBarId()); }
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
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnConstraintNameAutoBarId(), LdVendorConstraintNameAutoRefDbm.getInstance().columnConstraintNameAutoBarId());
        return cri("SQL111023215623822", "vendorConstraintNameAutoRefList", this, LdVendorConstraintNameAutoRefDbm.getInstance(), mp, false, "vendorConstraintNameAutoBar");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdVendorConstraintNameAutoBar"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdVendorConstraintNameAutoBarCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdVendorConstraintNameAutoBarBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdVendorConstraintNameAutoBar> getEntityType() { return LdVendorConstraintNameAutoBar.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdVendorConstraintNameAutoBar newMyEntity() { return new LdVendorConstraintNameAutoBar(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdVendorConstraintNameAutoBar)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdVendorConstraintNameAutoBar)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
