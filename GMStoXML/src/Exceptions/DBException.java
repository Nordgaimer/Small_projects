package Exceptions;

/**
 */
public class DBException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 5069498912612324159L;

    public DBException(String message, Throwable cause) {
        super(message, cause);
    }

    public DBException(String message) {

        super(message);
    }
}
