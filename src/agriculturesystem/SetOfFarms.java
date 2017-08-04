/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;

import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Himasha Harinda
 */
public class SetOfFarms extends Vector<Farm>{
    public SetOfFarms()
    {
        super();
    }
    
    public void addFarm(Farm aFarm) 
    {
        super.add(aFarm);
    }
    
    public void removeFarm(Farm aFarm)
    {
        super.remove(aFarm);
    }
    
     public void loadFarm(SetOfFarms farm, JTable jt){    //done
      for(Farm aFarm:farm){
          //create an vector list
          Vector row = new Vector(); 
          //Creating a defaultTableModel object to get data from class.
          //JTable.getModel() is returning correct class type.
          DefaultTableModel dtm = (DefaultTableModel)jt.getModel();
          //add element to the vector list
          row.add(aFarm.getName());
          row.add(aFarm.getArea());
         
          
          
          dtm.addRow(row);
          jt.setModel(dtm);
      }
  }
    
    
}
