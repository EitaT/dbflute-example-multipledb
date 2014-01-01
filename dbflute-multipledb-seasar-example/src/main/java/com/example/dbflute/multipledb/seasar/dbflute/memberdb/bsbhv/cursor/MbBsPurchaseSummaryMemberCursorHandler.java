package com.example.dbflute.multipledb.seasar.dbflute.memberdb.bsbhv.cursor;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.seasar.dbflute.jdbc.CursorHandler;
import com.example.dbflute.multipledb.seasar.dbflute.memberdb.exbhv.cursor.MbPurchaseSummaryMemberCursor;

/**
 * The cursor handler of PurchaseSummaryMember.
 * @author DBFlute(AutoGenerator)
 */
public abstract class MbBsPurchaseSummaryMemberCursorHandler implements CursorHandler {

    /**
     * Handle the cursor.
     * @param rs The cursor (result set) for the query, which has first pointer. (NotNull)
     * @return The result object of handling process. (NullAllowed)
     * @throws SQLException
     */
    public Object handle(ResultSet rs) throws SQLException {
        return fetchCursor(createTypeSafeCursor(rs));
    }

    /**
     * Create the type-safe cursor.
     * @param rs The cursor (result set) for the query, which has first pointer. (NotNull)
     * @return The created type-safe cursor. (NotNull)
     * @throws SQLException
     */
    protected MbPurchaseSummaryMemberCursor createTypeSafeCursor(ResultSet rs) throws SQLException {
        final MbPurchaseSummaryMemberCursor cursor = new MbPurchaseSummaryMemberCursor();
        cursor.accept(rs);
        return cursor;
    }

    /**
     * Fetch the cursor.
     * @param cursor The type-safe cursor for the query, which has first pointer. (NotNull)
     * @return The result object of handling process. (NullAllowed)
     * @throws SQLException
     */
    protected abstract Object fetchCursor(MbPurchaseSummaryMemberCursor cursor) throws SQLException;
}
