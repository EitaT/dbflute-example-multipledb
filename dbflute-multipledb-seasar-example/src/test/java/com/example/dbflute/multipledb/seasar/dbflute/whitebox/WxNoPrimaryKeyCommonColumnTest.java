package com.example.dbflute.multipledb.seasar.dbflute.whitebox;

import com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon.LdEntityDefinedCommonColumn;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exbhv.LdGarbageBhv;
import com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity.LdGarbagePlus;
import com.example.dbflute.multipledb.seasar.unit.ContainerTestCase;

/**
 * @author jflute
 */
public class WxNoPrimaryKeyCommonColumnTest extends ContainerTestCase {

    protected LdGarbageBhv ldGarbageBhv;
    
    public void test_insert_Basic() {
        LdGarbagePlus entity = new LdGarbagePlus();
        assertFalse(entity instanceof LdEntityDefinedCommonColumn);
    }
}
