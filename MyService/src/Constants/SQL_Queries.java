package Constants;

/**
 * Created by javadev on 08.04.14.
 */
public class SQL_Queries {

    //==========CREATE===========//

    public static final String CREATE_NEW_SERVICES_TABLE ="CREATE TABLE Services(\n" +
            "  service_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
            "  service_name VARCHAR(20) NOT NULL,\n" +
            "  tariff_current DOUBLE NOT NULL,\n" +
            "  tariff_date VARCHAR(20),\n" +
            "  tariff_fixed BOOLEAN NOT NULL,\n" +
            "  counter_current INT,\n" +
            "  counter_date VARCHAR(20),\n" +
            "  service_unit_name VARCHAR(20),\n" +
            "  service_account INT\n" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8;";

    public static final String SELECT_ALL_SQL = "SELECT * FROM Services";
    public static final String INSERT_NEW_SERVICE = "INSERT INTO Services (" +
            "service_name,tariff_current,tariff_date,tariff_fixed," +
            "counter_current,counter_date,service_unit_name,service_account) " +
            "VALUES (?,?,?,?,?,?,?,?);";

    //==========UPDATE===========//
    public static final String UPDATE_SERVICE_NAME = "UPDATE Services SET service_name = ? WHERE service_id = ?";
    public static final String UPDATE_SERVICE_TARIFF_CURRENT = "UPDATE Services SET tariff_current = ? WHERE service_id = ?";
    public static final String UPDATE_SERVICE_TARIFF_DATE = "UPDATE Services SET tariff_date = ? WHERE service_id = ?";
    public static final String UPDATE_SERVICE_COUNTER_CURRENT= "UPDATE Services SET counter_current = ? WHERE service_id = ?";
    public static final String UPDATE_SERVICE_COUNTER_DATE= "UPDATE Services SET counter_date = ? WHERE service_id = ?";
    public static final String UPDATE_SERVICE_UNIT_NAME= "UPDATE Services SET service_unit_name = ? WHERE service_id = ?";


    //==========READ===========//
    public static final String GET_SERVICE_NAME = "SELECT service_name FROM Services WHERE service_id = ?";
    public static final String GET_SERVICE_TARIFF_CURRENT = "SELECT tariff_current FROM Services WHERE service_id = ?";
    public static final String GET_SERVICE_TARIFF_DATE = "SELECT tariff_date FROM Services WHERE service_id = ?";
    public static final String GET_SERVICE_TARIFF_STATUS= "SELECT tariff_fixed FROM Services WHERE service_id = ?";
    public static final String GET_SERVICE_COUNTER_CURRENT= "SELECT counter_current FROM Services WHERE service_id = ?";
    public static final String GET_SERVICE_COUNTER_DATE= "SELECT counter_date FROM Services WHERE service_id = ?";
    public static final String GET_SERVICE_UNIT_NAME= "SELECT service_unit_name FROM Services WHERE service_id = ?";
    public static final String GET_SERVICE_ID= "SELECT service_id FROM Services WHERE service_name = ?";


    //==========DELETE===========//
    public static final String DELETE_ALL_SQ = "DELETE FROM users WHERE id >=1";
    public static final String GET_PRIMARY_SQL = "SHOW KEYS FROM table WHERE Key_name = 'PRIMARY'";
    public static final String SELECT_BY_LOGIN_SQL = "SELECT login FROM users WHERE login=?";
}
