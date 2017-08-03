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
public class SetOfSensorRegistrations extends Vector<SensorRegistration>{
    public SetOfSensorRegistrations()
    {
        super();
    }
    
    public void addSensorRegistration(SensorRegistration aSensorRegistration) 
    {
        super.add(aSensorRegistration);
    }
    
    public void removeSensorRegistration(SensorRegistration aSensorRegistration)
    {
        super.remove(aSensorRegistration);
    }
}
