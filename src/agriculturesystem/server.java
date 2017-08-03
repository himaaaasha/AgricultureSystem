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
public class server {
    SetOfFieldStationRegistrations registeredFieldStations;
    SetOfSensorRegistrations sensors;
    DataManagement dataManager;

    public server(SetOfFieldStationRegistrations registeredFieldStations, SetOfSensorRegistrations sensors, DataManagement dataManager) {
        this.registeredFieldStations = registeredFieldStations;
        this.sensors = sensors;
        this.dataManager = dataManager;
    }

    public SetOfFieldStationRegistrations getRegisteredFieldStations() {
        return registeredFieldStations;
    }

    public void setRegisteredFieldStations(SetOfFieldStationRegistrations registeredFieldStations) {
        this.registeredFieldStations = registeredFieldStations;
    }

    public SetOfSensorRegistrations getSensors() {
        return sensors;
    }

    public void setSensors(SetOfSensorRegistrations sensors) {
        this.sensors = sensors;
    }

    public DataManagement getDataManager() {
        return dataManager;
    }

    public void setDataManager(DataManagement dataManager) {
        this.dataManager = dataManager;
    }
    
    
}
