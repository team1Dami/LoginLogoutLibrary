package interfaces;

import classes.User;
import exceptions.LoginNoExistException;
import exceptions.NoConnectionDBException;
import exceptions.NoServerConnectionException;
import exceptions.PasswordErrorException;
import exceptions.UserExistException;

/**
 * Interface common to both projects loginlogoutServer && ApplicationCliente
 * with the methods SignIn and SignUp
 *
 * @author saray
 */
public interface ClientServer {

    public User signIn(User user) throws LoginNoExistException,PasswordErrorException,NoServerConnectionException,NoConnectionDBException;

    public User signUp(User user) throws UserExistException, NoServerConnectionException,NoConnectionDBException;

}