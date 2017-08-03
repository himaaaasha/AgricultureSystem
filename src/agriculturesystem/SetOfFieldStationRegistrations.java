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
public class SetOfFieldStationRegistrations extends Vector<FieldStationRegistration> {
    public SetOfFieldStationRegistrations()
    {
        super();
    }
    
    public void addFieldStationRegistration(FieldStationRegistration aFieldStationRegistration) 
    {
        super.add(aFieldStationRegistration);
    }
    
    public void removeFieldStationRegistration(FieldStationRegistration aFieldStationRegistration)
    {
        super.remove(aFieldStationRegistration);
    }
}
