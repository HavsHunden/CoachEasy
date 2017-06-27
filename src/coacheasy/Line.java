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
    
    JLabel text = new JLabel("Marklyft 2x5");
    
    public Line() {
        
        setLayout(new GridLayout(1, 0));
        
        text.setVerticalAlignment(JLabel.TOP);
        text.setHorizontalAlignment(JLabel.LEFT);
        add(text);
    }
    
    public void paintComponent (Graphics g) {
        g.setColor( Color.white );
        g.fillRect( 0, 0, 400, 400);
        //text.paintComponents(g);
    }
    String movement;
    String movementtype;
    
    int reps;
    int sets;
    int weight;
    
    
}
