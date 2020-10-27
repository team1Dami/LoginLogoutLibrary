/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.User;

/**
 *
 * @author saray
 */
public interface ClientServer {
    
    public void signIn(User user);
    public void signUp(User user);
  //  public void logOut();
}
