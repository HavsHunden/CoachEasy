/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coacheasy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author mabe6347
 */
public class MainPanel extends JPanel implements ActionListener {
    
    JTextField input = new JTextField();
    
    Slot slot = new Slot("Komplement", 5, 5);
    Slot slot2 = new Slot("Marklyft", 5, 2, 0.8);
    
    String inputtext;
    
    
    
    public MainPanel() {
        
        //test
        
        //setLayout(new GridLayout(0, 1));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        
        input.setAlignmentX(TOP_ALIGNMENT);
        input.setAlignmentY(TOP_ALIGNMENT);
        input.addActionListener(this);
        
        
        Dimension d = new Dimension(100,100);
        input.setMaximumSize(d);
        
        add(input);
        
        add(slot);
        add(slot2);
    
    }
    
    public void actionPerformed(ActionEvent evt) {
        inputtext = input.getText();
        slot.line.text.setText(inputtext);
        
    }
    
    public void paintComponent (Graphics g) {
        g.setColor( Color.white );
        g.fillRect( 0, 0, 400, 400);
        //text.paintComponents(g);
    }
}
