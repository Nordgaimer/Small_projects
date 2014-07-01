package Services;

import Blanks.Public_Service_DAO;
import Constants.SQL_Connection;
import Constants.SQL_Queries;
import Utils.DBSystemException;
import Utils.JdbcUtils;

import java.sql.*;

/**
 * Created by javadev on 08.04.14.
 */
public class GasService implements Public_Service_DAO{
    private int id=4;
    private String defaul_service_name="GasService";
    private String service_name;

    static {
        JdbcUtils.initDriver(SQL_Connection.DRIVER_CLASS_NAME);
    }

    private Connection getConnection() throws DBSystemException {
        try {
            return DriverManager.getConnection(SQL_Connection.JDBC_URL, SQL_Connection.LOGIN, SQL_Connection.PASSWORD);
        } catch (SQLException e) {
            throw new DBSystemException("Can't connect to SQL");
        }
    }


    //-----------Serive name----------//
    @Override
    public String readServiceName() throws DBSystemException {
        Connection conn = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement(SQL_Queries.GET_SERVICE_NAME);
            preparedStatement.setInt(1, id);
            rs = preparedStatement.executeQuery();
            String serviceName = "";
            while (rs.next()) {
                serviceName += rs.getString("service_name");
            }
            conn.commit();
            return serviceName;
        } catch (SQLException e) {
            JdbcUtils.rollbackQuietly(conn);
            throw new DBSystemException("Can't exequte SQL");
        } finally {
            JdbcUtils.closeQuietly(rs);
            JdbcUtils.closeQuietly(preparedStatement);
            JdbcUtils.closeQuietly(conn);
        }
    }
    @Override
    public void updateServiceName(String newName) throws DBSystemException {

        Connection conn = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement(SQL_Queries.UPDATE_SERVICE_NAME);
            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2,id);
            preparedStatement.execute();
            service_name=newName;
            conn.commit();
            System.out.println("Update succeed");
        } catch (SQLException e) {
            JdbcUtils.rollbackQuietly(conn);
            throw new DBSystemException("Can't exequte SQL");
        } finally {
            JdbcUtils.closeQuietly(rs);
            JdbcUtils.closeQuietly(preparedStatement);
            JdbcUtils.closeQuietly(conn);
        }
    }


    //--------------Tariff----------//
    @Override
    public String readTariffDate() throws DBSystemException {
        Connection conn = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement(SQL_Queries.GET_SERVICE_TARIFF_DATE);
            preparedStatement.setInt(1,id);
            rs = preparedStatement.executeQuery();
            String tariff_date = "";
            while (rs.next()){
                tariff_date+=rs.getString("tariff_date");
            }
            conn.commit();
            return tariff_date;
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
    @Override
    public void updateTariffDate(String date) throws DBSystemException {
        Connection conn = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement(SQL_Queries.UPDATE_SERVICE_TARIFF_DATE);
            preparedStatement.setString(1,date);
            preparedStatement.setInt(2,id);
            preparedStatement.execute();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            JdbcUtils.rollbackQuietly(conn);
            throw new DBSystemException("Can't exequte SQL");
        } finally {
            JdbcUtils.closeQuietly(rs);
            JdbcUtils.closeQuietly(preparedStatement);
            JdbcUtils.closeQuietly(conn);
        }
    }
    @Override
    public double readTariffCurrent() throws DBSystemException {
        Connection conn = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement(SQL_Queries.GET_SERVICE_TARIFF_CURRENT);
            preparedStatement.setInt(1,id);
            rs = preparedStatement.executeQuery();
            double current_tariff=-1;
            while (rs.next()){
                current_tariff=rs.getDouble("tariff_current");
            }
            conn.commit();
            return current_tariff;
        } catch (SQLException e) {
            JdbcUtils.rollbackQuietly(conn);
            throw new DBSystemException("Can't exequte SQL");
        } finally {
            JdbcUtils.closeQuietly(rs);
            JdbcUtils.closeQuietly(preparedStatement);
            JdbcUtils.closeQuietly(conn);
        }
    }
    @Override
    public void updateTariffCurrent(double current_tariff) throws DBSystemException {
        Connection conn = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement(SQL_Queries.UPDATE_SERVICE_TARIFF_CURRENT);
            preparedStatement.setDouble(1, current_tariff);
            preparedStatement.setInt(2, id);
            preparedStatement.execute();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            JdbcUtils.rollbackQuietly(conn);
            throw new DBSystemException("Can't exequte SQL");
        } finally {
            JdbcUtils.closeQuietly(rs);
            JdbcUtils.closeQuietly(preparedStatement);
            JdbcUtils.closeQuietly(conn);
        }
    }
    @Override
    public boolean tariffFixedStatus() throws DBSystemException {
        Connection conn = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement(SQL_Queries.GET_SERVICE_TARIFF_STATUS);
            preparedStatement.setInt(1,id);
            rs = preparedStatement.executeQuery();
            boolean status = false;
            while (rs.next()){
                status=rs.getBoolean("tariff_fixed");
            }
            conn.commit();
            return status;
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

    //-----------Counter----------//
    @Override
    public String readCounterDate() throws DBSystemException {
        Connection conn = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement(SQL_Queries.GET_SERVICE_COUNTER_DATE);
            preparedStatement.setInt(1,id);
            rs = preparedStatement.executeQuery();
            String counter_date = "";
            while (rs.next()){
                counter_date+=rs.getString("counter_date");
            }
            conn.commit();
            return counter_date;
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
    @Override
    public void updateCounterDate(String date) throws DBSystemException {
        Connection conn = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement(SQL_Queries.UPDATE_SERVICE_COUNTER_DATE);
            preparedStatement.setString(1,date);
            preparedStatement.setInt(2,id);
            preparedStatement.execute();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            JdbcUtils.rollbackQuietly(conn);
            throw new DBSystemException("Can't exequte SQL");
        } finally {
            JdbcUtils.closeQuietly(rs);
            JdbcUtils.closeQuietly(preparedStatement);
            JdbcUtils.closeQuietly(conn);
        }
    }
    @Override
    public short readCounterCurrent() throws DBSystemException {
        Connection conn = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement(SQL_Queries.GET_SERVICE_COUNTER_CURRENT);
            preparedStatement.setInt(1,id);
            rs = preparedStatement.executeQuery();
            short counter_current = -1;
            while (rs.next()){
                counter_current=rs.getShort("counter_date");
            }
            conn.commit();
            return counter_current;
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
    @Override
    public void updateCounterCurrent(short data) throws DBSystemException {
        Connection conn = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement(SQL_Queries.UPDATE_SERVICE_COUNTER_CURRENT);
            preparedStatement.setShort(1, data);
            preparedStatement.setInt(2,id);
            preparedStatement.execute();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            JdbcUtils.rollbackQuietly(conn);
            throw new DBSystemException("Can't exequte SQL");
        } finally {
            JdbcUtils.closeQuietly(rs);
            JdbcUtils.closeQuietly(preparedStatement);
            JdbcUtils.closeQuietly(conn);
        }
    }


    //-----------Service Unit and Service Account----------//
    @Override
    public String readServiceUnitName() throws DBSystemException {
        Connection conn = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement(SQL_Queries.GET_SERVICE_UNIT_NAME);
            preparedStatement.setInt(1,id);
            rs = preparedStatement.executeQuery();
            String service_unit_name = "";
            while (rs.next()){
                service_unit_name+=rs.getString("service_unit_name");
            }
            conn.commit();
            return service_unit_name;
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
    @Override
    public void updateServiceUnitName(String unit_name) throws DBSystemException {
        Connection conn = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement(SQL_Queries.UPDATE_SERVICE_UNIT_NAME);
            preparedStatement.setString(1, unit_name);
            preparedStatement.setInt(2,id);
            preparedStatement.execute();
            conn.commit();
            System.out.println("Update succeed");
        } catch (SQLException e) {
            JdbcUtils.rollbackQuietly(conn);
            throw new DBSystemException("Can't exequte SQL");
        } finally {
            JdbcUtils.closeQuietly(rs);
            JdbcUtils.closeQuietly(preparedStatement);
            JdbcUtils.closeQuietly(conn);
        }
    }
}


