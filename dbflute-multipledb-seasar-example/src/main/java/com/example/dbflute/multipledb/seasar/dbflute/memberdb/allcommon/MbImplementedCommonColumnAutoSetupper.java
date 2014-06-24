package com.example.dbflute.multipledb.seasar.dbflute.memberdb.allcommon;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.bhv.core.CommonColumnAutoSetupper;

/**
 * The basic implementation of the auto set-upper of common column.
 * @author DBFlute(AutoGenerator)
 */
public class MbImplementedCommonColumnAutoSetupper implements CommonColumnAutoSetupper {

    // =====================================================================================
    //                                                                            Definition
    //                                                                            ==========
    /** Log instance. */
    private static final Log _log = LogFactory.getLog(MbImplementedCommonColumnAutoSetupper.class);

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    // =====================================================================================
    //                                                                                Set up
    //                                                                                ======
    /**
     * {@inheritDoc}
     */
    public void handleCommonColumnOfInsertIfNeeds(Entity targetEntity) {
        final MbEntityDefinedCommonColumn entity = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "INSERT");
        }
        doHandleCommonColumnOfInsertIfNeeds(entity);
    }

    protected void doHandleCommonColumnOfInsertIfNeeds(MbEntityDefinedCommonColumn entity) {
        final java.sql.Timestamp registerDatetime = org.seasar.dbflute.AccessContext.getAccessTimestampOnThread();
        entity.setRegisterDatetime(registerDatetime);
        final String registerUser = org.seasar.dbflute.AccessContext.getAccessUserOnThread();
        entity.setRegisterUser(registerUser);
        final java.sql.Timestamp updateDatetime = entity.getRegisterDatetime();
        entity.setUpdateDatetime(updateDatetime);
        final String updateUser = entity.getRegisterUser();
        entity.setUpdateUser(updateUser);
    }

    /**
     * {@inheritDoc}
     */
    public void handleCommonColumnOfUpdateIfNeeds(Entity targetEntity) {
        final MbEntityDefinedCommonColumn entity = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "UPDATE");
        }
        doHandleCommonColumnOfUpdateIfNeeds(entity);
    }

    protected void doHandleCommonColumnOfUpdateIfNeeds(MbEntityDefinedCommonColumn entity) {
        final java.sql.Timestamp updateDatetime = org.seasar.dbflute.AccessContext.getAccessTimestampOnThread();
        entity.setUpdateDatetime(updateDatetime);
        final String updateUser = org.seasar.dbflute.AccessContext.getAccessUserOnThread();
        entity.setUpdateUser(updateUser);
    }

    // =====================================================================================
    //                                                                         Assist Helper
    //                                                                         =============
    protected MbEntityDefinedCommonColumn askIfEntitySetup(Entity targetEntity) {
        if (!hasCommonColumn(targetEntity)) {
            return null;
        }
        final MbEntityDefinedCommonColumn entity = downcastEntity(targetEntity);
        if (!canCommonColumnAutoSetup(entity)) {
            return null;
        }
        return entity;
    }

    protected boolean hasCommonColumn(Entity targetEntity) {
        return targetEntity instanceof MbEntityDefinedCommonColumn;
    }

    protected boolean canCommonColumnAutoSetup(MbEntityDefinedCommonColumn entity) {
        return entity.canCommonColumnAutoSetup();
    }

    protected MbEntityDefinedCommonColumn downcastEntity(Entity targetEntity) {
        return (MbEntityDefinedCommonColumn)targetEntity;
    }

    // =====================================================================================
    //                                                                               Logging
    //                                                                               =======
    protected boolean isInternalDebugEnabled() {
        return MbDBFluteConfig.getInstance().isInternalDebug() && _log.isDebugEnabled();
    }

    protected void logSettingUp(MbEntityDefinedCommonColumn entity, String keyword) {
        _log.debug("...Setting up column columns of " + entity.getTableDbName() + " before " + keyword);
    }
}
