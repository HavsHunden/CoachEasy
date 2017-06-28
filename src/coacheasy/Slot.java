/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coacheasy;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author mabe6347
 */
public class Slot extends JPanel {
    Line line = new Line();
    
    int primaryIntensity;
    int primaryReps;
    int primarySets;
    int warmups;
    
    
    //This is for complimentary excercises, it takes only type, sets and reps.
    public Slot (String inputtype, int inputPrimarySets, int inputPrimaryReps) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        Dimension d = new Dimension(100,100);
        
        
        line.setAlignmentX(TOP_ALIGNMENT);
        line.setAlignmentY(TOP_ALIGNMENT);
        line.setMaximumSize(d);
        line.setType(inputtype);
        add(line);
    }
    
    //This is for intensity controlled excercises
    public Slot (String inputtype, int inputPrimarySets, int inputPrimaryReps, int inputPrimaryIntensity) {
        
        
    }
    
    
}
