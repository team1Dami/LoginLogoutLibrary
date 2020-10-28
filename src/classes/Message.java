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
    private User usuario;
    private enum Type{
        logIn,
        logUp,
        logOut
    }
    
    private Exception e;
    
    public User getUsuario() {
        return usuario;
    }

    public Exception getE() {
        return e;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public void setE(Exception e) {
        this.e = e;
    }
    public void set(User user, int tipo){
        usuario=user;
        if (tipo==1){
            Type type = Type.logIn;
        }
        else if(tipo==2){
            Type type = Type.logUp;
        }
    }
}
