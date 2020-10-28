/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;

/**
 *
 * @author eneko
 */
public class Message implements Serializable{
    private User user;
    private enum Type{
        logIn,
        logUp,
        logOut
    }
    
    private Exception exception;
    
    public User getUsuario() {
        return user;
    }

    public Exception getE() {
        return exception;
    }

    public void setUsuario(User user) {
        this.user = user;
    }

    public void setE(Exception exception) {
        this.exception = exception;
    }
    public void set(User user, int option){
        user=user;
        if (option==1){
            Type type = Type.logIn;
        }
        else if(option==2){
            Type type = Type.logUp;
        }
    }
}
