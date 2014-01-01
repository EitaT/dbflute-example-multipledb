package com.example.dbflute.multipledb.spring.dbflute.vendor;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import javax.sql.DataSource;

import com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdBookDbm;
import com.example.dbflute.multipledb.spring.dbflute.librarydb.bsentity.dbmeta.LdLibraryUserDbm;
import com.example.dbflute.multipledb.spring.unit.AppContainerTestCase;

/**
 * @author jflute
 */
public class VendorMetaDataTest extends AppContainerTestCase {

    // ===================================================================================
    //                                                                    DatabaseMetaData
    //                                                                    ================
    // -----------------------------------------------------
    //                                             DBMS Info
    //                                             ---------
    public void test_DatabaseMetaData_databaseInfo() throws SQLException {
        DatabaseMetaData metaData = getDataSource().getConnection().getMetaData();
        log("getDatabaseProductName(): " + metaData.getDatabaseProductName());
        log("getDatabaseProductVersion(): " + metaData.getDatabaseProductVersion());
        log("getDatabaseMajorVersion(): " + metaData.getDatabaseMajorVersion());
        log("getDatabaseMinorVersion(): " + metaData.getDatabaseMinorVersion());
    }

    // -----------------------------------------------------
    //                                             Max Thing
    //                                             ---------
    public void test_DatabaseMetaData_maxThing() throws SQLException {
        DatabaseMetaData metaData = getDataSource().getConnection().getMetaData();
        log("getMaxStatementLength(): " + metaData.getMaxStatementLength());
        log("getMaxTableNameLength(): " + metaData.getMaxTableNameLength());
    }

    // -----------------------------------------------------
    //                                                  Term
    //                                                  ----
    public void test_DatabaseMetaData_term() throws SQLException {
        DatabaseMetaData metaData = getDataSource().getConnection().getMetaData();
        log("getCatalogTerm(): " + metaData.getCatalogTerm());
        log("getSchemaTerm(): " + metaData.getSchemaTerm());
        log("getProcedureTerm(): " + metaData.getProcedureTerm());
    }

    // -----------------------------------------------------
    //                                           getTables()
    //                                           -----------
    public void test_DatabaseMetaData_getTables() throws SQLException {
        DatabaseMetaData metaData = getDataSourceLibraryDb().getConnection().getMetaData();
        ResultSet rs = metaData.getTables("dummy", "LIBRARYDB", "%", new String[] { "TABLE", "VIEW" });
        log("[Table]");
        boolean exists = false;
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString("TABLE_CAT");
            String schema = rs.getString("TABLE_SCHEM");
            String table = rs.getString("TABLE_NAME");
            String comment = rs.getString("REMARKS");
            assertNotNull(catalog);
            assertNotNull(schema);
            assertNotNull(table);
            log("catalog=" + catalog + ", schema=" + schema + ", table=" + table + ", comment=" + comment);
        }
        assertTrue(exists);
    }

    // -----------------------------------------------------
    //                                      getPrimaryKeys()
    //                                      ----------------
    public void test_DatabaseMetaData_primaryKeys() throws SQLException {
        Connection conn = null;
        DatabaseMetaData metaData = null;
        ResultSet rs = null;
        try {
            conn = getDataSourceLibraryDb().getConnection();
            metaData = conn.getMetaData();
            rs = metaData.getPrimaryKeys(null, null, LdLibraryUserDbm.getInstance().getTableDbName());
            log("[PrimaryKey]");
            while (rs.next()) {
                String pkName = rs.getString("PK_NAME");
                String columnName = rs.getString("COLUMN_NAME");
                log(pkName + ": " + columnName);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    // -----------------------------------------------------
    //                                     getImportedKeys()
    //                                     -----------------
    public void test_DatabaseMetaData_getImportedKeys_basic() throws SQLException {
        DatabaseMetaData metaData = getDataSource().getConnection().getMetaData();
        String tableDbName = LdBookDbm.getInstance().getTableDbName();
        ResultSet rs = metaData.getImportedKeys("dummy", "LIBRARYDB", tableDbName);
        boolean exists = false;
        int count = 0;
        Set<String> fkSet = new HashSet<String>();
        while (rs.next()) {
            exists = true;
            String catalog = rs.getString(1); // empty
            String schema = rs.getString(2);
            String foreignTable = rs.getString(3);
            String foreignColumn = rs.getString(4);
            String fkName = rs.getString(12);

            ++count;
            fkSet.add(fkName);

            log("[" + fkName + "]");
            log("  catalog=" + catalog + ", schema=" + schema);
            log("  foreignTable=" + foreignTable + ", foreignColumn=" + foreignColumn);
            assertNotNull(fkName);
            assertNotNull(catalog);
            assertEquals("", catalog); // Derby returns catalog as empty string
            assertNotNull(schema);
            assertNotNull(foreignTable);
            assertNotNull(foreignColumn);
        }
        assertTrue(exists);
        assertEquals(count, fkSet.size());
    }

    // -----------------------------------------------------
    //                                       getProcedures()
    //                                       ---------------
    public void test_DatabaseMetaData_getProcedures_mainSchema() throws SQLException {
        DatabaseMetaData metaData = getDataSourceLibraryDb().getConnection().getMetaData();
        ResultSet rs = metaData.getProcedures(null, null, null);
        log("[Procedure]");
        while (rs.next()) {
            String catalog = rs.getString("PROCEDURE_CAT");
            String schema = rs.getString("PROCEDURE_SCHEM");
            String name = rs.getString("PROCEDURE_NAME");
            log("catalog=" + catalog + ", schema=" + schema + ", procedure=" + name);
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected DataSource getDataSource() {
        return getDataSourceLibraryDb();
    }
}
