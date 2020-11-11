/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.Serializable;

/**
 *
 * @author saray
 */
public class EmailFormatException extends Exception implements Serializable {

    private String message;

    /**
     * Method to set the message
     *
     * @param log
     */
    public EmailFormatException(String m) {
        this.message = m;
    }

    /**
     * Method to get the message
     *
     * @return a string with the information to the user or null
     */
    public String getMessage() {
        if (message == null) {
            return "El email no tiene un formato correcto";
        } else {
            return null;
        }
    }
}
