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
    Line line2 = new Line();
    
    
    public Slot (String inputtype) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        Dimension d = new Dimension(100,100);
        
        
        line.setAlignmentX(TOP_ALIGNMENT);
        line.setAlignmentY(TOP_ALIGNMENT);
        line.setMaximumSize(d);
        line.setType(inputtype);
        add(line);
        
        line2.setAlignmentX(TOP_ALIGNMENT);
        line2.setAlignmentY(TOP_ALIGNMENT);
        line2.setMaximumSize(d);
        line2.setType(inputtype);
        add(line2);
    }
    
    
}
