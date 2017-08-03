/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;

import java.util.Vector;

/**
 *
 * @author Himasha Harinda
 */
public class SetOfFields extends Vector<Field>{
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
}
