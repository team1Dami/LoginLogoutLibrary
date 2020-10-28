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
    
    public User signIn(User user);
    public User signUp(User user);
  //  public void logOut();
}
