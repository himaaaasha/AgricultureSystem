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
public class Crop {
    String cropName;

    public Crop(String cropName) {
        this.cropName = cropName;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }
    
}
