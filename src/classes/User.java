/*
 * 
 *
 */
package classes;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 2dam
 */
public class User implements Serializable {

    enum Userstatus {
        ENABLE,
        DISABLE
    }

    enum UserPrivilege {
        USER,
        ADMIN
    }
    private Integer id;
    private String logIn;
    private String email;
    private String fullname;
    private Userstatus status;
    private UserPrivilege privilege;
    private String passwd;
    private java.sql.Date lastAccess;
    private java.sql.Date lastPasswdChange;

    /**
     *
     * @return
     */
    public UserPrivilege getPrivilege() {
        return privilege;
    }

    /**
     *
     * @param privilege
     */
    public void setPrivilege(UserPrivilege privilege) {
        this.privilege = privilege;
    }

    /**
     *
     * @return
     */
    public String getStatus() {
        return status.name();
    }

    /**
     *
     * @param status
     */
    public void setStatus(int status) {
        if (status == 1) {
            this.status = Userstatus.ENABLE;
        } else {
            this.status = Userstatus.DISABLE;
        }
    }

    /**
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getLogIn() {
        return logIn;
    }

    public void setLogIn(String logIn) {
        this.logIn = logIn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = (java.sql.Date) lastAccess;
    }

    public Date getLastPasswdChange() {
        return lastPasswdChange;
    }

    public void setLastPasswdChange(Date lastPasswdChange) {
        this.lastPasswdChange = (java.sql.Date) lastPasswdChange;
    }

}
