/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;

import java.util.Vector;

/**
 *
 * @author Himasha Harinda
 */
public class SetOfUsers extends Vector<User>{
    public SetOfUsers()
    {
        super();
    }
    
    public void addUser(User aUser) 
    {
        super.add(aUser);
    }
    
    public void removeUser(User aUser)
    {
        super.remove(aUser);
    }
    
    
}
