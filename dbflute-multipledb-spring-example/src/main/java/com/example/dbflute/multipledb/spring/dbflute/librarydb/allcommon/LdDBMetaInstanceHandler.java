/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */package com.example.dbflute.multipledb.spring.dbflute.librarydb.allcommon;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Method;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.exception.DBMetaNotFoundException;
import org.seasar.dbflute.helper.StringKeyMap;
import org.seasar.dbflute.util.DfAssertUtil;

/**
 * The handler of the instance of DB meta.
 * @author DBFlute(AutoGenerator)
 */
public class LdDBMetaInstanceHandler implements DBMetaProvider {

    // ===================================================================================
    //                                                                        Resource Map
    //                                                                        ============
    /** The map of DB meta instance by key 'table DB-name'. (NotNull, LazyLoaded) */
    protected static final Map<String, DBMeta> _tableDbNameInstanceMap = newHashMap();

    /** The map of DB meta instance by key 'entity type'. (NotNull, LazyLoaded) */
    protected static final Map<Class<?>, DBMeta> _entityTypeInstanceMap = newHashMap();

    /** The map of table DB name and DB meta class name. (NotNull) */
    protected static final Map<String, String> _tableDbNameClassNameMap;
    static {
        final Map<String, String> tmpMap = newHashMap();
        tmpMap.put("AUTHOR", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdAuthorDbm");
        tmpMap.put("BLACK_ACTION", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdBlackActionDbm");
        tmpMap.put("BLACK_ACTION_LOOKUP", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdBlackActionLookupDbm");
        tmpMap.put("BLACK_LIST", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdBlackListDbm");
        tmpMap.put("BOOK", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdBookDbm");
        tmpMap.put("COLLECTION", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdCollectionDbm");
        tmpMap.put("COLLECTION_STATUS", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdCollectionStatusDbm");
        tmpMap.put("COLLECTION_STATUS_LOOKUP", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdCollectionStatusLookupDbm");
        tmpMap.put("GARBAGE", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdGarbageDbm");
        tmpMap.put("GARBAGE_PLUS", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdGarbagePlusDbm");
        tmpMap.put("GENRE", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdGenreDbm");
        tmpMap.put("LB_USER", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdLbUserDbm");
        tmpMap.put("LENDING", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdLendingDbm");
        tmpMap.put("LENDING_COLLECTION", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdLendingCollectionDbm");
        tmpMap.put("LIBRARY", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdLibraryDbm");
        tmpMap.put("LIBRARY_TYPE_LOOKUP", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdLibraryTypeLookupDbm");
        tmpMap.put("LIBRARY_USER", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdLibraryUserDbm");
        tmpMap.put("MYSELF", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdMyselfDbm");
        tmpMap.put("MYSELF_CHECK", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdMyselfCheckDbm");
        tmpMap.put("NEXT_LIBRARY", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdNextLibraryDbm");
        tmpMap.put("PUBLISHER", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdPublisherDbm");
        tmpMap.put("VENDOR_CHECK", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdVendorCheckDbm");
        tmpMap.put("VENDOR_CONSTRAINT_NAME_AUTO_BAR", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdVendorConstraintNameAutoBarDbm");
        tmpMap.put("VENDOR_CONSTRAINT_NAME_AUTO_FOO", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdVendorConstraintNameAutoFooDbm");
        tmpMap.put("VENDOR_CONSTRAINT_NAME_AUTO_QUX", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdVendorConstraintNameAutoQuxDbm");
        tmpMap.put("VENDOR_CONSTRAINT_NAME_AUTO_REF", "com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdVendorConstraintNameAutoRefDbm");
        _tableDbNameClassNameMap = Collections.unmodifiableMap(tmpMap);
    }

    /** The flexible map of table DB name for conversion in finding process. (NotNull) */
    protected static final Map<String, String> _tableDbNameFlexibleMap = StringKeyMap.createAsFlexible();
    static {
        for (String tableDbName : _tableDbNameClassNameMap.keySet()) {
            _tableDbNameFlexibleMap.put(tableDbName, tableDbName);
        }
    }

    /**
     * Get the unmodifiable map of DB meta.
     * @return The unmodifiable map that contains all instances of DB meta. (NotNull, NotEmpty)
     */
    public static Map<String, DBMeta> getUnmodifiableDBMetaMap() {
        initializeDBMetaMap();
        synchronized (_tableDbNameInstanceMap) {
            return Collections.unmodifiableMap(_tableDbNameInstanceMap);
        }
    }

    /**
     * Initialize the map of DB meta.
     */
    protected static void initializeDBMetaMap() {
        if (isInitialized()) {
            return;
        }
        synchronized (_tableDbNameInstanceMap) {
            for (String tableDbName : _tableDbNameClassNameMap.keySet()) {
                findDBMeta(tableDbName); // initialize
            }
            if (!isInitialized()) {
                String msg = "Failed to initialize tableDbNameInstanceMap: " + _tableDbNameInstanceMap;
                throw new IllegalStateException(msg);
            }
        }
    }

    protected static boolean isInitialized() {
        return _tableDbNameInstanceMap.size() == _tableDbNameClassNameMap.size();
    }

    // ===================================================================================
    //                                                                  Provider Singleton
    //                                                                  ==================
    protected static final DBMetaProvider _provider = new LdDBMetaInstanceHandler();

    public static DBMetaProvider getProvider() {
        return _provider;
    }

    public DBMeta provideDBMeta(String tableFlexibleName) {
        return byTableFlexibleName(tableFlexibleName);
    }

    public DBMeta provideDBMeta(Class<?> entityType) {
        return byEntityType(entityType);
    }

    public DBMeta provideDBMetaChecked(String tableFlexibleName) {
        return findDBMeta(tableFlexibleName);
    }

    public DBMeta provideDBMetaChecked(Class<?> entityType) {
        return findDBMeta(entityType);
    }

    // ===================================================================================
    //                                                                         Find DBMeta
    //                                                                         ===========
    /**
     * Find DB meta by table flexible name. (accept quoted name and schema prefix)
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @exception org.seasar.dbflute.exception.DBMetaNotFoundException When the DB meta is not found.
     */
    public static DBMeta findDBMeta(String tableFlexibleName) {
        DBMeta dbmeta = byTableFlexibleName(tableFlexibleName);
        if (dbmeta == null) {
            String msg = "The DB meta was not found by the table flexible name: key=" + tableFlexibleName;
            throw new DBMetaNotFoundException(msg);
        }
        return dbmeta;
    }

    /**
     * Find DB meta by entity type.
     * @param entityType The entity type of table, which should implement the {@link Entity} interface. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @exception org.seasar.dbflute.exception.DBMetaNotFoundException When the DB meta is not found.
     */
    public static DBMeta findDBMeta(Class<?> entityType) {
        DBMeta dbmeta = byEntityType(entityType);
        if (dbmeta == null) {
            String msg = "The DB meta was not found by the entity type: key=" + entityType;
            throw new DBMetaNotFoundException(msg);
        }
        return dbmeta;
    }

    // ===================================================================================
    //                                                                       by Table Name
    //                                                                       =============
    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byTableFlexibleName(String tableFlexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("tableFlexibleName", tableFlexibleName);
        String tableDbName = _tableDbNameFlexibleMap.get(tableFlexibleName);
        if (tableDbName == null) {
            tableDbName = retryByNormalizedName(tableFlexibleName);
        }
        return tableDbName != null ? byTableDbName(tableDbName) : null;
    }

    protected static String retryByNormalizedName(String tableFlexibleName) {
        String tableDbName = null;
        String pureName = normalizeTableFlexibleName(tableFlexibleName);
        String schema = extractSchemaIfExists(tableFlexibleName);
        if (schema != null) { // first, find by qualified name
            tableDbName = _tableDbNameFlexibleMap.get(schema + "." + pureName);
        }
        if (tableDbName == null) { // next, find by pure name
            tableDbName = _tableDbNameFlexibleMap.get(pureName);
        }
        return tableDbName;
    }

    protected static String normalizeTableFlexibleName(String tableFlexibleName) {
        return removeQuoteIfExists(removeSchemaIfExists(tableFlexibleName));
    }

    protected static String removeQuoteIfExists(String name) {
        if (name.startsWith("\"") && name.endsWith("\"")) {
            return strip(name);
        } else if (name.startsWith("[") && name.endsWith("]")) {
            return strip(name);
        }
        return name;
    }

    protected static String removeSchemaIfExists(String name) {
        int dotLastIndex = name.lastIndexOf(".");
        return dotLastIndex >= 0 ? name.substring(dotLastIndex + ".".length()) : name; 
    }

    protected static String extractSchemaIfExists(String name) {
        int dotLastIndex = name.lastIndexOf(".");
        return dotLastIndex >= 0 ? name.substring(0, dotLastIndex) : null; 
    }

    protected static String strip(String name) {
        return name.substring(1, name.length() - 1);
    }

    /**
     * @param tableDbName The DB name of table. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byTableDbName(String tableDbName) {
        assertStringNotNullAndNotTrimmedEmpty("tableDbName", tableDbName);
        return getCachedDBMeta(tableDbName);
    }

    // ===================================================================================
    //                                                                      by Entity Type
    //                                                                      ==============
    /**
     * @param entityType The entity type of table, which should implement the entity interface. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byEntityType(Class<?> entityType) {
        assertObjectNotNull("entityType", entityType);
        return getCachedDBMeta(entityType);
    }

    // ===================================================================================
    //                                                                       Cached DBMeta
    //                                                                       =============
    protected static DBMeta getCachedDBMeta(String tableDbName) { // lazy-load (thank you koyak!)
        DBMeta dbmeta = _tableDbNameInstanceMap.get(tableDbName);
        if (dbmeta != null) {
            return dbmeta;
        }
        synchronized (_tableDbNameInstanceMap) {
            dbmeta = _tableDbNameInstanceMap.get(tableDbName);
            if (dbmeta != null) {
                // an other thread might have initialized
                // or reading might failed by same-time writing
                return dbmeta;
            }
            String dbmetaName = _tableDbNameClassNameMap.get(tableDbName);
            if (dbmetaName == null) {
                return null;
            }
            _tableDbNameInstanceMap.put(tableDbName, toDBMetaInstance(dbmetaName));
            return _tableDbNameInstanceMap.get(tableDbName);
        }
    }

    protected static DBMeta toDBMetaInstance(String dbmetaName) {
        try {
            Class<?> dbmetaType = Class.forName(dbmetaName);
            Method method = dbmetaType.getMethod("getInstance", (Class[])null);
            Object result = method.invoke(null, (Object[])null);
            return (DBMeta)result;
        } catch (Exception e) {
            String msg = "Failed to get the instance: " + dbmetaName;
            throw new IllegalStateException(msg, e);
        }
    }

    protected static DBMeta getCachedDBMeta(Class<?> entityType) { // lazy-load same as by-name
        DBMeta dbmeta = _entityTypeInstanceMap.get(entityType);
        if (dbmeta != null) {
            return dbmeta;
        }
        synchronized (_entityTypeInstanceMap) {
            dbmeta = _entityTypeInstanceMap.get(entityType);
            if (dbmeta != null) {
                // an other thread might have initialized
                // or reading might failed by same-time writing
                return dbmeta;
            }
            if (Entity.class.isAssignableFrom(entityType)) { // required
                Entity entity = newEntity(entityType);
                dbmeta = getCachedDBMeta(entity.getTableDbName());
            }
            if (dbmeta == null) {
                return null;
            }
            _entityTypeInstanceMap.put(entityType, dbmeta);
            return _entityTypeInstanceMap.get(entityType);
        }
    }

    protected static Entity newEntity(Class<?> entityType) {
        try {
            return (Entity)entityType.newInstance();
        } catch (Exception e) {
            String msg = "Failed to new the instance: " + entityType;
            throw new IllegalStateException(msg, e);
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected static <KEY, VALUE> HashMap<KEY, VALUE> newHashMap() {
        return new HashMap<KEY, VALUE>();
    }

    // -----------------------------------------------------
    //                                         Assert Object
    //                                         -------------
    protected static void assertObjectNotNull(String variableName, Object value) {
        DfAssertUtil.assertObjectNotNull(variableName, value);
    }

    // -----------------------------------------------------
    //                                         Assert String
    //                                         -------------
    protected static void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        DfAssertUtil.assertStringNotNullAndNotTrimmedEmpty(variableName, value);
    }
}
