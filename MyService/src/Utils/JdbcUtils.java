package Utils;


import java.sql.*;

/**
 * Created by Елена on 27.03.2014.
 */
public class JdbcUtils {

    public static void rollbackQuietly(Connection connection) {
        if (connection != null) {
            try {
                connection.rollback();
            } catch (SQLException e) {
                //NOP
            }
        }
    }

    public static void closeQuietly(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                //NOP
            }
        }
    }

    public static void closeQuietly(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                //NOP
            }
        }
    }

    public static void closeQuietly(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                //NOP
            }
        }

    }
    public static void closeQuietly(PreparedStatement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                //NOP
            }
        }
    }

private static boolean initialized;

    public static void initDriver(String driverClassName) {
        if (!initialized) {
            try {
                Class.forName(driverClassName);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Cant initialize driver");
            }
        }
        initialized = true;
    }
}
