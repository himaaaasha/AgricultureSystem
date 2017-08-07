/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;

import SerializationAndDeserialization.SerializationAndDeserialization;
import agriculturesystemUI.farms;
import agriculturesystemUI.login;
import agriculturesystemUI.registration;
import java.io.IOException;
import static java.rmi.server.RemoteRef.serialVersionUID;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Himasha Harinda
 */
public class SetOfUsers extends Vector<User>{
    static final long serialVersionUID = 277950243069653704L;
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
    
    public void loginUser(String username, String password)
    {
        int sessionId = 0;
        SetOfUsers setofusers = new SetOfUsers();
        
        try {
            
            setofusers= (SetOfUsers) SerializationAndDeserialization.Deserialization("SetOfUsers.txt");
            
            for (int i = 0; i < setofusers.size();) {
                if(username.equals(setofusers.elementAt(i).getUsername()) == true)
                {
                    if(password.equals(setofusers.elementAt(i).getPassword()))
                    {
                        
                        JOptionPane.showMessageDialog(null, "Login successful!");
                        farms farm = new farms();
                        farm.setVisible(true);
                        login lgn = new login();
                        lgn.dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Invalid credentials!");
                    }
                    
                    
                }
                 i++;
            }
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addUser(String fullname, String username, String password, String address,String accessl, Farm farms)
    {
        int sessionId;
        try{
            SetOfUsers setofusers =new SetOfUsers();
             setofusers = (SetOfUsers) SerializationAndDeserialization.Deserialization("SetOfUsers.txt");
             
             int numberOfUsers = setofusers.lastElement().getSessionId();
             if(numberOfUsers == 0)
             {
                 sessionId = 1;
             }
            else
             {
                 
                 
                 
                sessionId = numberOfUsers+1;
                User aUser;
                AccessLevel accesslevel = null;
                
                 if (accessl == "FARMER") {
                     aUser = new User(fullname, username, password, address, sessionId, farms, accesslevel.FARMER);
                     setofusers.addUser(aUser);
                     SerializationAndDeserialization.Serialization("SetOfUsers.txt", setofusers);
                    JOptionPane.showMessageDialog(null, "Successfully Added");
                 }
                 else{
                     aUser = new User(fullname, username, password, address, sessionId, farms, accesslevel.FOOD_PROCESSOR);
                     setofusers.addUser(aUser);
                     SerializationAndDeserialization.Serialization("SetOfUsers.txt", setofusers);
                     JOptionPane.showMessageDialog(null, "Successfully Added");
                 }
                
                
          
                
             }
             
         } catch (IOException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
        
    }
    
    
    
}
