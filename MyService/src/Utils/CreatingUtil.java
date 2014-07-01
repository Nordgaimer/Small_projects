package Utils;

import Constants.SQL_Connection;
import Constants.SQL_Queries;

import java.sql.*;

/**
 * Created by javadev on 08.04.14.
 */
public class CreatingUtil {
    private Connection getConnection() throws DBSystemException {
        try {
            return DriverManager.getConnection(SQL_Connection.JDBC_URL, SQL_Connection.LOGIN, SQL_Connection.PASSWORD);
        } catch (SQLException e) {
            throw new DBSystemException("Can't connect to SQL");
        }
    }

    public void createNewService(String name, double tariff_current, String tariff_date, boolean tariff_fixed, int counter_current, String counter_date, String service_unit_name, int service_account) throws DBSystemException {

        Connection conn = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement(SQL_Queries.INSERT_NEW_SERVICE);
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, tariff_current);
            preparedStatement.setString(3, tariff_date);
            preparedStatement.setBoolean(4, tariff_fixed);
            preparedStatement.setInt(5, counter_current);
            preparedStatement.setString(6, counter_date);
            preparedStatement.setString(7, service_unit_name);
            preparedStatement.setInt(8, service_account);
            preparedStatement.execute();
            conn.commit();
            System.out.println("New Service inserted succeed");
        } catch (SQLException e) {
            JdbcUtils.rollbackQuietly(conn);
            e.printStackTrace();
            throw new DBSystemException("Can't exequte SQL");
        } finally {
            JdbcUtils.closeQuietly(rs);
            JdbcUtils.closeQuietly(preparedStatement);
            JdbcUtils.closeQuietly(conn);
        }
    }
    public void createServiceTable() throws DBSystemException {

        Connection conn = getConnection();
        Statement statement = null;
        ResultSet rs = null;
        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            statement = conn.createStatement();
            statement.execute(SQL_Queries.CREATE_NEW_SERVICES_TABLE);
            conn.commit();
            System.out.println("New Table Inserted");
        } catch (SQLException e) {
            JdbcUtils.rollbackQuietly(conn);
            e.printStackTrace();
            throw new DBSystemException("Can't exequte SQL");
        } finally {
            JdbcUtils.closeQuietly(rs);
            JdbcUtils.closeQuietly(statement);
            JdbcUtils.closeQuietly(conn);
        }
    }
}
