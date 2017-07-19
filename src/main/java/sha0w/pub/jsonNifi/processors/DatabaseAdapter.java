package sha0w.pub.jsonNifi.processors;

/**
 * Created by coco1 on 2017/7/19.
 */
/**
 * Interface for RDBMS/JDBC-specific code.
 */
public interface DatabaseAdapter {

    String getName();

    String getDescription();

    /**
     * Returns a SQL SELECT statement with the given clauses applied.
     *
     * @param tableName     The name of the table to fetch rows from
     * @param columnNames   The names of the columns to fetch from the table
     * @param whereClause   The filter to apply to the statement. This should not include the WHERE keyword
     * @param orderByClause The columns/clause used for ordering the result rows. This should not include the ORDER BY keywords
     * @param limit         The value for the LIMIT clause (i.e. the number of rows to return)
     * @param offset        The value for the OFFSET clause (i.e. the number of rows to skip)
     * @return A String containing a SQL SELECT statement with the given clauses applied
     */
    String getSelectStatement(String tableName, String columnNames, String whereClause, String orderByClause, Long limit, Long offset);
}