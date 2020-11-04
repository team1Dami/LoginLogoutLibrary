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
public class EmailExistException extends Exception implements Serializable {

    private String eMail;

    public EmailExistException(String e) {
        this.eMail = e;
    }

    public String getMessage() {
        if (eMail == null) {
            return "El email ya está registrado";
        } else {
            return null;
        }
    }
}
