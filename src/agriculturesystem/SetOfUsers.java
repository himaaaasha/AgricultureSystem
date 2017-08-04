/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;

import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    
    public void loaduser(SetOfUsers users, JTable jt){    //done
        for(User aUser:users){
          //create an vector list
          Vector row = new Vector(); 
          //Creating a defaultTableModel object to get data from class.
          //JTable.getModel() is returning correct class type.
          DefaultTableModel dtm = (DefaultTableModel)jt.getModel();
          //add element to the vector list
          
         
          row.add(aUser.getFullname());
          row.add(aUser.getUsername());
          row.add(aUser.getPassword());
          row.add(aUser.getAddress());
          row.add(aUser.getSessionId());
          row.add(aUser.getAccesslevel()); 
          
          
          dtm.addRow(row);
          jt.setModel(dtm);
        }
    }
    
    
    
}
