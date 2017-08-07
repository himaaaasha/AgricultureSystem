/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;
import agriculturesystem.AirPressureReader;
import agriculturesystem.SoilTempReader;
import agriculturesystem.SoilAcidityReader;
import agriculturesystem.AirTempReader;

/**
 *
 * @author Himasha Harinda
 */
public class SensorReaderFactory {
    public static SensorReader geSensorReader(String type,double sensordata)
    {
        if ("AirPressureReader".equalsIgnoreCase(type)) {
            return new AirPressureReader(sensordata);
        }
        else if("SoilTempReader".equalsIgnoreCase(type))
        {
            return new SoilTempReader(sensordata);
        }
        else if("SoilAcidityReader".equalsIgnoreCase(type))
        {
            return new SoilAcidityReader(sensordata);
        }
        else if("AirTempReader".equalsIgnoreCase(type))
        {
            return new AirTempReader(sensordata);
        }
        
        return null;
        
    }
    
}
