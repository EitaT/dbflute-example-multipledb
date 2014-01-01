/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package com.example.dbflute.multipledb.seasar.dbflute.librarydb.exentity;

import java.sql.Timestamp;

import com.example.dbflute.multipledb.seasar.dbflute.librarydb.bsentity.LdBsLibrary;

/**
 * The entity of LIBRARY.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class LdLibrary extends LdBsLibrary {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    public static final String ALIAS_userCount = "USER_COUNT";
    public static final String ALIAS_userUpdateDate = "USER_UPDATE_DATE";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected Integer _userCount;
    protected Timestamp _userUpdateDate;

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Integer getUserCount() {
        return _userCount;
    }

    public void setUserCount(Integer userCount) {
        _userCount = userCount;
    }

    public Timestamp getUserUpdateDate() {
        return _userUpdateDate;
    }

    public void setUserUpdateDate(Timestamp userUpdateDate) {
        this._userUpdateDate = userUpdateDate;
    }
}
