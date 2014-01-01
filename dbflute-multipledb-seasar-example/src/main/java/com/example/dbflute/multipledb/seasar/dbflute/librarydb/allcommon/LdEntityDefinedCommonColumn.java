/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.seasar.dbflute.librarydb.allcommon;

import org.seasar.dbflute.Entity;

/**
 * The interface of entity defined common columns.
 * @author DBFlute(AutoGenerator)
 */
public interface LdEntityDefinedCommonColumn extends Entity {

    /**
     * Get the value of rUser.
     * @return The instance of the property type. (NullAllowed)
     */
    String getRUser();

    /**
     * Set the value of rUser.
     * @param rUser The instance of the property type. (NullAllowed)
     */
    void setRUser(String rUser);

    /**
     * Get the value of rModule.
     * @return The instance of the property type. (NullAllowed)
     */
    String getRModule();

    /**
     * Set the value of rModule.
     * @param rModule The instance of the property type. (NullAllowed)
     */
    void setRModule(String rModule);

    /**
     * Set the value of rModule as Online. <br />
     * Online: Online Module
     */
    void setRModule_Online();

    /**
     * Is the value of rModule 'Online'? <br />
     * Online: Online Module
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    boolean isRModuleOnline();

    /**
     * Set the value of rModule as Batch. <br />
     * Batch: Batch Module
     */
    void setRModule_Batch();

    /**
     * Is the value of rModule 'Batch'? <br />
     * Batch: Batch Module
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    boolean isRModuleBatch();

    /**
     * Get the value of rTimestamp.
     * @return The instance of the property type. (NullAllowed)
     */
    java.sql.Timestamp getRTimestamp();

    /**
     * Set the value of rTimestamp.
     * @param rTimestamp The instance of the property type. (NullAllowed)
     */
    void setRTimestamp(java.sql.Timestamp rTimestamp);

    /**
     * Get the value of uUser.
     * @return The instance of the property type. (NullAllowed)
     */
    String getUUser();

    /**
     * Set the value of uUser.
     * @param uUser The instance of the property type. (NullAllowed)
     */
    void setUUser(String uUser);

    /**
     * Get the value of uModule.
     * @return The instance of the property type. (NullAllowed)
     */
    String getUModule();

    /**
     * Set the value of uModule.
     * @param uModule The instance of the property type. (NullAllowed)
     */
    void setUModule(String uModule);

    /**
     * Set the value of uModule as Online. <br />
     * Online: Online Module
     */
    void setUModule_Online();

    /**
     * Is the value of uModule 'Online'? <br />
     * Online: Online Module
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    boolean isUModuleOnline();

    /**
     * Set the value of uModule as Batch. <br />
     * Batch: Batch Module
     */
    void setUModule_Batch();

    /**
     * Is the value of uModule 'Batch'? <br />
     * Batch: Batch Module
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    boolean isUModuleBatch();

    /**
     * Get the value of uTimestamp.
     * @return The instance of the property type. (NullAllowed)
     */
    java.sql.Timestamp getUTimestamp();

    /**
     * Set the value of uTimestamp.
     * @param uTimestamp The instance of the property type. (NullAllowed)
     */
    void setUTimestamp(java.sql.Timestamp uTimestamp);

    /**
	 * Enable common column auto set up. <br />
	 * It's only for after disable because the default is enabled.
	 */
    void enableCommonColumnAutoSetup();

    /**
	 * Disable common column auto set up. <br />
	 * This is an old style. You can get the same process
	 * by varyingInsert() and varyingUpdate() and so on.
	 */
    void disableCommonColumnAutoSetup();

    /**
	 * Can the entity set up common column by auto? (basically for Framework)
	 * @return The determination, true or false.
	 */
	boolean canCommonColumnAutoSetup();
}
