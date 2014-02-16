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
 * The DB meta of SERVICE_RANK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MbServiceRankDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MbServiceRankDbm _instance = new MbServiceRankDbm();
    private MbServiceRankDbm() {}
    public static MbServiceRankDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return MbDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgServiceRankCode(), "serviceRankCode");
        setupEpg(_epgMap, new EpgServiceRankName(), "serviceRankName");
        setupEpg(_epgMap, new EpgServicePointIncidence(), "servicePointIncidence");
        setupEpg(_epgMap, new EpgNewAcceptableFlg(), "newAcceptableFlg");
        setupEpg(_epgMap, new EpgDescription(), "description");
        setupEpg(_epgMap, new EpgDisplayOrder(), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgServiceRankCode implements PropertyGateway {
        public Object read(Entity et) { return ((MbServiceRank)et).getServiceRankCode(); }
        public void write(Entity et, Object vl) { ((MbServiceRank)et).setServiceRankCode((String)vl); }
    }
    public static class EpgServiceRankName implements PropertyGateway {
        public Object read(Entity et) { return ((MbServiceRank)et).getServiceRankName(); }
        public void write(Entity et, Object vl) { ((MbServiceRank)et).setServiceRankName((String)vl); }
    }
    public static class EpgServicePointIncidence implements PropertyGateway {
        public Object read(Entity et) { return ((MbServiceRank)et).getServicePointIncidence(); }
        public void write(Entity et, Object vl) { ((MbServiceRank)et).setServicePointIncidence(ctb(vl)); }
    }
    public static class EpgNewAcceptableFlg implements PropertyGateway {
        public Object read(Entity et) { return ((MbServiceRank)et).getNewAcceptableFlg(); }
        public void write(Entity et, Object vl) { ((MbServiceRank)et).setNewAcceptableFlg(cti(vl)); }
    }
    public static class EpgDescription implements PropertyGateway {
        public Object read(Entity et) { return ((MbServiceRank)et).getDescription(); }
        public void write(Entity et, Object vl) { ((MbServiceRank)et).setDescription((String)vl); }
    }
    public static class EpgDisplayOrder implements PropertyGateway {
        public Object read(Entity et) { return ((MbServiceRank)et).getDisplayOrder(); }
        public void write(Entity et, Object vl) { ((MbServiceRank)et).setDisplayOrder(cti(vl)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SERVICE_RANK";
    protected final String _tablePropertyName = "serviceRank";
    protected final TableSqlName _tableSqlName = new TableSqlName("SERVICE_RANK", _tableDbName);
    { _tableSqlName.xacceptFilter(MbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnServiceRankCode = cci("SERVICE_RANK_CODE", "SERVICE_RANK_CODE", null, null, true, "serviceRankCode", String.class, true, false, "CHAR", 3, 0, null, false, null, null, null, "memberServiceList", null);
    protected final ColumnInfo _columnServiceRankName = cci("SERVICE_RANK_NAME", "SERVICE_RANK_NAME", null, null, true, "serviceRankName", String.class, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnServicePointIncidence = cci("SERVICE_POINT_INCIDENCE", "SERVICE_POINT_INCIDENCE", null, null, true, "servicePointIncidence", java.math.BigDecimal.class, false, false, "DECIMAL", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNewAcceptableFlg = cci("NEW_ACCEPTABLE_FLG", "NEW_ACCEPTABLE_FLG", null, null, true, "newAcceptableFlg", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, MbCDef.DefMeta.Flg);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, null, true, "description", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, true, "displayOrder", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnServiceRankCode() { return _columnServiceRankCode; }
    public ColumnInfo columnServiceRankName() { return _columnServiceRankName; }
    public ColumnInfo columnServicePointIncidence() { return _columnServicePointIncidence; }
    public ColumnInfo columnNewAcceptableFlg() { return _columnNewAcceptableFlg; }
    public ColumnInfo columnDescription() { return _columnDescription; }
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnServiceRankCode());
        ls.add(columnServiceRankName());
        ls.add(columnServicePointIncidence());
        ls.add(columnNewAcceptableFlg());
        ls.add(columnDescription());
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
    protected UniqueInfo cpui() { return hpcpui(columnServiceRankCode()); }
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
    public ReferrerInfo referrerMemberServiceList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnServiceRankCode(), MbMemberServiceDbm.getInstance().columnServiceRankCode());
        return cri("FK_MEMBER_SERVICE_SERVICE_RANK_CODE", "memberServiceList", this, MbMemberServiceDbm.getInstance(), mp, false, "serviceRank");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.MbServiceRank"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.MbServiceRankCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.MbServiceRankBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MbServiceRank> getEntityType() { return MbServiceRank.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public MbServiceRank newMyEntity() { return new MbServiceRank(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MbServiceRank)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MbServiceRank)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
