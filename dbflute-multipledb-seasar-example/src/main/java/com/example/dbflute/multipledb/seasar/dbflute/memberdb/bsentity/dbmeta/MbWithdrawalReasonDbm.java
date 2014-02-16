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
 * The DB meta of WITHDRAWAL_REASON. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MbWithdrawalReasonDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MbWithdrawalReasonDbm _instance = new MbWithdrawalReasonDbm();
    private MbWithdrawalReasonDbm() {}
    public static MbWithdrawalReasonDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return MbDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgWithdrawalReasonCode(), "withdrawalReasonCode");
        setupEpg(_epgMap, new EpgWithdrawalReasonText(), "withdrawalReasonText");
        setupEpg(_epgMap, new EpgDisplayOrder(), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgWithdrawalReasonCode implements PropertyGateway {
        public Object read(Entity et) { return ((MbWithdrawalReason)et).getWithdrawalReasonCode(); }
        public void write(Entity et, Object vl) { ((MbWithdrawalReason)et).setWithdrawalReasonCode((String)vl); }
    }
    public static class EpgWithdrawalReasonText implements PropertyGateway {
        public Object read(Entity et) { return ((MbWithdrawalReason)et).getWithdrawalReasonText(); }
        public void write(Entity et, Object vl) { ((MbWithdrawalReason)et).setWithdrawalReasonText((String)vl); }
    }
    public static class EpgDisplayOrder implements PropertyGateway {
        public Object read(Entity et) { return ((MbWithdrawalReason)et).getDisplayOrder(); }
        public void write(Entity et, Object vl) { ((MbWithdrawalReason)et).setDisplayOrder(cti(vl)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WITHDRAWAL_REASON";
    protected final String _tablePropertyName = "withdrawalReason";
    protected final TableSqlName _tableSqlName = new TableSqlName("WITHDRAWAL_REASON", _tableDbName);
    { _tableSqlName.xacceptFilter(MbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWithdrawalReasonCode = cci("WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", null, null, true, "withdrawalReasonCode", String.class, true, false, "CHAR", 3, 0, null, false, null, null, null, "memberWithdrawalList", null);
    protected final ColumnInfo _columnWithdrawalReasonText = cci("WITHDRAWAL_REASON_TEXT", "WITHDRAWAL_REASON_TEXT", null, null, true, "withdrawalReasonText", String.class, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, true, "displayOrder", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnWithdrawalReasonCode() { return _columnWithdrawalReasonCode; }
    public ColumnInfo columnWithdrawalReasonText() { return _columnWithdrawalReasonText; }
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnWithdrawalReasonCode());
        ls.add(columnWithdrawalReasonText());
        ls.add(columnDisplayOrder());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnWithdrawalReasonCode()); }
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
    public ReferrerInfo referrerMemberWithdrawalList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWithdrawalReasonCode(), MbMemberWithdrawalDbm.getInstance().columnWithdrawalReasonCode());
        return cri("FK_MEMBER_WITHDRAWAL_WITHDRAWAL_REASON", "memberWithdrawalList", this, MbMemberWithdrawalDbm.getInstance(), mp, false, "withdrawalReason");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.MbWithdrawalReason"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.MbWithdrawalReasonCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.MbWithdrawalReasonBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MbWithdrawalReason> getEntityType() { return MbWithdrawalReason.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public MbWithdrawalReason newMyEntity() { return new MbWithdrawalReason(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MbWithdrawalReason)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MbWithdrawalReason)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
