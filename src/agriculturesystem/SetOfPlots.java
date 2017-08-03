/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculturesystem;

import java.util.Vector;

/**
 *
 * @author Punnajee
 */
public class SetOfPlots extends Vector<Plot> {
    public SetOfPlots()
    {
        super();
    }
    
    public void addPlot(Plot aPlot) 
    {
        super.add(aPlot);
    }
    
    public void removePlot(Plot aPlot)
    {
        super.remove(aPlot);
    }
}
