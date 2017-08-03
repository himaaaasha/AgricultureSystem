/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;

/**
 *
 * @author Himasha Harinda
 */
public class FieldStationRegistration {
    GPSCoord location;
    String uniquePhoneNumber;
    String setupSecretKey;
    SetOfUsers users;

    public FieldStationRegistration(GPSCoord location, String uniquePhoneNumber, String setupSecretKey, SetOfUsers users) {
        this.location = location;
        this.uniquePhoneNumber = uniquePhoneNumber;
        this.setupSecretKey = setupSecretKey;
        this.users = users;
    }

    public GPSCoord getLocation() {
        return location;
    }

    public void setLocation(GPSCoord location) {
        this.location = location;
    }

    public String getUniquePhoneNumber() {
        return uniquePhoneNumber;
    }

    public void setUniquePhoneNumber(String uniquePhoneNumber) {
        this.uniquePhoneNumber = uniquePhoneNumber;
    }

    public String getSetupSecretKey() {
        return setupSecretKey;
    }

    public void setSetupSecretKey(String setupSecretKey) {
        this.setupSecretKey = setupSecretKey;
    }

    public SetOfUsers getUsers() {
        return users;
    }

    public void setUsers(SetOfUsers users) {
        this.users = users;
    }
    
    
}
