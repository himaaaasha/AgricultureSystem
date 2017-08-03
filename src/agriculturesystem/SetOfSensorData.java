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
public class SetOfSensorData extends Vector<SensorData>{
    public SetOfSensorData()
    {
        super();
    }
    
    public void addSensorData(SensorData aSensorData) 
    {
        super.add(aSensorData);
    }
    
    public void removeSensorData(SensorData aSensorData)
    {
        super.remove(aSensorData);
    }
}
