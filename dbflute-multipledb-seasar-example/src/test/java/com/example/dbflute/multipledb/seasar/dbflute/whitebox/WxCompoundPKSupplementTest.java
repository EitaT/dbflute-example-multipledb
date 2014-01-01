package com.example.dbflute.multipledb.seasar.dbflute.whitebox;

import java.math.BigDecimal;
import java.util.List;

import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;

import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdLendingCB;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdLendingCollectionCB;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdLibraryCB;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdLibraryUserCB;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdNextLibraryCB;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdLendingBhv;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdLibraryBhv;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdLibraryUserBhv;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdNextLibraryBhv;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdBook;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdLending;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdLendingCollection;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdLibrary;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdLibraryUser;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdNextLibrary;
import com.example.dbflute.multipledb.seasar.unit.ContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5.1 (2009/06/01 Thursday)
 */
public class WxCompoundPKSupplementTest extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private LdLibraryBhv ldLibraryBhv;
    private LdLibraryUserBhv ldLibraryUserBhv;
    private LdNextLibraryBhv ldNextLibraryBhv;
    private LdLendingBhv ldLendingBhv;

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    public void test_PK_Abstraction_acceptPrimaryKey_basic() {
        // ## Arrange ##
        LdLending existing;
        {
            LdLendingCB lendingCB = new LdLendingCB();
            lendingCB.fetchFirst(1);
            existing = ldLendingBhv.selectEntityWithDeletedCheck(lendingCB);
        }
        LdLendingCB cb = new LdLendingCB();
        cb.acceptPrimaryKey(existing.getLibraryId(), existing.getLbUserId(), existing.getLendingDate());

        // ## Act ##
        LdLending actual = ldLendingBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(existing, actual);
    }

    // -----------------------------------------------------
    //                                        ExistsReferrer
    //                                        --------------
    public void test_ExistsReferrer_referrerOnlyCompoundPK() {
        // ## Arrange ##
        final LdLibraryUser user;
        {
            LdLibraryUserCB cb = new LdLibraryUserCB();
            cb.setupSelect_Library();
            cb.fetchFirst(1);
            user = ldLibraryUserBhv.selectEntityWithDeletedCheck(cb);
        }
        LdLibraryCB cb = new LdLibraryCB();
        cb.query().existsLibraryUserList(new SubQuery<LdLibraryUserCB>() {
            public void query(LdLibraryUserCB subCB) {
                subCB.query().setLbUserId_Equal(user.getLbUserId());
            }
        });

        // ## Act ##
        ListResultBean<LdLibrary> libraryList = ldLibraryBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, libraryList.size());
        boolean exists = false;
        for (LdLibrary library : libraryList) {
            log(library);
            if (user.getLibraryId().equals(library.getLibraryId())) {
                exists = true;
            }
        }
        assertTrue(exists);
    }

    // -----------------------------------------------------
    //                                       DerivedReferrer
    //                                       ---------------
    public void test_SpecifyDerivedReferrer_referrerOnlyCompoundPK_basic() {
        // ## Arrange ##
        LdLibraryCB cb = new LdLibraryCB();

        cb.specify().derivedLibraryUserList().count(new SubQuery<LdLibraryUserCB>() {
            public void query(LdLibraryUserCB subCB) {
                subCB.specify().columnLbUserId();
            }
        }, LdLibrary.ALIAS_userCount);

        // ## Act ##
        ListResultBean<LdLibrary> libraryList = ldLibraryBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, libraryList.size());
        boolean exists = false;
        for (LdLibrary library : libraryList) {
            log(library.getLibraryName() + ", " + library.getUserCount());
            if (library.getUserCount() > 0) {
                exists = true;
            }
        }
        assertTrue(exists);
    }

    public void test_SpecifyDerivedReferrer_referrerOnlyCompoundPK_with_union_specifiedNonPK() {
        // ## Arrange ##
        LdLibraryCB cb = new LdLibraryCB();
        cb.specify().derivedLibraryUserList().max(new SubQuery<LdLibraryUserCB>() {
            public void query(LdLibraryUserCB subCB) {
                subCB.specify().columnUTimestamp();
                subCB.query().setLbUserId_LessThan(3);
                subCB.union(new UnionQuery<LdLibraryUserCB>() {
                    public void query(LdLibraryUserCB unionCB) {
                        unionCB.query().setLbUserId_GreaterThan(1);
                    }
                });
            }
        }, LdLibrary.ALIAS_userUpdateDate);

        // ## Act ##
        ListResultBean<LdLibrary> libraryList = ldLibraryBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, libraryList.size());
        boolean exists = false;
        for (LdLibrary library : libraryList) {
            log(library.getLibraryName() + ", " + library.getUserUpdateDate());
            if (library.getUserUpdateDate() != null) {
                exists = true;
            }
        }
        assertTrue(exists);
    }

    public void test_SpecifyDerivedReferrer_referrerOnlyCompoundPK_with_union_specifiedPK() {
        // ## Arrange ##
        LdLibraryCB cb = new LdLibraryCB();
        cb.specify().derivedLibraryUserList().count(new SubQuery<LdLibraryUserCB>() {
            public void query(LdLibraryUserCB subCB) {
                subCB.specify().columnLbUserId();
                subCB.query().setLbUserId_LessThan(3);
                subCB.union(new UnionQuery<LdLibraryUserCB>() {
                    public void query(LdLibraryUserCB unionCB) {
                        unionCB.query().setLbUserId_GreaterThan(1);
                    }
                });
            }
        }, LdLibrary.ALIAS_userCount);

        // ## Act ##
        ListResultBean<LdLibrary> libraryList = ldLibraryBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, libraryList.size());
        boolean exists = false;
        for (LdLibrary library : libraryList) {
            log(library.getLibraryName() + ", " + library.getUserCount());
            if (library.getUserCount() > 0) {
                exists = true;
            }
        }
        assertTrue(exists);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    public void test_LoadReferrer_basic() {
        // ## Arrange ##
        LdLendingCB cb = new LdLendingCB();
        cb.setupSelect_LibraryUser().withLibrary();
        cb.setupSelect_LibraryUser().withLbUser();
        ListResultBean<LdLending> lendingList = ldLendingBhv.selectList(cb);

        // ## Act ##
        ldLendingBhv.loadLendingCollectionList(lendingList, new ConditionBeanSetupper<LdLendingCollectionCB>() {
            public void setup(LdLendingCollectionCB cb) {
                cb.setupSelect_Collection().withBook();
                cb.query().setLendingDate_LessEqual(currentTimestamp());
                cb.query().addOrderBy_LibraryId_Asc().addOrderBy_LbUserId_Asc().addOrderBy_LendingDate_Asc();
            }
        });

        // ## Assert ##
        assertNotSame(0, lendingList.size());
        for (LdLending actual : lendingList) {
            String libraryName = actual.getLibraryUser().getLibrary().getLibraryName();
            String userName = actual.getLibraryUser().getLbUser().getLbUserName();
            log("[" + libraryName + ", " + userName + ", " + actual.getLendingDate() + "]");
            List<LdLendingCollection> lendingCollectionList = actual.getLendingCollectionList();
            assertNotSame(0, lendingCollectionList.size());
            for (LdLendingCollection lendingCollection : lendingCollectionList) {
                LdBook book = lendingCollection.getCollection().getBook();
                String bookName = book.getBookName();
                log("    o " + bookName + ", " + book.getOpeningPart());
            }
        }
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    public void test_queryUpdate_simpleCondition() {
        // ## Arrange ##
        LdNextLibraryCB cb = new LdNextLibraryCB();
        cb.query().setLibraryId_Equal(1);
        LdNextLibrary nextLibrary = new LdNextLibrary();
        BigDecimal distanceKm = new BigDecimal("99.99");
        nextLibrary.setDistanceKm(distanceKm);

        // ## Act ##
        ldNextLibraryBhv.queryUpdate(nextLibrary, cb);

        // ## Assert ##
        ListResultBean<LdNextLibrary> nextLibraryList = ldNextLibraryBhv.selectList(cb);
        for (LdNextLibrary actual : nextLibraryList) {
            log(actual);
            assertEquals(distanceKm, actual.getDistanceKm());
        }
    }

    public void test_queryUpdate_complexCondition_outerJoin() {
        // ## Arrange ##
        LdNextLibraryCB cb = new LdNextLibraryCB();
        cb.query().queryLibraryByLibraryId().setLibraryId_Equal(1);
        LdNextLibrary nextLibrary = new LdNextLibrary();
        BigDecimal distanceKm = new BigDecimal("99.99");
        nextLibrary.setDistanceKm(distanceKm);

        // ## Act ##
        try {
            ldNextLibraryBhv.queryUpdate(nextLibrary, cb);

            // ## Assert ##
            fail();
        } catch (IllegalConditionBeanOperationException e) {
            // OK
            log(getLineSeparator() + e.getMessage());
        }
    }

    public void test_queryUpdate_complexCondition_union() {
        // ## Arrange ##
        LdNextLibraryCB cb = new LdNextLibraryCB();
        cb.query().setLibraryId_GreaterEqual(3);
        cb.union(new UnionQuery<LdNextLibraryCB>() {
            public void query(LdNextLibraryCB unionCB) {
                unionCB.query().setLibraryId_GreaterEqual(3);
            }
        });
        LdNextLibrary nextLibrary = new LdNextLibrary();
        BigDecimal distanceKm = new BigDecimal("99.99");
        nextLibrary.setDistanceKm(distanceKm);

        // ## Act ##
        try {
            ldNextLibraryBhv.queryUpdate(nextLibrary, cb);

            // ## Assert ##
            fail();
        } catch (IllegalConditionBeanOperationException e) {
            // OK
            log(getLineSeparator() + e.getMessage());
        }
    }

    // -----------------------------------------------------
    //                                          Query Delete
    //                                          ------------
    public void test_queryDelete_simpleCondition() {
        // ## Arrange ##
        LdNextLibraryCB cb = new LdNextLibraryCB();
        cb.query().setLibraryId_Equal(1);

        // ## Act ##
        ldNextLibraryBhv.queryDelete(cb);

        // ## Assert ##
        ListResultBean<LdNextLibrary> nextLibraryList = ldNextLibraryBhv.selectList(cb);
        assertEquals(0, nextLibraryList.size());
    }

    public void test_queryDelete_complexCondition_outerJoin() {
        // ## Arrange ##
        LdNextLibraryCB cb = new LdNextLibraryCB();
        cb.query().queryLibraryByLibraryId().setLibraryId_Equal(1);

        // ## Act ##
        try {
            ldNextLibraryBhv.queryDelete(cb);

            // ## Assert ##
            fail();
        } catch (IllegalConditionBeanOperationException e) {
            // OK
            log(getLineSeparator() + e.getMessage());
        }
    }

    public void test_queryDelete_complexCondition_union() {
        // ## Arrange ##
        LdNextLibraryCB cb = new LdNextLibraryCB();
        cb.query().setLibraryId_GreaterEqual(3);
        cb.union(new UnionQuery<LdNextLibraryCB>() {
            public void query(LdNextLibraryCB unionCB) {
                unionCB.query().setLibraryId_GreaterEqual(3);
            }
        });

        // ## Act ##
        try {
            ldNextLibraryBhv.queryDelete(cb);
            // ## Assert ##
            fail();
        } catch (IllegalConditionBeanOperationException e) {
            // OK
            log(getLineSeparator() + e.getMessage());
        }
    }
}
