package Exceptions;


public class DBSystemException extends DBException {
    /**
     *
     */
    private static final long serialVersionUID = -3782186814153914892L;

    public DBSystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public DBSystemException(String message) {
        super(message);
    }
}
