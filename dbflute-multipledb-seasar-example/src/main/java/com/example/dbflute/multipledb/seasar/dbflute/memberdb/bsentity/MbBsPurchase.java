package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.allcommon.MbEntityDefinedCommonColumn;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.allcommon.MbDBMetaInstanceHandler;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.allcommon.MbCDef;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.*;

/**
 * The entity of PURCHASE as TABLE. <br />
 * 購入: 購入の度ににInsertされる
 * <pre>
 * [primary-key]
 *     PURCHASE_ID
 * 
 * [column]
 *     PURCHASE_ID, MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     PURCHASE_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     MEMBER, PRODUCT
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member, product
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long purchaseId = entity.getPurchaseId();
 * Integer memberId = entity.getMemberId();
 * Integer productId = entity.getProductId();
 * java.sql.Timestamp purchaseDatetime = entity.getPurchaseDatetime();
 * Integer purchaseCount = entity.getPurchaseCount();
 * Integer purchasePrice = entity.getPurchasePrice();
 * Integer paymentCompleteFlg = entity.getPaymentCompleteFlg();
 * java.sql.Timestamp registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.sql.Timestamp updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setPurchaseId(purchaseId);
 * entity.setMemberId(memberId);
 * entity.setProductId(productId);
 * entity.setPurchaseDatetime(purchaseDatetime);
 * entity.setPurchaseCount(purchaseCount);
 * entity.setPurchasePrice(purchasePrice);
 * entity.setPaymentCompleteFlg(paymentCompleteFlg);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class MbBsPurchase extends AbstractEntity implements DomainEntity, MbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _purchaseId;

    /** MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} */
    protected Integer _memberId;

    /** PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT} */
    protected Integer _productId;

    /** PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)} */
    protected java.sql.Timestamp _purchaseDatetime;

    /** PURCHASE_COUNT: {NotNull, INTEGER(10)} */
    protected Integer _purchaseCount;

    /** PURCHASE_PRICE: {IX, NotNull, INTEGER(10)} */
    protected Integer _purchasePrice;

    /** PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} */
    protected Integer _paymentCompleteFlg;

    /** REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected java.sql.Timestamp _registerDatetime;

    /** REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected java.sql.Timestamp _updateDatetime;

    /** UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    /** VERSION_NO: {NotNull, BIGINT(19)} */
    protected Long _versionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** Is common column auto set up effective? */
    protected boolean __canCommonColumnAutoSetup = true;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "PURCHASE";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "purchase";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return MbDBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getPurchaseId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId : UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @param productId : +UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT. (NotNull)
     * @param purchaseDatetime : +UQ, IX+, NotNull, TIMESTAMP(23, 10). (NotNull)
     */
    public void uniqueBy(Integer memberId, Integer productId, java.sql.Timestamp purchaseDatetime) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberId");
        __uniqueDrivenProperties.addPropertyName("productId");
        __uniqueDrivenProperties.addPropertyName("purchaseDatetime");
        setMemberId(memberId);setProductId(productId);setPurchaseDatetime(purchaseDatetime);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of paymentCompleteFlg as the classification of Flg. <br />
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * フラグを示す
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public MbCDef.Flg getPaymentCompleteFlgAsFlg() {
        return MbCDef.Flg.codeOf(getPaymentCompleteFlg());
    }

    /**
     * Set the value of paymentCompleteFlg as the classification of Flg. <br />
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * フラグを示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPaymentCompleteFlgAsFlg(MbCDef.Flg cdef) {
        setPaymentCompleteFlg(cdef != null ? toNumber(cdef.code(), Integer.class) : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of paymentCompleteFlg as True (1). <br />
     * True: 有効を示す
     */
    public void setPaymentCompleteFlg_True() {
        setPaymentCompleteFlgAsFlg(MbCDef.Flg.True);
    }

    /**
     * Set the value of paymentCompleteFlg as False (0). <br />
     * False: 無効を示す
     */
    public void setPaymentCompleteFlg_False() {
        setPaymentCompleteFlgAsFlg(MbCDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of paymentCompleteFlg True? <br />
     * True: 有効を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentCompleteFlgTrue() {
        MbCDef.Flg cdef = getPaymentCompleteFlgAsFlg();
        return cdef != null ? cdef.equals(MbCDef.Flg.True) : false;
    }

    /**
     * Is the value of paymentCompleteFlg False? <br />
     * False: 無効を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPaymentCompleteFlgFalse() {
        MbCDef.Flg cdef = getPaymentCompleteFlgAsFlg();
        return cdef != null ? cdef.equals(MbCDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'paymentCompleteFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPaymentCompleteFlgName() {
        MbCDef.Flg cdef = getPaymentCompleteFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** MEMBER by my MEMBER_ID, named 'member'. */
    protected MbMember _member;

    /**
     * [get] MEMBER by my MEMBER_ID, named 'member'.
     * @return The entity of foreign property 'member'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MbMember getMember() {
        return _member;
    }

    /**
     * [set] MEMBER by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(MbMember member) {
        _member = member;
    }

    /** PRODUCT by my PRODUCT_ID, named 'product'. */
    protected MbProduct _product;

    /**
     * [get] PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The entity of foreign property 'product'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MbProduct getProduct() {
        return _product;
    }

    /**
     * [set] PRODUCT by my PRODUCT_ID, named 'product'.
     * @param product The entity of foreign property 'product'. (NullAllowed)
     */
    public void setProduct(MbProduct product) {
        _product = product;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                       Common Column
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void enableCommonColumnAutoSetup() {
        __canCommonColumnAutoSetup = true;
    }

    /**
     * {@inheritDoc}
     */
    public void disableCommonColumnAutoSetup() {
        __canCommonColumnAutoSetup = false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean canCommonColumnAutoSetup() {
        return __canCommonColumnAutoSetup;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof MbBsPurchase) {
            MbBsPurchase other = (MbBsPurchase)obj;
            if (!xSV(_purchaseId, other._purchaseId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _purchaseId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null)
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_product != null)
        { sb.append(li).append(xbRDS(_product, "product")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_purchaseId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_purchaseDatetime));
        sb.append(dm).append(xfND(_purchaseCount));
        sb.append(dm).append(xfND(_purchasePrice));
        sb.append(dm).append(xfND(_paymentCompleteFlg));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_member != null)
        { sb.append(dm).append("member"); }
        if (_product != null)
        { sb.append(dm).append("product"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MbPurchase clone() {
        return (MbPurchase)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'PURCHASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPurchaseId() {
        checkSpecifiedProperty("purchaseId");
        return _purchaseId;
    }

    /**
     * [set] PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param purchaseId The value of the column 'PURCHASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseId(Long purchaseId) {
        registerModifiedProperty("purchaseId");
        _purchaseId = purchaseId;
    }

    /**
     * [get] MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT} <br />
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT} <br />
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Integer productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'PURCHASE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getPurchaseDatetime() {
        checkSpecifiedProperty("purchaseDatetime");
        return _purchaseDatetime;
    }

    /**
     * [set] PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)} <br />
     * @param purchaseDatetime The value of the column 'PURCHASE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseDatetime(java.sql.Timestamp purchaseDatetime) {
        registerModifiedProperty("purchaseDatetime");
        _purchaseDatetime = purchaseDatetime;
    }

    /**
     * [get] PURCHASE_COUNT: {NotNull, INTEGER(10)} <br />
     * @return The value of the column 'PURCHASE_COUNT'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPurchaseCount() {
        checkSpecifiedProperty("purchaseCount");
        return _purchaseCount;
    }

    /**
     * [set] PURCHASE_COUNT: {NotNull, INTEGER(10)} <br />
     * @param purchaseCount The value of the column 'PURCHASE_COUNT'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseCount(Integer purchaseCount) {
        registerModifiedProperty("purchaseCount");
        _purchaseCount = purchaseCount;
    }

    /**
     * [get] PURCHASE_PRICE: {IX, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'PURCHASE_PRICE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPurchasePrice() {
        checkSpecifiedProperty("purchasePrice");
        return _purchasePrice;
    }

    /**
     * [set] PURCHASE_PRICE: {IX, NotNull, INTEGER(10)} <br />
     * @param purchasePrice The value of the column 'PURCHASE_PRICE'. (basically NotNull if update: for the constraint)
     */
    public void setPurchasePrice(Integer purchasePrice) {
        registerModifiedProperty("purchasePrice");
        _purchasePrice = purchasePrice;
    }

    /**
     * [get] PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @return The value of the column 'PAYMENT_COMPLETE_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPaymentCompleteFlg() {
        checkSpecifiedProperty("paymentCompleteFlg");
        return _paymentCompleteFlg;
    }

    /**
     * [set] PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @param paymentCompleteFlg The value of the column 'PAYMENT_COMPLETE_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setPaymentCompleteFlg(Integer paymentCompleteFlg) {
        registerModifiedProperty("paymentCompleteFlg");
        _paymentCompleteFlg = paymentCompleteFlg;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.sql.Timestamp registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.sql.Timestamp updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
