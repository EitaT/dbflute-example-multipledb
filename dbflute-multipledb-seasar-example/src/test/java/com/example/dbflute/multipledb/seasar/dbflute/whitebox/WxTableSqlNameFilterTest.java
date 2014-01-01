package com.example.dbflute.multipledb.seasar.dbflute.whitebox;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.util.Srl;

import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.MbMemberCB;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.cbean.MbPurchaseCB;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.MbMemberBhv;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exentity.MbMember;
import com.example.dbflute.multipledb.seasar.unit.ContainerTestCase;

/**
 * @author jflute
 */
public class WxTableSqlNameFilterTest extends ContainerTestCase {

    protected MbMemberBhv mbMemberBhv;

    public void test_SetupSelect_basic() {
        // ## Arrange ##
        MbMemberCB cb = new MbMemberCB();
        cb.setupSelect_MemberStatus();

        // ## Act ##
        ListResultBean<MbMember> memberList = mbMemberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        String sql = cb.toDisplaySql();
        assertTrue(Srl.containsAll(sql, "PUBLIC.MEMBER", "PUBLIC.MEMBER_STATUS"));
    }

    public void test_ExistsReferrer_basic() {
        // ## Arrange ##
        MbMemberCB cb = new MbMemberCB();
        cb.setupSelect_MemberStatus();
        cb.query().existsPurchaseList(new SubQuery<MbPurchaseCB>() {
            public void query(MbPurchaseCB subCB) {
            }
        });

        // ## Act ##
        ListResultBean<MbMember> memberList = mbMemberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        String sql = cb.toDisplaySql();
        assertTrue(Srl.containsAll(sql, "PUBLIC.MEMBER", "PUBLIC.PURCHASE"));
    }

    public void test_insert_basic() {
        // ## Arrange ##
        MbMember member = new MbMember();
        member.setMemberName("foo");
        member.setMemberAccount("foo");
        member.setMemberStatusCode_Formalized();

        // ## Act ##
        mbMemberBhv.insert(member); // expect no exception

        // ## Assert ##
        assertNotNull(member.getMemberId());
    }

    public void test_queryUpdate_basic() {
        // ## Arrange ##
        MbMember member = new MbMember();
        member.setBirthdate(currentTimestamp());
        MbMemberCB cb = new MbMemberCB();
        cb.query().existsPurchaseList(new SubQuery<MbPurchaseCB>() {
            public void query(MbPurchaseCB subCB) {
            }
        });

        // ## Act ##
        int updated = mbMemberBhv.queryUpdate(member, cb); // expect no exception

        // ## Assert ##
        assertNotSame(0, updated);
    }
}
