/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Himasha Harinda
 */
public class DataManagement {
    SetOfUsers users;
    SetOfFarms farms;

    public DataManagement(SetOfUsers users, SetOfFarms farms) {
        this.users = users;
        this.farms = farms;
    }

    public SetOfUsers getUsers() {
        return users;
    }

    public void setUsers(SetOfUsers users) {
        this.users = users;
    }

    public SetOfFarms getFarms() {
        return farms;
    }

    public void setFarms(SetOfFarms farms) {
        this.farms = farms;
    }
    
    
}
