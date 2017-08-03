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
public class PlotHistory {
    String startTime;
    String endTime;
    Double yeildKG;
    Crop crop;

    public PlotHistory(String startTime, String endTime, Double yeildKG, Crop crop) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.yeildKG = yeildKG;
        this.crop = crop;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Double getYeildKG() {
        return yeildKG;
    }

    public void setYeildKG(Double yeildKG) {
        this.yeildKG = yeildKG;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }
    
}
