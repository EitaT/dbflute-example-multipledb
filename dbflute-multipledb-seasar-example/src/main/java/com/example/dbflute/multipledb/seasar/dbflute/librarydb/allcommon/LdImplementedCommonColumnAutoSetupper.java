/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.bhv.core.CommonColumnAutoSetupper;

/**
 * The basic implementation of the auto set-upper of common column.
 * @author DBFlute(AutoGenerator)
 */
public class LdImplementedCommonColumnAutoSetupper implements CommonColumnAutoSetupper {

    // =====================================================================================
    //                                                                            Definition
    //                                                                            ==========
    /** Log instance. */
    private static final Log _log = LogFactory.getLog(LdImplementedCommonColumnAutoSetupper.class);

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** The property of appDateProvider. */
    protected com.example.dbflute.multipledb.seasar.common.AppDateProvider _appDateProvider;

    /**
     * @return The value of appDateProvider.
     */
    public com.example.dbflute.multipledb.seasar.common.AppDateProvider getAppDateProvider() {
        return _appDateProvider;
    }

    /**
     * @param appDateProvider The value of appDateProvider.
     */
    public void setAppDateProvider(com.example.dbflute.multipledb.seasar.common.AppDateProvider appDateProvider) {
        this._appDateProvider = appDateProvider;
    }

    // =====================================================================================
    //                                                                                Set up
    //                                                                                ======
    /**
     * {@inheritDoc}
     */
    public void handleCommonColumnOfInsertIfNeeds(Entity targetEntity) {
        final LdEntityDefinedCommonColumn entity = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "INSERT");
        }

        final String rUser = entity.getTableDbName() + "-" + org.seasar.dbflute.AccessContext.getAccessUserOnThread();
        entity.setRUser(rUser);

        entity.setRModule_Online();

        final java.sql.Timestamp rTimestamp = _appDateProvider.currentTimestamp();
        entity.setRTimestamp(rTimestamp);

        final String uUser = entity.getRUser();
        entity.setUUser(uUser);

        entity.setUModule_Online();
    }

    /**
     * {@inheritDoc}
     */
    public void handleCommonColumnOfUpdateIfNeeds(Entity targetEntity) {
        final LdEntityDefinedCommonColumn entity = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "UPDATE");
        }

        final String uUser = org.seasar.dbflute.AccessContext.getAccessUserOnThread();
        entity.setUUser(uUser);

        entity.setUModule_Batch();
    }

    // =====================================================================================
    //                                                                         Assist Helper
    //                                                                         =============
    protected LdEntityDefinedCommonColumn askIfEntitySetup(Entity targetEntity) {
        if (!hasCommonColumn(targetEntity)) {
            return null;
        }
        final LdEntityDefinedCommonColumn entity = downcastEntity(targetEntity);
        if (!canCommonColumnAutoSetup(entity)) {
            return null;
        }
        return entity;
    }

    protected boolean hasCommonColumn(Entity targetEntity) {
        return targetEntity instanceof LdEntityDefinedCommonColumn;
    }

    protected boolean canCommonColumnAutoSetup(LdEntityDefinedCommonColumn entity) {
        return entity.canCommonColumnAutoSetup();
    }

    protected LdEntityDefinedCommonColumn downcastEntity(Entity targetEntity) {
        return (LdEntityDefinedCommonColumn)targetEntity;
    }

    // =====================================================================================
    //                                                                               Logging
    //                                                                               =======
    protected boolean isInternalDebugEnabled() {
        return LdDBFluteConfig.getInstance().isInternalDebug() && _log.isDebugEnabled();
    }

    protected void logSettingUp(LdEntityDefinedCommonColumn entity, String keyword) {
        _log.debug("...Setting up column columns of " + entity.getTableDbName() + " before " + keyword);
    }
}
