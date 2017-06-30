/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coacheasy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author mabe6347
 * 
 * Slots are one group of Lines consisting of one type of movement.
 * There are two types of slots represented as constructors - complimentary
 * and intensity controlled.
 */
public class Slot extends JPanel {
    Line line;
    Line warmupline;
    
    double primaryIntensity;
    int primaryReps;
    int primarySets;
    int warmups = 0;
    
    
    //This is for complimentary excercises, it takes only type, sets and reps.
    public Slot (String inputtype, int inputPrimarySets, int inputPrimaryReps) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        Dimension d = new Dimension(300,20);
        
        line = new Line(inputtype, inputPrimarySets, inputPrimaryReps);
        
        line.setAlignmentX(TOP_ALIGNMENT);
        line.setAlignmentY(TOP_ALIGNMENT);
        line.setMaximumSize(d);
        line.setType(inputtype);
        add(line);
    }
    
    //This is for intensity controlled excercises
    public Slot (String inputtype, int inputPrimarySets, int inputPrimaryReps, double inputPrimaryIntensity) {
        
        
        //Calculating how many warmups we need
        primaryIntensity = inputPrimaryIntensity;
        
        warmups = (int) Math.round((primaryIntensity-0.5)*10);
        
        //Fixing the GridBagLayout, using the same for all lines
        GridBagLayout m = new GridBagLayout();
        setLayout(m);
        
        GridBagConstraints conLine;
        conLine = new GridBagConstraints();
        
        conLine.gridy = 0;
        conLine.gridx = 0;
        conLine.anchor = GridBagConstraints.NORTHWEST;
        conLine.weighty = 1;
        conLine.weightx = 1;
        
        //Creating the warmup lines
        int i;
        for (i=0; i<warmups; i=i+1) {
            warmupline = new Line(inputtype, 1, inputPrimaryReps+1);
            conLine.gridy = i;
            
            m.setConstraints(warmupline, conLine);
            add(warmupline);
        }

        //Creating the primary line
        conLine.gridy = warmups;
        line = new Line(inputtype, inputPrimarySets, inputPrimaryReps);
        
        m.setConstraints(line, conLine);
        add(line);

        
    }
    
    public int getWarmups() {
        return warmups;
    }
    
//    public void paintComponent (Graphics g) {
//        g.setColor( Color.red );
//        //g.fillRect( 0, 0, 400, 400);
//        //text.paintComponents(g);
//    }
    
}
