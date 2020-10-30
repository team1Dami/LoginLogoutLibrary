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
    
    public Message (){    }
    
    private User user;

    public enum Type{
        logIn,
        logUp,
        logOut
    }
    private Type type;
    
    private Exception exception=null;

    public String getType() {
        return type.name();
    }

    public void setType(int windowType) {
        if(windowType==1)
            this.type=type.logIn;
        else if(windowType==2)
            this.type=type.logUp;
    }
    
    public User getUser() {
        return user;
    }

    public Exception getException() {
        return exception;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }
}
