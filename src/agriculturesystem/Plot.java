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
public class Plot {
    Area area;
    SetOfSensorData sensorData;
    PlotState plotState;
    Crop currentCrop;
    SetOfPlotHistory history;

    public Plot(Area area, SetOfSensorData sensorData, PlotState plotState, Crop currentCrop, SetOfPlotHistory history) {
        this.area = area;
        this.sensorData = sensorData;
        this.plotState = plotState;
        this.currentCrop = currentCrop;
        this.history = history;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public SetOfSensorData getSensorData() {
        return sensorData;
    }

    public void setSensorData(SetOfSensorData sensorData) {
        this.sensorData = sensorData;
    }

    public PlotState getPlotState() {
        return plotState;
    }

    public void setPlotState(PlotState plotState) {
        this.plotState = plotState;
    }

    public Crop getCurrentCrop() {
        return currentCrop;
    }

    public void setCurrentCrop(Crop currentCrop) {
        this.currentCrop = currentCrop;
    }

    public SetOfPlotHistory getHistory() {
        return history;
    }

    public void setHistory(SetOfPlotHistory history) {
        this.history = history;
    }
    
}
