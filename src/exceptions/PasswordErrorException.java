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
public class PasswordErrorException extends Exception implements Serializable{
    
    private String password;

    public PasswordErrorException(String passwd) {
        this.password = passwd;
    }

    public String getMessage() {
        if (password == null) {
            return "the login is not be in the data base";
        } else {
            return null;
        }
    }
}
