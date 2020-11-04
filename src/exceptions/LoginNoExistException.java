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
public class LoginNoExistException extends Exception implements Serializable{
    
    private String login;

    public LoginNoExistException(String log) {
        this.login = log;
    }

    public String getMessage() {
        if (login == null) {
            return "the login is not be in the data base";
        } else {
            return null;
        }
    }
}
