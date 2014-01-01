package com.example.dbflute.multipledb.seasar.dbflute.howto;

import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;

import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdCDef;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdAuthorCB;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdBookCB;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdLendingCollectionCB;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdMyselfCB;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdMyselfCheckCB;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdAuthorBhv;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdBookBhv;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdLendingCollectionBhv;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdMyselfCheckBhv;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.pmbean.LdBookStatisticPmb;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdAuthor;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdBook;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.customize.LdBookStatistic;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.MbMemberCB;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.MbMemberBhv;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.pmbean.MbSimpleMemberPmb;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.MbMember;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.customize.MbSimpleMember;
import com.example.dbflute.multipledb.seasar.unit.ContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5.1 (2009/06/01 Thursday)
 */
public class MultipleDbTest extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MbMemberBhv mbMemberBhv;
    private LdBookBhv ldBookBhv;
    private LdAuthorBhv ldAuthorBhv;
    private LdLendingCollectionBhv ldLendingCollectionBhv;
    private LdMyselfCheckBhv ldMyselfCheckBhv;

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    public void test_selectList_libraryDb() {
        // ## Arrange ##
        LdBookCB cb = new LdBookCB();
        cb.query().setBookName_PrefixSearch("S");
        cb.query().addOrderBy_BookId_Asc();

        // ## Act ##
        ListResultBean<LdBook> bookList = ldBookBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, bookList.size());
        for (LdBook book : bookList) {
            log(book.toString());
            assertTrue(book.getBookName().startsWith("S"));
        }
    }

    public void test_selectList_memberDb() {
        // ## Arrange ##
        MbMemberCB cb = new MbMemberCB();
        cb.query().setMemberName_PrefixSearch("S");
        cb.query().addOrderBy_MemberId_Asc();

        // ## Act ##
        ListResultBean<MbMember> memberList = mbMemberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (MbMember member : memberList) {
            log(member.toString());
            assertTrue(member.getMemberName().startsWith("S"));
        }
    }

    public void test_selectList_libraryDb_and_memberDb() {
        // ## Arrange ##
        LdBookCB bookCB = new LdBookCB();
        bookCB.query().setBookName_PrefixSearch("S");
        bookCB.query().addOrderBy_BookId_Asc();

        MbMemberCB memberCB = new MbMemberCB();
        memberCB.query().setMemberName_PrefixSearch("S");
        memberCB.query().addOrderBy_MemberId_Asc();

        // ## Act ##
        ListResultBean<LdBook> bookList = ldBookBhv.selectList(bookCB);
        ListResultBean<MbMember> memberList = mbMemberBhv.selectList(memberCB);

        // ## Assert ##
        assertNotSame(0, bookList.size());
        for (LdBook book : bookList) {
            log(book.toString());
            assertTrue(book.getBookName().startsWith("S"));
        }
        assertNotSame(0, memberList.size());
        for (MbMember member : memberList) {
            log(member.toString());
            assertTrue(member.getMemberName().startsWith("S"));
        }
    }

    public void test_multiplePrimaryKey() {
        LdLendingCollectionCB cb = new LdLendingCollectionCB();
        cb.setupSelect_Collection().withBook();
        cb.setupSelect_LibraryUser();
        ldLendingCollectionBhv.selectList(cb); // Expect no exception!
    }

    public void test_manualOrder() {
        LdMyselfCheckCB cb = new LdMyselfCheckCB();
        List<Integer> idList = new ArrayList<Integer>();
        idList.add(2);
        idList.add(5);
        cb.query().addOrderBy_MyselfCheckId_Desc().withManualOrder(idList);
        ldMyselfCheckBhv.selectList(cb); // Expect no exception!
    }

    public void test_inScopeSelfSubQuery() {
        LdMyselfCheckCB cb = new LdMyselfCheckCB();
        cb.query().inScopeMyself(new SubQuery<LdMyselfCB>() {
            public void query(LdMyselfCB subCB) {
            }
        });
        cb.query().myselfInScope(new SubQuery<LdMyselfCheckCB>() {
            public void query(LdMyselfCheckCB subCB) {
            }
        });
        ldMyselfCheckBhv.selectList(cb); // Expect no exception!
    }

    public void test_prefixSearch_autoEscape() {
        // ## Arrange ##
        LdAuthor author = new LdAuthor();
        author.setAuthorName("test|AutoEscape");
        author.setAuthorAge(14);
        ldAuthorBhv.insert(author);
        LdAuthorCB cb = new LdAuthorCB();
        cb.query().setAuthorName_PrefixSearch("test|Auto");

        // ## Act ##
        ListResultBean<LdAuthor> authorList = ldAuthorBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, authorList.size());
        for (LdAuthor actual : authorList) {
            assertTrue(actual.getAuthorName().startsWith("test|Auto"));
        }
    }

    public void test_likeSearch_autoEscape() {
        // ## Arrange ##
        LdAuthor author = new LdAuthor();
        author.setAuthorName("test|AutoEscape");
        author.setAuthorAge(14);
        ldAuthorBhv.insert(author);
        LdAuthorCB cb = new LdAuthorCB();
        cb.query().setAuthorName_LikeSearch("test|Auto", new LikeSearchOption().likePrefix());

        // ## Act ##
        ListResultBean<LdAuthor> authorList = ldAuthorBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, authorList.size());
        for (LdAuthor actual : authorList) {
            assertTrue(actual.getAuthorName().startsWith("test|Auto"));
        }
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    public void test_selectPage_libraryDb() { // test for paging on Apache Derby
        // ## Arrange ##
        LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.query().addOrderBy_BookId_Asc();
        cb.paging(2, 3);

        // ## Act ##
        PagingResultBean<LdBook> page = ldBookBhv.selectPage(cb);

        // ## Assert ##
        assertNotSame(0, page.size());
        assertEquals(2, page.size());
        assertEquals(Integer.valueOf(5), page.get(0).getBookId());
        assertEquals(Integer.valueOf(6), page.get(1).getBookId());
        for (LdBook book : page) {
            assertNotNull(book.getAuthor());
            log(book.toString());
        }
    }

    // ===================================================================================
    //                                                                       Fetch Setting
    //                                                                       =============
    public void test_selectPage_fetchFirst() { // test for fetch setting on Apache Derby
        // ## Arrange ##
        LdBookCB cb = new LdBookCB();
        cb.query().addOrderBy_BookId_Asc();
        cb.fetchFirst(1);

        // ## Act ##
        LdBook book = ldBookBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        log(book.toString());
        assertNotSame(1, book.getBookId());
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    public void test_insert_libraryDb() {
        // ## Arrange ##
        LdAuthor author = new LdAuthor();
        author.setAuthorName("InsertTest");
        author.setAuthorAge(14);

        // ## Act ##
        ldAuthorBhv.insert(author);

        // ## Assert ##
        {
            LdAuthorCB cb = new LdAuthorCB();
            cb.query().setAuthorName_Equal("InsertTest");
            LdAuthor actual = ldAuthorBhv.selectEntityWithDeletedCheck(cb);
            assertEquals("InsertTest", actual.getAuthorName());
        }

        // ## Act ##
        author.setAuthorName("UpdateTest");
        ldAuthorBhv.update(author);

        // ## Assert ##
        {
            LdAuthorCB cb = new LdAuthorCB();
            cb.query().setAuthorName_Equal("UpdateTest");
            LdAuthor actual = ldAuthorBhv.selectEntityWithDeletedCheck(cb);
            assertEquals("UpdateTest", actual.getAuthorName());
        }
    }

    public void test_updateNonstrict_libraryDb_and_memberDb() {
        // ## Arrange ##
        LdBookCB bookCB = new LdBookCB();
        bookCB.query().setBookId_Equal(3);
        LdBook book = ldBookBhv.selectEntityWithDeletedCheck(bookCB);
        assertNotSame("book-update-test", book.getBookName());
        book.setBookName("book-update-test");

        MbMemberCB memberCB = new MbMemberCB();
        memberCB.query().setMemberId_Equal(3);
        MbMember member = mbMemberBhv.selectEntityWithDeletedCheck(memberCB);
        assertNotSame("member-update-test", member.getMemberName());
        member.setMemberName("member-update-test");

        // ## Act ##
        ldBookBhv.updateNonstrict(book);
        mbMemberBhv.updateNonstrict(member);

        // ## Assert ##
        LdBook actualBook = ldBookBhv.selectEntityWithDeletedCheck(bookCB);
        assertEquals("book-update-test", actualBook.getBookName());
        MbMember actualMember = mbMemberBhv.selectEntityWithDeletedCheck(memberCB);
        assertEquals("member-update-test", actualMember.getMemberName());
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    // -----------------------------------------------------
    //                                                  List
    //                                                  ----
    public void test_outsideSql_selectList_selectSimpleMember() {
        // ## Arrange ##
        MbSimpleMemberPmb pmb = new MbSimpleMemberPmb();
        pmb.setMemberName("S");

        // ## Act ##ß
        List<MbSimpleMember> memberList = mbMemberBhv.outsideSql().selectList(pmb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        log("{SimpleMember}");
        for (MbSimpleMember entity : memberList) {
            Integer memberId = entity.getMemberId();
            String memberName = entity.getMemberName();
            String memberStatusName = entity.getMemberStatusName();
            log("    " + memberId + ", " + memberName + ", " + memberStatusName);
            assertNotNull(memberId);
            assertNotNull(memberName);
            assertNotNull(memberStatusName);
            assertTrue(memberName.startsWith("S"));
        }
    }

    public void test_outsideSql_selectList_selectBookStatistic() {
        // ## Arrange ##
        LdBookStatisticPmb pmb = new LdBookStatisticPmb();
        pmb.setBookName("S");

        // ## Act ##ß
        List<LdBookStatistic> bookList = ldBookBhv.outsideSql().selectList(pmb);

        // ## Assert ##
        assertNotSame(0, bookList.size());
        log("{BookStatistic}");
        for (LdBookStatistic entity : bookList) {
            Integer bookId = entity.getBookId();
            String bookName = entity.getBookName();
            LdCDef.YesNo outOfUserSelectYn = entity.getOutOfUserSelectYnAsYesNo();
            log("    " + bookId + ", " + bookName + ", " + outOfUserSelectYn);
            assertNotNull(bookId);
            assertNotNull(bookName);
            assertNotNull(outOfUserSelectYn);
            assertTrue(bookName.startsWith("S"));
        }
    }
}
