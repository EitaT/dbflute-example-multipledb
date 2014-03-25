package com.example.dbflute.multipledb.seasar.dbflute.whitebox;

import org.seasar.dbflute.exception.EntityAlreadyUpdatedException;

import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdBookBhv;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdBook;
import com.example.dbflute.multipledb.seasar.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxUpdateDateExclusiveControlTest extends UnitContainerTestCase {

    protected LdBookBhv ldBookBhv;

    public void test_update_exclusiveControl_by_updateDate_basic() throws Exception {
        // ## Arrange ##
        LdBook book1 = ldBookBhv.selectByPKValueWithDeletedCheck(3);
        Thread.sleep(300);
        LdBook book2 = ldBookBhv.selectByPKValueWithDeletedCheck(3);
        book1.setBookName("Test1");
        book2.setBookName("Test2");

        // ## Act ##
        ldBookBhv.update(book1);
        Thread.sleep(300);
        try {
            ldBookBhv.update(book2);

            // ## Assert ##
            fail();
        } catch (EntityAlreadyUpdatedException e) {
            // OK
            log(e.getMessage());
        }
    }
}
