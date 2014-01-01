package com.example.dbflute.multipledb.spring.dbflute.vendor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.util.DfTypeUtil;

import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdLibraryCB;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdLibraryBhv;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdLibrary;
import com.example.dbflute.multipledb.spring.unit.AppContainerTestCase;

/**
 * @author jflute
 */
public class VendorPlainTest extends AppContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private LdLibraryBhv ldLibraryBhv;

    // ===================================================================================
    //                                                                             Operand
    //                                                                             =======
    public void test_operand_NotEqual() {
        // ## Arrange ##
        LdLibraryCB cb = new LdLibraryCB();
        cb.query().setLibraryId_NotEqual(3);
        
        // ## Act ##
        ListResultBean<LdLibrary> libraryList = ldLibraryBhv.selectList(cb);
        
        // ## Assert ##
        for (LdLibrary library : libraryList) {
            log(library);
            assertNotSame(Integer.valueOf(3), library.getLibraryId());
        }
    }
    
    // ===================================================================================
    //                                                                             BC Date
    //                                                                             =======
    public void test_BC_date() {
        // ## Arrange ##
        LdLibraryCB cb = new LdLibraryCB();
        cb.fetchFirst(1);
        cb.addOrderBy_PK_Asc();
        LdLibrary library = ldLibraryBhv.selectEntity(cb);
        library.setRTimestamp(DfTypeUtil.toTimestamp("-2009/12/25 12:34:56.147"));

        // ## Act ##
        ldLibraryBhv.update(library);

        // ## Assert ##
        LdLibrary actual = ldLibraryBhv.selectByPKValue(library.getLibraryId());
        DateFormat df = new SimpleDateFormat("Gyyyy/MM/dd");
        log(df.format(actual.getRTimestamp()));
        assertFalse(DfTypeUtil.isDateBC(actual.getRTimestamp())); // cannot handle BC date
        assertTrue(df.format(actual.getRTimestamp()).contains("2009/12/25"));
    }
}
