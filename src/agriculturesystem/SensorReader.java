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
public class SensorReader {
    double readSensorData;

    public SensorReader(double readSensorData) {
        this.readSensorData = readSensorData;
    }

    public double getReadSensorData() {
        return readSensorData;
    }

    public void setReadSensorData(double readSensorData) {
        this.readSensorData = readSensorData;
    }
    
}
