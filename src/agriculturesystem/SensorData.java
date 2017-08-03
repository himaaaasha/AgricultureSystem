/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;

/**
 *
 * @author Himasha Harinda
 */
public class SensorData {
    GPSCoord sensorLoc;
    String DateTime;
    int sensorID;
    double rawData;
    SensorType sensorType;

    public SensorData(GPSCoord sensorLoc, String DateTime, int sensorID, double rawData, SensorType sensorType) {
        this.sensorLoc = sensorLoc;
        this.DateTime = DateTime;
        this.sensorID = sensorID;
        this.rawData = rawData;
        this.sensorType = sensorType;
    }

    public GPSCoord getSensorLoc() {
        return sensorLoc;
    }

    public void setSensorLoc(GPSCoord sensorLoc) {
        this.sensorLoc = sensorLoc;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    public int getSensorID() {
        return sensorID;
    }

    public void setSensorID(int sensorID) {
        this.sensorID = sensorID;
    }

    public double getRawData() {
        return rawData;
    }

    public void setRawData(double rawData) {
        this.rawData = rawData;
    }

    public SensorType getSensorType() {
        return sensorType;
    }

    public void setSensorType(SensorType sensorType) {
        this.sensorType = sensorType;
    }
    
    
}
