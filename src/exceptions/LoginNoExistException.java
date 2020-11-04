package exceptions;

import java.io.Serializable;

/**
 *
 * @author saray
 */
public class LoginNoExistException extends Exception implements Serializable{
    
    private String login;

    public LoginNoExistException(String log) {
        this.login = log;
    }

    public String getMessage() {
        if (login == null) {
            return "El usuario no está registrado";
        } else {
            return null;
        }
    }
}
