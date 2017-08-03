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
public class Area {
    GPSCoord gpsPoints;

    public Area(GPSCoord gpsPoints) {
        this.gpsPoints = gpsPoints;
    }

    public GPSCoord getGpsPoints() {
        return gpsPoints;
    }

    public void setGpsPoints(GPSCoord gpsPoints) {
        this.gpsPoints = gpsPoints;
    }
    
}
