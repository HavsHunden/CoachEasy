/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coacheasy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mabe6347
 * 
 * Lines are groups of sets of either undefined or one particular intensity. 
 * Never different intensities.
 */



public class Line extends JPanel {
    String type = "default";
    JLabel text;
    JLabel displayedRepsNSets;

    //Construktor with GridBagLayout
    public Line(String inputType, int inputSets, int inputReps) {
        
        type = inputType;
        text = new JLabel(type);
        
        text.setBackground(Color.red);
        text.setOpaque(true);
        
        GridBagLayout m = new GridBagLayout();
        setLayout(m);
        
        //GridBagConstraints for the displaying of the exercise name
        GridBagConstraints conType;
        conType = new GridBagConstraints();
        
        conType.gridy = 0;
        conType.gridx = 0;
        conType.gridwidth = 5;
        conType.anchor = GridBagConstraints.WEST;
        conType.weightx = 1;
        
        m.setConstraints(text, conType);
        
        add(text);
        
        //GridBagConstraints for the displaying of sets and reps
        GridBagConstraints conSetReps;
        conSetReps = new GridBagConstraints();
        
        conSetReps.gridy = 0;
        conSetReps.gridx = 5;
        conSetReps.gridwidth = 10;
        conSetReps.weightx = 3;
        conSetReps.anchor = GridBagConstraints.WEST;
        
        displayedRepsNSets = new JLabel("     " + inputSets + "x" + inputReps);
        m.setConstraints(displayedRepsNSets, conSetReps);
        displayedRepsNSets.setBackground(Color.red);
        displayedRepsNSets.setOpaque(true);
        
        add(displayedRepsNSets);
    }
    
//    public void paintComponent (Graphics g) {
//        g.setColor( Color.white );
//        g.fillRect( 0, 0, 400, 400);
//        //text.paintComponents(g);
//    }
    
    public void setType (String inputtype) {
        text.setText(inputtype);
        
    }
    String movement;
    String movementtype;
    
    int reps;
    int sets;
    int weight;
    
    
}
