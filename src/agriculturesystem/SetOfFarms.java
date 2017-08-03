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
public class SetOfFarms extends Vector<Farm>{
    public SetOfFarms()
    {
        super();
    }
    
    public void addFarm(Farm aFarm) 
    {
        super.add(aFarm);
    }
    
    public void removeFarm(Farm aFarm)
    {
        super.remove(aFarm);
    }
}
