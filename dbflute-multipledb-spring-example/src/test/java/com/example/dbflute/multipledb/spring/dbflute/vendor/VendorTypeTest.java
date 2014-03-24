package com.example.dbflute.multipledb.spring.dbflute.vendor;

import java.io.Serializable;
import java.sql.Time;
import java.util.Calendar;

import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdVendorCheckCB;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdVendorCheckBhv;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdVendorCheck;
import com.example.dbflute.multipledb.spring.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.6 (2010/03/11 Thursday)
 */
public class VendorTypeTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private LdVendorCheckBhv ldVendorCheckBhv;

    // ===================================================================================
    //                                                                         String Type
    //                                                                         ===========
    // -----------------------------------------------------
    //                                          LONG VARCHAR
    //                                          ------------
    public void test_LONG_VARCHAR_insert_select() {
        // ## Arrange ##
        String expected = "foo";
        LdVendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfLongVarchar(expected);

        // ## Act ##
        ldVendorCheckBhv.insert(vendorCheck);
        LdVendorCheckCB cb = new LdVendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        LdVendorCheck selected = ldVendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        String actual = selected.getTypeOfLongVarchar();
        assertNotNull(actual);
        log("actual =" + actual);
        assertEquals(expected, actual);
    }

    // ===================================================================================
    //                                                                           Date Type
    //                                                                           =========
    // -----------------------------------------------------
    //                                                  TIME
    //                                                  ----
    public void test_TIME_insert_select() {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2002, 5, 15, 12, 34, 56);
        Time specifiedTime = new Time(cal.getTimeInMillis());
        cal.set(2002, 5, 15, 12, 34, 55);
        Time oneSecondBeforeTime = new Time(cal.getTimeInMillis());
        cal.set(2002, 5, 15, 12, 34, 57);
        Time oneSecondAfterTime = new Time(cal.getTimeInMillis());

        LdVendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfTime(specifiedTime);
        ldVendorCheckBhv.insert(vendorCheck);

        LdVendorCheckCB cb = new LdVendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        cb.query().setTypeOfTime_GreaterThan(oneSecondBeforeTime);
        cb.query().setTypeOfTime_LessThan(oneSecondAfterTime);

        // ## Act ##
        LdVendorCheck actual = ldVendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        Time actualTime = actual.getTypeOfTime();
        log("actualTime=" + actualTime);
        assertNotNull(actualTime);
        assertEquals(specifiedTime.toString(), actualTime.toString());
    }

    // ===================================================================================
    //                                                                         Binary Type
    //                                                                         ===========
    // -----------------------------------------------------
    //                                                  BLOB
    //                                                  ----
    // *OK but BLOB prevents other type tests from executing.
    //public void test_BLOB_insert_select() {
    //    // ## Arrange ##
    //    String expected = "foo";
    //    MbMember member = new MbMember();
    //    member.setMemberName(expected);
    //    LdVendorCheck vendorCheck = createVendorCheck();
    //    vendorCheck.setTypeOfBlob(serialize(member));
    //
    //    // ## Act ##
    //    ldVendorCheckBhv.insert(vendorCheck);
    //    LdVendorCheckCB cb = new LdVendorCheckCB();
    //    cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
    //    LdVendorCheck selected = ldVendorCheckBhv.selectEntityWithDeletedCheck(cb);
    //
    //    // ## Assert ##
    //    byte[] bytes = selected.getTypeOfBlob();
    //    assertNotNull(bytes);
    //    MbMember deserialized = (MbMember) deserialize(bytes);
    //    log("deserialized=" + deserialized);
    //    assertEquals(expected, deserialized.getMemberName());
    //}

    // ===================================================================================
    //                                                                        Various Type
    //                                                                        ============
    // -----------------------------------------------------
    //                                                   XML
    //                                                   ---
    // *NG and XML prevents other type tests from executing.
    //public void test_XML_insert_select() throws Exception {
    //    // ## Arrange ##
    //    String expected = "<foo/>";
    //    LdVendorCheck vendorCheck = createVendorCheck();
    //    vendorCheck.setTypeOfXml(expected);
    //
    //    // ## Act ##
    //    try {
    //        ldVendorCheckBhv.insert(vendorCheck);
    //
    //        // ## Assert ##
    //        fail();
    //    } catch (SQLFailureException e) {
    //        // OK
    //        log(e.getMessage());
    //
    //        // org.apache.derby.impl.jdbc.EmbedSQLException
    //        // Binding directly to an XML value is not allowed; try using XMLPARSE.
    //    }
    //}

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected LdVendorCheck createVendorCheck() {
        LdVendorCheck vendorCheck = new LdVendorCheck();
        vendorCheck.setVendorCheckId(new Long(99999));
        return vendorCheck;
    }

    protected LdVendorCheck createVendorCheck(Integer id) {
        LdVendorCheck vendorCheck = new LdVendorCheck();
        vendorCheck.setVendorCheckId(new Long(id));
        return vendorCheck;
    }

    protected byte[] serialize(Serializable obj) {
        return DfTypeUtil.toBinary(obj);
    }

    protected Serializable deserialize(byte[] bytes) {
        return DfTypeUtil.toSerializable(bytes);
    }
}
