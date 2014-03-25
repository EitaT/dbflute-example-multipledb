package com.example.dbflute.multipledb.seasar.dbflute.whitebox;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.cbean.ScalarQuery;
import org.seasar.dbflute.cbean.UnionQuery;

import com.example.dbflute.multipledb.seasar.dbflute.librarydb.cbean.LdGarbageCB;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdGarbageBhv;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdGarbage;
import com.example.dbflute.multipledb.seasar.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxNoPrimaryKeyBasicTest extends UnitContainerTestCase {
    
    protected LdGarbageBhv ldGarbageBhv;

    public void test_insert_Basic() {
        // ## Arrange ##
        LdGarbage entity = new LdGarbage();
        entity.setGarbageMemo("Test Insert");
        entity.setGarbageTime(new Timestamp(System.currentTimeMillis()));

        // ## Act ##
        ldGarbageBhv.insert(entity);

        // ## Assert ##
        LdGarbageCB cb = new LdGarbageCB();
        cb.query().setGarbageMemo_Equal("Test Insert");
        LdGarbage actualEntity = ldGarbageBhv.selectEntity(cb);
        assertNotNull(actualEntity);
        assertEquals(entity.getGarbageMemo(), actualEntity.getGarbageMemo());
        assertNotNull(actualEntity.getGarbageTime());
    }

    public void test_insert_NullInsert_with_BehaviorFilter() {
        // ## Arrange ##
        LdGarbage entity = new LdGarbage();
        entity.setGarbageCount(999999999);

        // ## Act ##
        ldGarbageBhv.insert(entity);

        // ## Assert ##
        LdGarbageCB cb = new LdGarbageCB();
        cb.query().setGarbageCount_Equal(999999999);
        LdGarbage actualEntity = ldGarbageBhv.selectEntity(cb);
        assertNotNull(actualEntity);
        assertNull(actualEntity.getGarbageMemo());
        assertNotNull(actualEntity.getGarbageTime()); // for BehaviorFilter
        assertEquals(entity.getGarbageCount(), actualEntity.getGarbageCount());
        assertNotNull(actualEntity.getRUser()); // for BehaviorFilter
        assertNotNull(actualEntity.getRTimestamp()); // for BehaviorFilter
        assertNull(actualEntity.getUUser());
        assertNull(actualEntity.getUTimestamp());
    }

    public void test_scalarSelect_max() {
        // ## Arrange ##
        List<LdGarbage> testDataList = registerTestData();

        // ## Act ##
        Timestamp max = ldGarbageBhv.scalarSelect(Timestamp.class).max(new ScalarQuery<LdGarbageCB>() {
            public void query(LdGarbageCB cb) {
                cb.specify().columnGarbageTime();
            }
        });

        // ## Assert ##
        Timestamp expected = null;
        for (LdGarbage garbage : testDataList) {
            Timestamp garbageTime = garbage.getGarbageTime();
            if (expected == null || expected.getTime() < garbageTime.getTime()) {
                expected = garbageTime;
            }
        }
        log("max = " + max);
        assertEquals(expected, max);
    }

    public void test_scalarSelect_max_union() {
        // ## Arrange ##
        List<LdGarbage> testDataList = registerTestData();

        // ## Act ##
        Timestamp max = ldGarbageBhv.scalarSelect(Timestamp.class).max(new ScalarQuery<LdGarbageCB>() {
            public void query(LdGarbageCB cb) {
                cb.specify().columnGarbageTime();
                cb.union(new UnionQuery<LdGarbageCB>() {
                    public void query(LdGarbageCB unionCB) {
                    }
                });
            }
        });

        // ## Assert ##
        Timestamp expected = null;
        for (LdGarbage garbage : testDataList) {
            Timestamp garbageTime = garbage.getGarbageTime();
            if (expected == null || expected.getTime() < garbageTime.getTime()) {
                expected = garbageTime;
            }
        }
        log("max = " + max);
    }

    public void test_scalarSelect_sum_union() {
        // ## Arrange ##
        List<LdGarbage> testDataList = registerTestData();

        // ## Act ##
        Integer sum = ldGarbageBhv.scalarSelect(Integer.class).sum(new ScalarQuery<LdGarbageCB>() {
            public void query(LdGarbageCB cb) {
                cb.specify().columnGarbageCount();
                cb.union(new UnionQuery<LdGarbageCB>() {
                    public void query(LdGarbageCB unionCB) {
                    }
                });
            }
        });

        // ## Assert ##
        Integer expected = 0;
        for (LdGarbage garbage : testDataList) {
            Integer garbageCount = garbage.getGarbageCount();
            expected = expected + garbageCount;
        }
        log("sum = " + sum);
    }

    protected List<LdGarbage> registerTestData() {
        ArrayList<LdGarbage> list = new ArrayList<LdGarbage>();
        {
            LdGarbage garbage = new LdGarbage();
            garbage.setGarbageMemo("1-Test Insert");
            garbage.setGarbageTime(Timestamp.valueOf("2007-12-25 12:34:56.147"));
            garbage.setGarbageCount(7);
            ldGarbageBhv.insert(garbage);
            list.add(garbage);
        }
        {
            LdGarbage garbage = new LdGarbage();
            garbage.setGarbageMemo("2-Test Insert");
            garbage.setGarbageTime(Timestamp.valueOf("2002-12-25 12:34:56.147"));
            garbage.setGarbageCount(4);
            ldGarbageBhv.insert(garbage);
            list.add(garbage);
        }
        {
            LdGarbage garbage = new LdGarbage();
            garbage.setGarbageMemo("3-Test Insert");
            garbage.setGarbageTime(Timestamp.valueOf("2004-12-25 12:34:56.147"));
            garbage.setGarbageCount(4);
            ldGarbageBhv.insert(garbage);
            list.add(garbage);
        }
        return list;
    }
}
