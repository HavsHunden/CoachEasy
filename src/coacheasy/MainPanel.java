/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coacheasy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author mabe6347
 */
public class MainPanel extends JPanel implements ActionListener {
    
    JTextField input = new JTextField();
    Line line = new Line();
    Line line2 = new Line();
    
    String inputtext;
    
    public MainPanel() {
        
        //test
        
        setLayout(new GridLayout(0, 1));
        
        input.setAlignmentX(TOP_ALIGNMENT);
        input.setAlignmentY(TOP_ALIGNMENT);
        input.addActionListener(this);
        
        add(input);
        
        line.setAlignmentX(TOP_ALIGNMENT);
        line.setAlignmentY(TOP_ALIGNMENT);
        add(line);
        
        line2.setAlignmentX(TOP_ALIGNMENT);
        line2.setAlignmentY(TOP_ALIGNMENT);
        add(line2);
    
    }
    
    public void actionPerformed(ActionEvent evt) {
        inputtext = input.getText();
        line.text.setText(inputtext);
        line2.text.setText(inputtext);
        
    }
    
    public void paintComponent (Graphics g) {
        g.setColor( Color.white );
        g.fillRect( 0, 0, 400, 400);
        //text.paintComponents(g);
    }
}
