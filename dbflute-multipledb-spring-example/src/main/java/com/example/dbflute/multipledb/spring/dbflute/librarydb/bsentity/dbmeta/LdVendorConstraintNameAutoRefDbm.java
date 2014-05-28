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
 * The DB meta of VENDOR_CONSTRAINT_NAME_AUTO_REF. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdVendorConstraintNameAutoRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdVendorConstraintNameAutoRefDbm _instance = new LdVendorConstraintNameAutoRefDbm();
    private LdVendorConstraintNameAutoRefDbm() {}
    public static LdVendorConstraintNameAutoRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgConstraintNameAutoRefId(), "constraintNameAutoRefId");
        setupEpg(_epgMap, new EpgConstraintNameAutoFooId(), "constraintNameAutoFooId");
        setupEpg(_epgMap, new EpgConstraintNameAutoBarId(), "constraintNameAutoBarId");
        setupEpg(_epgMap, new EpgConstraintNameAutoQuxId(), "constraintNameAutoQuxId");
        setupEpg(_epgMap, new EpgConstraintNameAutoUnique(), "constraintNameAutoUnique");
    }
    public static class EpgConstraintNameAutoRefId implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorConstraintNameAutoRef)et).getConstraintNameAutoRefId(); }
        public void write(Entity et, Object vl) { ((LdVendorConstraintNameAutoRef)et).setConstraintNameAutoRefId(ctb(vl)); }
    }
    public static class EpgConstraintNameAutoFooId implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorConstraintNameAutoRef)et).getConstraintNameAutoFooId(); }
        public void write(Entity et, Object vl) { ((LdVendorConstraintNameAutoRef)et).setConstraintNameAutoFooId(ctb(vl)); }
    }
    public static class EpgConstraintNameAutoBarId implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorConstraintNameAutoRef)et).getConstraintNameAutoBarId(); }
        public void write(Entity et, Object vl) { ((LdVendorConstraintNameAutoRef)et).setConstraintNameAutoBarId(ctb(vl)); }
    }
    public static class EpgConstraintNameAutoQuxId implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorConstraintNameAutoRef)et).getConstraintNameAutoQuxId(); }
        public void write(Entity et, Object vl) { ((LdVendorConstraintNameAutoRef)et).setConstraintNameAutoQuxId(ctb(vl)); }
    }
    public static class EpgConstraintNameAutoUnique implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorConstraintNameAutoRef)et).getConstraintNameAutoUnique(); }
        public void write(Entity et, Object vl) { ((LdVendorConstraintNameAutoRef)et).setConstraintNameAutoUnique((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgVendorConstraintNameAutoFoo(), "vendorConstraintNameAutoFoo");
        setupEfpg(_efpgMap, new EfpgVendorConstraintNameAutoBar(), "vendorConstraintNameAutoBar");
        setupEfpg(_efpgMap, new EfpgVendorConstraintNameAutoQux(), "vendorConstraintNameAutoQux");
    }
    public class EfpgVendorConstraintNameAutoFoo implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorConstraintNameAutoRef)et).getVendorConstraintNameAutoFoo(); }
        public void write(Entity et, Object vl) { ((LdVendorConstraintNameAutoRef)et).setVendorConstraintNameAutoFoo((LdVendorConstraintNameAutoFoo)vl); }
    }
    public class EfpgVendorConstraintNameAutoBar implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorConstraintNameAutoRef)et).getVendorConstraintNameAutoBar(); }
        public void write(Entity et, Object vl) { ((LdVendorConstraintNameAutoRef)et).setVendorConstraintNameAutoBar((LdVendorConstraintNameAutoBar)vl); }
    }
    public class EfpgVendorConstraintNameAutoQux implements PropertyGateway {
        public Object read(Entity et) { return ((LdVendorConstraintNameAutoRef)et).getVendorConstraintNameAutoQux(); }
        public void write(Entity et, Object vl) { ((LdVendorConstraintNameAutoRef)et).setVendorConstraintNameAutoQux((LdVendorConstraintNameAutoQux)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_CONSTRAINT_NAME_AUTO_REF";
    protected final String _tablePropertyName = "vendorConstraintNameAutoRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_CONSTRAINT_NAME_AUTO_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(LdDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnConstraintNameAutoRefId = cci("CONSTRAINT_NAME_AUTO_REF_ID", "CONSTRAINT_NAME_AUTO_REF_ID", null, null, java.math.BigDecimal.class, "constraintNameAutoRefId", null, true, false, true, "NUMERIC", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnConstraintNameAutoFooId = cci("CONSTRAINT_NAME_AUTO_FOO_ID", "CONSTRAINT_NAME_AUTO_FOO_ID", null, null, java.math.BigDecimal.class, "constraintNameAutoFooId", null, false, false, true, "NUMERIC", 16, 0, null, false, null, null, "vendorConstraintNameAutoFoo", null, null);
    protected final ColumnInfo _columnConstraintNameAutoBarId = cci("CONSTRAINT_NAME_AUTO_BAR_ID", "CONSTRAINT_NAME_AUTO_BAR_ID", null, null, java.math.BigDecimal.class, "constraintNameAutoBarId", null, false, false, true, "NUMERIC", 16, 0, null, false, null, null, "vendorConstraintNameAutoBar", null, null);
    protected final ColumnInfo _columnConstraintNameAutoQuxId = cci("CONSTRAINT_NAME_AUTO_QUX_ID", "CONSTRAINT_NAME_AUTO_QUX_ID", null, null, java.math.BigDecimal.class, "constraintNameAutoQuxId", null, false, false, true, "NUMERIC", 16, 0, null, false, null, null, "vendorConstraintNameAutoQux", null, null);
    protected final ColumnInfo _columnConstraintNameAutoUnique = cci("CONSTRAINT_NAME_AUTO_UNIQUE", "CONSTRAINT_NAME_AUTO_UNIQUE", null, null, String.class, "constraintNameAutoUnique", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);

    /**
     * CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, NUMERIC(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConstraintNameAutoRefId() { return _columnConstraintNameAutoRefId; }
    /**
     * CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_FOO}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConstraintNameAutoFooId() { return _columnConstraintNameAutoFooId; }
    /**
     * CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_BAR}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConstraintNameAutoBarId() { return _columnConstraintNameAutoBarId; }
    /**
     * CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, NUMERIC(16), FK to VENDOR_CONSTRAINT_NAME_AUTO_QUX}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConstraintNameAutoQuxId() { return _columnConstraintNameAutoQuxId; }
    /**
     * CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConstraintNameAutoUnique() { return _columnConstraintNameAutoUnique; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnConstraintNameAutoRefId());
        ls.add(columnConstraintNameAutoFooId());
        ls.add(columnConstraintNameAutoBarId());
        ls.add(columnConstraintNameAutoQuxId());
        ls.add(columnConstraintNameAutoUnique());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnConstraintNameAutoRefId()); }
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
     * VENDOR_CONSTRAINT_NAME_AUTO_FOO by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorConstraintNameAutoFoo() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnConstraintNameAutoFooId(), LdVendorConstraintNameAutoFooDbm.getInstance().columnConstraintNameAutoFooId());
        return cfi("SQL111023215623821", "vendorConstraintNameAutoFoo", this, LdVendorConstraintNameAutoFooDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "vendorConstraintNameAutoRefList");
    }
    /**
     * VENDOR_CONSTRAINT_NAME_AUTO_BAR by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorConstraintNameAutoBar() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnConstraintNameAutoBarId(), LdVendorConstraintNameAutoBarDbm.getInstance().columnConstraintNameAutoBarId());
        return cfi("SQL111023215623822", "vendorConstraintNameAutoBar", this, LdVendorConstraintNameAutoBarDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "vendorConstraintNameAutoRefList");
    }
    /**
     * VENDOR_CONSTRAINT_NAME_AUTO_QUX by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorConstraintNameAutoQux() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnConstraintNameAutoQuxId(), LdVendorConstraintNameAutoQuxDbm.getInstance().columnConstraintNameAutoQuxId());
        return cfi("SQL111023215623823", "vendorConstraintNameAutoQux", this, LdVendorConstraintNameAutoQuxDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "vendorConstraintNameAutoRefList");
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
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdVendorConstraintNameAutoRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdVendorConstraintNameAutoRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdVendorConstraintNameAutoRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdVendorConstraintNameAutoRef> getEntityType() { return LdVendorConstraintNameAutoRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public LdVendorConstraintNameAutoRef newMyEntity() { return new LdVendorConstraintNameAutoRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LdVendorConstraintNameAutoRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LdVendorConstraintNameAutoRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
