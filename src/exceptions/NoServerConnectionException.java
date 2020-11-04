/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.Serializable;

/**
 *
 * @author 2dam
 */
public class NoServerConnectionException extends Exception implements Serializable {

    private String message;
    private Error code;

    public NoServerConnectionException(String m, Throwable cause, Error code ) {
        super(m, cause);
        this.code = code;
    }

    public NoServerConnectionException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMessage() {
        if (message == null) {
            return "The connection with the server has failled";
        } else {
            return null;
        }
    }
}
