package com.example.dbflute.multipledb.seasar.common;

import java.sql.Timestamp;

public class AppDateProvider {

    public Timestamp currentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }
}
