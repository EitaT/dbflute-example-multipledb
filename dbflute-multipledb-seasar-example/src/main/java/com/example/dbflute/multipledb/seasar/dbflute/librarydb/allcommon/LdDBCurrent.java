/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.dbflute.DBDef;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdDBCurrent {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private static final Log _log = LogFactory.getLog(LdDBCurrent.class);

    /** Singleton instance. */
    private static final LdDBCurrent _instance = new LdDBCurrent();

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DBDef _currentDBDef;
    {
        _currentDBDef = DBDef.codeOf("derby");
        if (_currentDBDef == null) {
            _currentDBDef = DBDef.Unknown;
        }
    }
	
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     */
    private LdDBCurrent() {
    }

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    /**
     * Get singleton instance.
     * @return Singleton instance. (NotNull)
     */
    public static LdDBCurrent getInstance() {
        return _instance;
    }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public void initializeCurrentDBDef(DBDef currentDBDef) {
	    if (_log.isInfoEnabled()) {
		    _log.info("...Setting currentDBDef: " + currentDBDef);
		}
		if (currentDBDef == null) {
		    String msg = "The argument 'currentDBDef' should not be null!";
		    throw new IllegalArgumentException(msg);
		}
        _currentDBDef = currentDBDef;
    }

    public DBDef currentDBDef() {
        return _currentDBDef;
    }

    public boolean isCurrentDBDef(DBDef currentDBDef) {
	    return _currentDBDef.equals(currentDBDef);
    }
}
