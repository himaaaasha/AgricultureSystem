/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;

import java.util.Vector;

/**
 *
 * @author Punnajee
 */
public class SetOfSensors extends Vector<Sensor> {
    public SetOfSensors()
    {
        super();
    }
    
    public void addSensor(Sensor aSensor) 
    {
        super.add(aSensor);
    }
    
    public void removeSensor(Sensor aSensor)
    {
        super.remove(aSensor);
    }
}
