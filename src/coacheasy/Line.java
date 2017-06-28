/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coacheasy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mabe6347
 */



public class Line extends JPanel {
    String type = "default";
    JLabel text = new JLabel(type);
    JLabel displayedRepsNSets;
    
    
    
    public Line(String inputType, int inputSets, int inputReps) {
        
        setLayout(new GridLayout(0, 2));
        
        
        text.setVerticalAlignment(JLabel.TOP);
        text.setHorizontalAlignment(JLabel.LEFT);
        add(text);
        
        displayedRepsNSets = new JLabel(inputSets + "x" + inputReps);
        
        displayedRepsNSets.setVerticalAlignment(JLabel.TOP);
        displayedRepsNSets.setHorizontalAlignment(JLabel.LEFT);
        add(displayedRepsNSets);
    }
    
    public void paintComponent (Graphics g) {
        g.setColor( Color.white );
        g.fillRect( 0, 0, 400, 400);
        //text.paintComponents(g);
    }
    
    public void setType (String inputtype) {
        text.setText(inputtype);
        
    }
    String movement;
    String movementtype;
    
    int reps;
    int sets;
    int weight;
    
    
}
