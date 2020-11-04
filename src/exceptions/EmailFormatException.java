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

    private String eMail;

    public EmailFormatException(String e) {
        this.eMail = e;
    }

    public String getMessage() {
        if (eMail == null) {
            return "Invalid email format";
        } else {
            return null;
        }
    }
}
