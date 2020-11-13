package interfaces;

import classes.Message;
import classes.User;
import exceptions.LoginNoExistException;
import exceptions.NoConnectionDBException;
import exceptions.NoServerConnectionException;
import exceptions.PasswordErrorException;
import exceptions.UserExistException;
import java.net.ConnectException;

/**
 * Interface common to both projects loginlogoutServer && ApplicationCliente
 * with the methods SignIn and SignUp
 *
 * @author saray
 */
public interface ClientServer {

    public User signIn(User user) throws LoginNoExistException,PasswordErrorException,ConnectException,NoServerConnectionException,NoConnectionDBException;

    public User signUp(User user) throws UserExistException, NoServerConnectionException,NoConnectionDBException;

}