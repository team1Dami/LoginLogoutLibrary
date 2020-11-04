package exceptions;

import java.io.Serializable;

/**
 *
 * @author saray
 */
public class UserExistException extends Exception implements Serializable {

    private String Login;

    public UserExistException(String log) {
        this.Login = log;
    }

    public String getMessage() {
        if (Login == null) {
            return "El login ya está registrado";
        } else {
            return null;
        }
    }
}
