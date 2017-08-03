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
public class Sensor {
    GPSCoord location;
    boolean enabled;
    long frequency;
    String lastCheck;
    int sensorID;
    SensorType sensorType;
    SensorReader sensorReader;
    FieldStation fieldStation;

    public Sensor(GPSCoord location, boolean enabled, long frequency, String lastCheck, int sensorID, SensorType sensorType, SensorReader sensorReader, FieldStation fieldStation) {
        this.location = location;
        this.enabled = enabled;
        this.frequency = frequency;
        this.lastCheck = lastCheck;
        this.sensorID = sensorID;
        this.sensorType = sensorType;
        this.sensorReader = sensorReader;
        this.fieldStation = fieldStation;
    }

    public GPSCoord getLocation() {
        return location;
    }

    public void setLocation(GPSCoord location) {
        this.location = location;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public long getFrequency() {
        return frequency;
    }

    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }

    public String getLastCheck() {
        return lastCheck;
    }

    public void setLastCheck(String lastCheck) {
        this.lastCheck = lastCheck;
    }

    public int getSensorID() {
        return sensorID;
    }

    public void setSensorID(int sensorID) {
        this.sensorID = sensorID;
    }

    public SensorType getSensorType() {
        return sensorType;
    }

    public void setSensorType(SensorType sensorType) {
        this.sensorType = sensorType;
    }

    public SensorReader getSensorReader() {
        return sensorReader;
    }

    public void setSensorReader(SensorReader sensorReader) {
        this.sensorReader = sensorReader;
    }

    public FieldStation getFieldStation() {
        return fieldStation;
    }

    public void setFieldStation(FieldStation fieldStation) {
        this.fieldStation = fieldStation;
    }
    
    
}
