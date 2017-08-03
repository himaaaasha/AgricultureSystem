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
public class SetOfGPSCoords extends Vector<GPSCoord>{
    public SetOfGPSCoords()
    {
        super();
    }
    
    public void addGPSCoords(GPSCoord aGPSCoord) 
    {
        super.add(aGPSCoord);
    }
    
    public void removeGPSCoord(GPSCoord aGPSCoord)
    {
        super.remove(aGPSCoord);
    }
}
