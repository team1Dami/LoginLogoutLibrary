package interfaces;

import classes.User;

/**
 * Interface common to both projects loginlogoutServer && ApplicationCliente
 * with the methods SignIn and SignUp
 *
 * @author saray
 */
public interface ClientServer {

    public User signIn(User user);

    public User signUp(User user);

}
