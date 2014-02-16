package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.allcommon.*;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;

/**
 * The DB meta of PURCHASE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MbPurchaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MbPurchaseDbm _instance = new MbPurchaseDbm();
    private MbPurchaseDbm() {}
    public static MbPurchaseDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return MbDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgPurchaseId(), "purchaseId");
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgProductId(), "productId");
        setupEpg(_epgMap, new EpgPurchaseDatetime(), "purchaseDatetime");
        setupEpg(_epgMap, new EpgPurchaseCount(), "purchaseCount");
        setupEpg(_epgMap, new EpgPurchasePrice(), "purchasePrice");
        setupEpg(_epgMap, new EpgPaymentCompleteFlg(), "paymentCompleteFlg");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgPurchaseId implements PropertyGateway {
        public Object read(Entity et) { return ((MbPurchase)et).getPurchaseId(); }
        public void write(Entity et, Object vl) { ((MbPurchase)et).setPurchaseId(ctl(vl)); }
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((MbPurchase)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((MbPurchase)et).setMemberId(cti(vl)); }
    }
    public static class EpgProductId implements PropertyGateway {
        public Object read(Entity et) { return ((MbPurchase)et).getProductId(); }
        public void write(Entity et, Object vl) { ((MbPurchase)et).setProductId(cti(vl)); }
    }
    public static class EpgPurchaseDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MbPurchase)et).getPurchaseDatetime(); }
        public void write(Entity et, Object vl) { ((MbPurchase)et).setPurchaseDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgPurchaseCount implements PropertyGateway {
        public Object read(Entity et) { return ((MbPurchase)et).getPurchaseCount(); }
        public void write(Entity et, Object vl) { ((MbPurchase)et).setPurchaseCount(cti(vl)); }
    }
    public static class EpgPurchasePrice implements PropertyGateway {
        public Object read(Entity et) { return ((MbPurchase)et).getPurchasePrice(); }
        public void write(Entity et, Object vl) { ((MbPurchase)et).setPurchasePrice(cti(vl)); }
    }
    public static class EpgPaymentCompleteFlg implements PropertyGateway {
        public Object read(Entity et) { return ((MbPurchase)et).getPaymentCompleteFlg(); }
        public void write(Entity et, Object vl) { ((MbPurchase)et).setPaymentCompleteFlg(cti(vl)); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MbPurchase)et).getRegisterDatetime(); }
        public void write(Entity et, Object vl) { ((MbPurchase)et).setRegisterDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity et) { return ((MbPurchase)et).getRegisterUser(); }
        public void write(Entity et, Object vl) { ((MbPurchase)et).setRegisterUser((String)vl); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MbPurchase)et).getUpdateDatetime(); }
        public void write(Entity et, Object vl) { ((MbPurchase)et).setUpdateDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity et) { return ((MbPurchase)et).getUpdateUser(); }
        public void write(Entity et, Object vl) { ((MbPurchase)et).setUpdateUser((String)vl); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity et) { return ((MbPurchase)et).getVersionNo(); }
        public void write(Entity et, Object vl) { ((MbPurchase)et).setVersionNo(ctl(vl)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PURCHASE";
    protected final String _tablePropertyName = "purchase";
    protected final TableSqlName _tableSqlName = new TableSqlName("PURCHASE", _tableDbName);
    { _tableSqlName.xacceptFilter(MbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPurchaseId = cci("PURCHASE_ID", "PURCHASE_ID", null, null, true, "purchaseId", Long.class, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_5439AC01_FD57_4385_8438_98E2386B9ECA", false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, true, "memberId", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, "member", null, null);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, true, "productId", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, "product", null, null);
    protected final ColumnInfo _columnPurchaseDatetime = cci("PURCHASE_DATETIME", "PURCHASE_DATETIME", null, null, true, "purchaseDatetime", java.sql.Timestamp.class, false, false, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPurchaseCount = cci("PURCHASE_COUNT", "PURCHASE_COUNT", null, null, true, "purchaseCount", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPurchasePrice = cci("PURCHASE_PRICE", "PURCHASE_PRICE", null, null, true, "purchasePrice", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPaymentCompleteFlg = cci("PAYMENT_COMPLETE_FLG", "PAYMENT_COMPLETE_FLG", null, null, true, "paymentCompleteFlg", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, MbCDef.DefMeta.Flg);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, true, "registerDatetime", java.sql.Timestamp.class, false, false, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, true, "registerUser", String.class, false, false, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, true, "updateDatetime", java.sql.Timestamp.class, false, false, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, true, "updateUser", String.class, false, false, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, true, "versionNo", Long.class, false, false, "BIGINT", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    public ColumnInfo columnPurchaseId() { return _columnPurchaseId; }
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnProductId() { return _columnProductId; }
    public ColumnInfo columnPurchaseDatetime() { return _columnPurchaseDatetime; }
    public ColumnInfo columnPurchaseCount() { return _columnPurchaseCount; }
    public ColumnInfo columnPurchasePrice() { return _columnPurchasePrice; }
    public ColumnInfo columnPaymentCompleteFlg() { return _columnPaymentCompleteFlg; }
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPurchaseId());
        ls.add(columnMemberId());
        ls.add(columnProductId());
        ls.add(columnPurchaseDatetime());
        ls.add(columnPurchaseCount());
        ls.add(columnPurchasePrice());
        ls.add(columnPaymentCompleteFlg());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnPurchaseId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MbMemberDbm.getInstance().columnMemberId());
        return cfi("FK_PURCHASE_MEMBER", "member", this, MbMemberDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "purchaseList");
    }
    public ForeignInfo foreignProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MbProductDbm.getInstance().columnProductId());
        return cfi("FK_PURCHASE_PRODUCT", "product", this, MbProductDbm.getInstance(), mp, 1, false, false, false, false, null, null, false, "purchaseList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.MbPurchase"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.MbPurchaseCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.MbPurchaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MbPurchase> getEntityType() { return MbPurchase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public MbPurchase newMyEntity() { return new MbPurchase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MbPurchase)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MbPurchase)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
