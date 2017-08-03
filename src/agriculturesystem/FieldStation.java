/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;

/**
 *
 * @author Punnajee
 */
public class FieldStation {
    SetOfSensors sensors;
    GPSCoord location;
    MobileNetwork connectedMobileNetwork;
    String uniquePhoneNumber;
    String setUpSecretKey;
    SetOfSensorData syncSensorData;
    String lastSyncTime;
    FieldClock fieldClock;

    public FieldStation(SetOfSensors sensors, GPSCoord location, MobileNetwork connectedMobileNetwork, String uniquePhoneNumber, String setUpSecretKey, SetOfSensorData syncSensorData, String lastSyncTime, FieldClock fieldClock) {
        this.sensors = sensors;
        this.location = location;
        this.connectedMobileNetwork = connectedMobileNetwork;
        this.uniquePhoneNumber = uniquePhoneNumber;
        this.setUpSecretKey = setUpSecretKey;
        this.syncSensorData = syncSensorData;
        this.lastSyncTime = lastSyncTime;
        this.fieldClock = fieldClock;
    }

    public SetOfSensors getSensors() {
        return sensors;
    }

    public void setSensors(SetOfSensors sensors) {
        this.sensors = sensors;
    }

    public GPSCoord getLocation() {
        return location;
    }

    public void setLocation(GPSCoord location) {
        this.location = location;
    }

    public MobileNetwork getConnectedMobileNetwork() {
        return connectedMobileNetwork;
    }

    public void setConnectedMobileNetwork(MobileNetwork connectedMobileNetwork) {
        this.connectedMobileNetwork = connectedMobileNetwork;
    }

    public String getUniquePhoneNumber() {
        return uniquePhoneNumber;
    }

    public void setUniquePhoneNumber(String uniquePhoneNumber) {
        this.uniquePhoneNumber = uniquePhoneNumber;
    }

    public String getSetUpSecretKey() {
        return setUpSecretKey;
    }

    public void setSetUpSecretKey(String setUpSecretKey) {
        this.setUpSecretKey = setUpSecretKey;
    }

    public SetOfSensorData getSyncSensorData() {
        return syncSensorData;
    }

    public void setSyncSensorData(SetOfSensorData syncSensorData) {
        this.syncSensorData = syncSensorData;
    }

    public String getLastSyncTime() {
        return lastSyncTime;
    }

    public void setLastSyncTime(String lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
    }

    public FieldClock getFieldClock() {
        return fieldClock;
    }

    public void setFieldClock(FieldClock fieldClock) {
        this.fieldClock = fieldClock;
    }
    
    
}
