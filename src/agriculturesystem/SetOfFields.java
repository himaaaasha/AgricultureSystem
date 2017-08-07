/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;

import SerializationAndDeserialization.SerializationAndDeserialization;
import agriculturesystemUI.farms;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Himasha Harinda
 */
public class SetOfFields extends Vector<Field>{
    private static final long serialVersionUID = 3981788007097468721L;
    public SetOfFields()
    {
        super();
    }
    
    public void addField(Field aField) 
    {
        super.add(aField);
    }
    
    public void removeField(Field aField)
    {
        super.remove(aField);
    }
    
    public void saveField(String farmListSelected, Long fieldAreaLat, Long fieldAreaLong, String FieldName)
    {
        
        GPSCoord gpscoord = new GPSCoord(0, 0) ;
        SetOfPlots setofplots = new SetOfPlots();
        SetOfFarms setoffarms = new SetOfFarms();
        SetOfFields setOfFields = new SetOfFields();
        try {
            
            setoffarms = (SetOfFarms) SerializationAndDeserialization.Deserialization("SetOfFarms.txt");
            for(int i=0;i<setoffarms.size();i++)
            {
                if(farmListSelected.equals(setoffarms.elementAt(i).getName()))
                {
                    int farmId = setoffarms.elementAt(i).getFarmId();
                    
                    //if(setoffarms.elementAt(farmId).getFields().size()==0)
                    //{
                    int fieldId = 1;
                    //}
                    //else
                    //{
                        //fieldId = setoffarms.elementAt(farmId).getFields().size()+1;
                        gpscoord.setLat(fieldAreaLat);
                        gpscoord.setLng(fieldAreaLong);
                        Area area = new Area(gpscoord);
                        
                        Field field = new Field(fieldId, FieldName, setofplots, area);
                        setOfFields.addField(field);
                        setoffarms.elementAt(farmId).setFields(setOfFields);
                        SerializationAndDeserialization.Serialization("SetOfFarms.txt", setoffarms);
                        JOptionPane.showMessageDialog(null, "Successfully Added");
                        
                        
                    //}
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(farms.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(farms.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
