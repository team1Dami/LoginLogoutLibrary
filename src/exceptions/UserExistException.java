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
public class UserExistException extends Exception implements Serializable {

    private String Login;

    public UserExistException(String log) {
        this.Login = log;
    }

    public String getMessage() {
        if (Login == null) {
            return "Duplicated loggin, can't be seted";
        } else {
            return null;
        }
    }
}
