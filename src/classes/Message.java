/*
 * 
 *
 */
package classes;

import java.io.Serializable;

/**
 *
 * @author eneko
 */
public class Message implements Serializable {

    public Message() {
    }

    private User user;

    private enum Type {
        logIn,
        logUp,
        logOut
    }
    private Type type;

    private Exception exception;

    /**
     *
     * @return
     */
    public String getType() {
        return type.name();
    }

    /**
     *
     * @param windowType
     */
    public void setType(int windowType) {
        if (windowType == 1) {
            this.type = type.logIn;
        } else if (windowType == 2) {
            this.type = type.logUp;
        }
    }

    /**
     *
     * @return
     */
    public User getUser() {
        return user;
    }

    /**
     *
     * @return
     */
    public Exception getException() {
        return exception;
    }

    /**
     *
     * @param user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     *
     * @param exception
     */
    public void setException(Exception exception) {
        this.exception = exception;
    }
}
