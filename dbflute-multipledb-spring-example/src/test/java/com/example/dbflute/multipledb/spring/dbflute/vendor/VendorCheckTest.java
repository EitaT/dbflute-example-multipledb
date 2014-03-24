package com.example.dbflute.multipledb.spring.dbflute.vendor;

import java.util.List;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.dbway.DBWay;

import com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon.LdDBCurrent;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.cbean.LdBookCB;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exbhv.LdBookBhv;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.exentity.LdBook;
import com.example.dbflute.multipledb.spring.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.6 (2010/03/11 Thursday)
 */
public class VendorCheckTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private LdBookBhv ldBookBhv;

    // ===================================================================================
    //                                                                 LikeSearch WildCard
    //                                                                 ===================
    public void test_LikeSearch_WildCard_DoubleByte_select() {
        // ## Arrange ##
        String keyword = "100％ジュース|和歌山＿テ";
        String expectedBookName = "果汁" + keyword + "スト";
        String dummyBookName = "果汁100パーセントジュース|和歌山Aテスト";

        // escape処理の必要な会員がいなかったので、ここで一時的に登録
        LdBook escapeBook = new LdBook();
        escapeBook.setBookName(expectedBookName);
        escapeBook.setAuthorId(3);
        escapeBook.setMaxLendingDateCount(10);
        escapeBook.setOutOfUserSelectYn_Yes();
        escapeBook.setIsbn("foo");
        escapeBook.setPublisherId(3);
        ldBookBhv.insert(escapeBook);

        // escape処理をしない場合にHITする会員も登録
        LdBook nonEscapeOnlyBook = new LdBook();
        nonEscapeOnlyBook.setBookName(dummyBookName);
        nonEscapeOnlyBook.setAuthorId(3);
        nonEscapeOnlyBook.setMaxLendingDateCount(10);
        nonEscapeOnlyBook.setOutOfUserSelectYn_Yes();
        nonEscapeOnlyBook.setIsbn("bar");
        nonEscapeOnlyBook.setPublisherId(3);
        ldBookBhv.insert(nonEscapeOnlyBook);

        // 一時的に登録した会員が想定しているものかどうかをチェック
        LdBookCB checkCB = new LdBookCB();

        // Check!
        checkCB.query().setBookName_LikeSearch(keyword, new LikeSearchOption().likeContain().notEscape());
        assertEquals("escapeなしでも1件だけHITすること", 1, ldBookBhv.selectList(checkCB).size());

        // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
        LdBookCB cb = new LdBookCB();
        LikeSearchOption option = new LikeSearchOption().likeContain(); // *Point!
        cb.query().setBookName_LikeSearch(keyword, option);
        // - - - - - - - - - -/

        String displaySql = cb.toDisplaySql();
        assertTrue(displaySql.contains("100％ジュース||和歌山＿テ"));

        // ## Act ##
        List<LdBook> bookList = ldBookBhv.selectList(cb);

        // ## Assert ##
        assertNotNull(bookList);
        assertEquals(1, bookList.size()); // escapeしてもHITすること
        LdBook actualMember = bookList.get(0);
        log(actualMember);
        assertEquals(expectedBookName, actualMember.getBookName());
    }

    public void test_LikeSearch_WildCard_variousChar_selectByCB() {
        // ## Arrange ##
        LdBook member = new LdBook();
        member.setBookId(3);
        member.setBookName("fo[v]％c%o");
        ldBookBhv.updateNonstrict(member);
        member.setBookId(4);
        member.setBookName("fo[v]％barc%o");
        ldBookBhv.updateNonstrict(member);
        LdBookCB cb = new LdBookCB();
        cb.query().setBookName_LikeSearch("[v]％c", new LikeSearchOption().likeContain());

        // ## Act ##
        ListResultBean<LdBook> bookList = ldBookBhv.selectList(cb);

        // ## Assert ##
        assertFalse(bookList.isEmpty());
        assertEquals(1, bookList.size());
        assertEquals("fo[v]％c%o", bookList.get(0).getBookName());
        // unused escape char should be ignored
    }

    // *not implemented
    //    public void test_LikeSearch_WildCard_variousChar_selectByPmb() {
    //        // ## Arrange ##
    //        LdBook member = new LdBook();
    //        member.setBookId(3);
    //        member.setBookName("[v]％c%o");
    //        ldBookBhv.updateNonstrict(member);
    //        member.setBookId(4);
    //        member.setBookName("[v]％barc%o");
    //        ldBookBhv.updateNonstrict(member);
    //        SimpleMemberPmb pmb = new SimpleMemberPmb();
    //        pmb.setBookName_PrefixSearch("[v]％c%");
    //
    //        // ## Act ##
    //        ListResultBean<SimpleMember> bookList = ldBookBhv.outsideSql().selectList(pmb);
    //
    //        // ## Assert ##
    //        assertFalse(bookList.isEmpty());
    //        assertEquals(1, bookList.size());
    //        assertEquals("[v]％c%o", bookList.get(0).getBookName());
    //        // unused escape char should be ignored
    //    }

    public void test_LikeSearch_WildCard_variousChar_whiteOption() {
        // ## Arrange ##
        LikeSearchOption option = new LikeSearchOption();
        option.escapeByPipeLine();

        // ## Act & Assert ##
        assertEquals("ABC％CBA", option.generateRealValue("ABC％CBA"));
        assertEquals("ABC＿CBA", option.generateRealValue("ABC＿CBA"));
        assertEquals("ABC％CB|%A", option.generateRealValue("ABC％CB%A"));
        assertEquals("ABC＿CB|_A", option.generateRealValue("ABC＿CB_A"));
        assertEquals("ABC＿C[]B|_A", option.generateRealValue("ABC＿C[]B_A"));

        // ## Arrange ##
        DBWay dbway = LdDBCurrent.getInstance().currentDBDef().dbway();
        option.acceptOriginalWildCardList(dbway.getOriginalWildCardList());

        // ## Act & Assert ##
        assertEquals("ABC％CBA", option.generateRealValue("ABC％CBA"));
        assertEquals("ABC＿CBA", option.generateRealValue("ABC＿CBA"));
        assertEquals("ABC％CB|%A", option.generateRealValue("ABC％CB%A"));
        assertEquals("ABC＿CB|_A", option.generateRealValue("ABC＿CB_A"));
        assertEquals("ABC＿C[]B|_A", option.generateRealValue("ABC＿C[]B_A"));
    }
}
