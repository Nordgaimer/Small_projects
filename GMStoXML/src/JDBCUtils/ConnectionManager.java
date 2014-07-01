package JDBCUtils;

import java.sql.*;


public class ConnectionManager {
    public static void rollbackQuietly(Connection connection) {
        if (connection!=null){
            try {
                connection.rollback();
            } catch (SQLException e) {
                //NOP
            }
        }

    }

    public static void closeQuietly(Connection connection){

        try {
            connection.close();
        } catch (SQLException e) {
            //NOP
        }

    }
    public static void closeQuietly(ResultSet resultSet){

        try {
            resultSet.close();
        } catch (SQLException e) {
            //NOP
        }

    } public static void closeQuietly(Statement statement){

        try {
            statement.close();
        } catch (SQLException e) {
            //NOP
        }

    }

    private static boolean initialized;
    public static void initDriver(String driverClassName) {
        if (!initialized){
            try {
                Class.forName(driverClassName);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException ("Can't initialize driver");
            }
        }
        initialized=true;
    }

}
