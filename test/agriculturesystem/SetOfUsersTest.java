/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;

import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hmowl
 */
public class SetOfUsersTest {
      private static User[] users;
    
    private SetOfUsers instance;
    
    
    public SetOfUsersTest() {
    }
    
    @BeforeClass
    public static void setUpClass(AccessLevel Farmer) {
          users = new User[3];
       //fullname,username,password,address,sessionId,farms,accesslevel
        users[0] = new User("Sahan", "Perera", "12345", "Kandy", 1, null, Farmer);
        users[1] = new User("Himasha", "Harinda", "123322", "Colombo", 2, null, Farmer);
        users[2] = new User("Bagya", "Anjalo", "qwerty", "Kandy", 3, null, Farmer);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         instance = new SetOfUsers();
        for(int i = 0; i < users.length; ++i) {
            instance.addUser(users[i]);
    }
    }
    @After
    public void tearDown() {
    }

    /**
     * Test of addUser method, of class SetOfUsers.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        User aUser = null;
        SetOfUsers instance = new SetOfUsers();
        instance.addUser(aUser);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class SetOfUsers.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        User aUser = null;
        SetOfUsers instance = new SetOfUsers();
        instance.removeUser(aUser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test(expected=NullPointerException.class)
    public void testLoaduser() {
        System.out.println("loaduser");
        SetOfUsers users = null;
        JTable jt = null;
        SetOfUsers instance = new SetOfUsers();
        instance.loaduser(users, jt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
