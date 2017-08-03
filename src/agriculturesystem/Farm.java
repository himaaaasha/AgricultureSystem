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
public class Farm {
    int farmId;
    String name;
    Area area;
    SetOfFields fields;

    public Farm(int farmId, String name, Area area, SetOfFields fields) {
        this.farmId = farmId;
        this.name = name;
        this.area = area;
        this.fields = fields;
    }

    public int getFarmId() {
        return farmId;
    }

    public void setFarmId(int farmId) {
        this.farmId = farmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public SetOfFields getFields() {
        return fields;
    }

    public void setFields(SetOfFields fields) {
        this.fields = fields;
    }
    
    
}
