package Utils;

/**
 * Created by javadev on 08.04.14.
 */
public class DBSystemException extends Exception {
    public DBSystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public DBSystemException(String message) {
        super(message);
    }
}
