package exceptions;

import java.io.Serializable;

/**
 * NoConnectionDBException class
 *
 * @author saray
 */
public class NoConnectionDBException extends Exception implements Serializable {

    private String message;

    /**
     * Method to set the message
     *
     * @param log
     */
    public NoConnectionDBException(String log) {
        this.message = log;
    }

    /**
     * Method to get the message
     *
     * @return a string with the information to the user or null
     */
    public String getMessage() {
        if (message == null) {
            return "NoDBCon";
        } else {
            return null;
        }
    }
}
