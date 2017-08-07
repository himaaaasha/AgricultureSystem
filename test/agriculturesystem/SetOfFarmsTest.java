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
public class SetOfFarmsTest {
    
    public SetOfFarmsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addFarm method, of class SetOfFarms.
     */
    @Test
    public void testAddFarm() {
        System.out.println("addFarm");
        Farm aFarm = null;
        SetOfFarms instance = new SetOfFarms();
        instance.addFarm(aFarm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFarm method, of class SetOfFarms.
     */
    @Test
    public void testRemoveFarm() {
        System.out.println("removeFarm");
        Farm aFarm = null;
        SetOfFarms instance = new SetOfFarms();
        instance.removeFarm(aFarm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadFarm method, of class SetOfFarms.
     */
    @Test
    public void testLoadFarm() {
        System.out.println("loadFarm");
        SetOfFarms farm = null;
        JTable jt = null;
        SetOfFarms instance = new SetOfFarms();
        instance.loadFarm(farm, jt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
