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
 * The DB meta of VENDOR_CONSTRAINT_NAME_AUTO_FOO. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdVendorConstraintNameAutoFooDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdVendorConstraintNameAutoFooDbm _instance = new LdVendorConstraintNameAutoFooDbm();
    private LdVendorConstraintNameAutoFooDbm() {}
    public static LdVendorConstraintNameAutoFooDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgConstraintNameAutoFooId(), "constraintNameAutoFooId");
        setupEpg(_epgMap, new EpgConstraintNameAutoFooName(), "constraintNameAutoFooName");
    }
    public static class EpgConstraintNameAutoFooId implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorConstraintNameAutoFoo)et).getConstraintNameAutoFooId(); }
        public void write(Entity et, Object vl) { ((LdVendorConstraintNameAutoFoo)et).setConstraintNameAutoFooId(ctb(vl)); }
    }
    public static class EpgConstraintNameAutoFooName implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorConstraintNameAutoFoo)et).getConstraintNameAutoFooName(); }
        public void write(Entity et, Object vl) { ((LdVendorConstraintNameAutoFoo)et).setConstraintNameAutoFooName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_CONSTRAINT_NAME_AUTO_FOO";
    protected final String _tablePropertyName = "vendorConstraintNameAutoFoo";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_CONSTRAINT_NAME_AUTO_FOO", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnConstraintNameAutoFooId = cci("CONSTRAINT_NAME_AUTO_FOO_ID", "CONSTRAINT_NAME_AUTO_FOO_ID", null, null, java.math.BigDecimal.class, "constraintNameAutoFooId", null, true, false, true, "NUMERIC", 16, 0, null, false, null, null, null, "vendorConstraintNameAutoRefList", null);
    protected final ColumnInfo _columnConstraintNameAutoFooName = cci("CONSTRAINT_NAME_AUTO_FOO_NAME", "CONSTRAINT_NAME_AUTO_FOO_NAME", null, null, String.class, "constraintNameAutoFooName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);

    /**
     * CONSTRAINT_NAME_AUTO_FOO_ID: {PK, NotNull, NUMERIC(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConstraintNameAutoFooId() { return _columnConstraintNameAutoFooId; }
    /**
     * CONSTRAINT_NAME_AUTO_FOO_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConstraintNameAutoFooName() { return _columnConstraintNameAutoFooName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnConstraintNameAutoFooId());
        ls.add(columnConstraintNameAutoFooName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnConstraintNameAutoFooId()); }
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * VENDOR_CONSTRAINT_NAME_AUTO_REF by CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoRefList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVendorConstraintNameAutoRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnConstraintNameAutoFooId(), LdVendorConstraintNameAutoRefDbm.getInstance().columnConstraintNameAutoFooId());
        return cri("SQL111023215623821", "vendorConstraintNameAutoRefList", this, LdVendorConstraintNameAutoRefDbm.getInstance(), mp, false, "vendorConstraintNameAutoFoo");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdVendorConstraintNameAutoFoo"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdVendorConstraintNameAutoFooCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdVendorConstraintNameAutoFooBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdVendorConstraintNameAutoFoo> getEntityType() { return LdVendorConstraintNameAutoFoo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdVendorConstraintNameAutoFoo newEntity() { return new LdVendorConstraintNameAutoFoo(); }
    public LdVendorConstraintNameAutoFoo newMyEntity() { return new LdVendorConstraintNameAutoFoo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdVendorConstraintNameAutoFoo)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdVendorConstraintNameAutoFoo)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
