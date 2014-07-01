package JDBCUtils;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;



import Exceptions.DBSystemException;


public class DAO_Manager  {
    private static final String DRIVER_CLASS_NAME = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String JDBC_URL = "jdbc:sqlserver://localhost;instance=MS2008R2E;databaseName=GMSSample38;user=sa;password=QQQqqq123";


    private static final String SELECT_ALL_DOCUMENTS_FROM_DB_WITH_NAME_CHID= "SELECT ChID FROM t_Ven";

    static {
        ConnectionManager.initDriver(DRIVER_CLASS_NAME);
    }

    private Connection getConnection() throws DBSystemException {
        try {
            return DriverManager.getConnection(JDBC_URL);
        } catch (SQLException e) {
            throw new DBSystemException("Can't connect to SQL");
        }
    }

    public List<Integer> getDocsChIdToList () throws DBSystemException {
        Connection conn = getConnection();
        Statement stat = null;
        ResultSet rs = null;

        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            stat = conn.createStatement();
            rs = stat.executeQuery(SELECT_ALL_DOCUMENTS_FROM_DB_WITH_NAME_CHID);
            List<Integer> result = new LinkedList<Integer>();
            while (rs.next()) {
                int ChID = rs.getInt(1);
                result.add(ChID);
            }
            conn.commit();
            return result;


        } catch (SQLException e) {
            ConnectionManager.rollbackQuietly(conn);


            throw new DBSystemException("Cant exequte SQL");
        } finally {
            ConnectionManager.closeQuietly(rs);
            ConnectionManager.closeQuietly(conn);
            ConnectionManager.closeQuietly(stat);

        }
    }

    public String getHeaderInString(int documentId) throws DBSystemException
    {

        Connection conn = getConnection();
        String completeString = null;
        try
        {
            String tableName = "description=\"Заголовок\" tableName=\"t_Ven\"> ";
            String query = QueryBuilder.getHeader(documentId);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            completeString = XMLBuilder.toXML(rs,tableName);

            rs.close();
            stmt.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return completeString;
    }
    public String getProductInString(int documentId) throws DBSystemException
    {

        Connection conn = getConnection();
        String completeString = null;
        try
        {
            String tableName = "description=\"Товар\" tableName=\"t_VenA\"> ";
            String query = QueryBuilder.getProduct(documentId);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            completeString = XMLBuilder.toXML(rs,tableName);

            rs.close();
            stmt.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return completeString;
    }
    public String getProductBatchInString(int documentId) throws DBSystemException
    {

        Connection conn = getConnection();
        String completeString = null;
        try
        {
            String tableName = "description='Партии' tableName='t_VenD'> ";
            String query = QueryBuilder.getProductBatch(documentId);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            completeString = XMLBuilder.toXML(rs,tableName);

            rs.close();
            stmt.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return completeString;
    }
    public String getPackTypeInString(int documentId) throws DBSystemException
    {

        Connection conn = getConnection();
        String completeString = null;
        try
        {
            String tableName = "description=\"Виды упаковок\" tableName=\"t_VenD_UM\"> ";
            String query = QueryBuilder.getPackType(documentId);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            completeString = XMLBuilder.toXML(rs,tableName);

            rs.close();
            stmt.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return completeString;
    }
    public String getProductRoutesInString(int documentId) throws DBSystemException
    {

        Connection conn = getConnection();
        String completeString = null;
        try
        {
            String tableName = "description=\"Маршрут\" tableName=\"t_VenD\"> ";
            String query = QueryBuilder.getProductRoutes(documentId);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            completeString = XMLBuilder.toXML(rs,tableName);

            rs.close();
            stmt.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return completeString;
    }
    public String getProductSpendsInString(int documentId) throws DBSystemException
    {

        Connection conn = getConnection();
        String completeString = null;
        try
        {
            String tableName = "description='Затраты' tableName='t_VenSpends'> ";
            String query = QueryBuilder.getProductSpends(documentId);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            completeString = XMLBuilder.toXML(rs,tableName);

            rs.close();
            stmt.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return completeString;
    }
    public String getUnknownBarCodesInString(int documentId) throws DBSystemException
    {
        Connection conn = getConnection();
        String completeString = null;
        try
        {
            String tableName = "description='Неизвестные штрихкоды' tableName=\"t_VenUnknBarCodes\"> ";
            String query = QueryBuilder.getUnknownBarCodes(documentId);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            completeString = XMLBuilder.toXML(rs,tableName);

            rs.close();
            stmt.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return completeString;
    }
    public String getProductImbalanceInString(int documentId) throws DBSystemException
    {

        Connection conn = getConnection();
        String completeString = null;
        try
        {
            String tableName = "description=\"Несоответствие учетного остатка\" tableName=\"t_VenDiscrepancyRecordsRem\" > ";
            String query = QueryBuilder.getProductImbalance(documentId);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            completeString = XMLBuilder.toXML(rs,tableName);

            rs.close();
            stmt.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return completeString;
    }
}
