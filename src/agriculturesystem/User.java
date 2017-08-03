/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;
import java.io.Serializable;
import java.util.*;


/**
 *
 * @author Himasha Harinda
 */
public class User implements Serializable{
    String fullname;
    String username;
    String password;
    String address;
    String sessionId;
    AccessLevel accesslevel;
    Farm farms;
    

    public User(String fullname, String username, String password, String address, String sessionId, Farm farms, AccessLevel accesslevel) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.address = address;
        this.sessionId = sessionId;
        this.farms = farms;
        this.accesslevel = accesslevel;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Farm getFarms() {
        return farms;
    }

    public void setFarms(Farm farms) {
        this.farms = farms;
    }

    public AccessLevel getAccesslevel() {
        return accesslevel;
    }

    public void setAccesslevel(AccessLevel accesslevel) {
        this.accesslevel = accesslevel;
    }

    

    
    
    
    
    
    
}
