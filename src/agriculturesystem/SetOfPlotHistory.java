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
public class SetOfPlotHistory extends Vector<PlotHistory>{
    public SetOfPlotHistory()
    {
        super();
    }
    
    public void addPlotHistory(PlotHistory aPlotHistory) 
    {
        super.add(aPlotHistory);
    }
    
    public void removePlotHistory(PlotHistory aPlotHistory)
    {
        super.remove(aPlotHistory);
    }
}
