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
import javax.swing.JPanel;


/**
 *
 * @author mabe6347
 */
public class MainPanel extends JPanel{
    
    Week week = new Week(1);
    
    public MainPanel() {
        
        GridBagLayout m = new GridBagLayout();
        setLayout(m);
        
        GridBagConstraints conWeek;
        conWeek = new GridBagConstraints();
        
        conWeek.gridy = 0;
        conWeek.gridx = 0;
        conWeek.anchor = GridBagConstraints.NORTHWEST;
        conWeek.weighty = 1;
        conWeek.weightx = 1;
        m.setConstraints(week, conWeek);        
        add(week); 
    }
    
    
    public void paintComponent (Graphics g) {
        g.setColor( Color.white );
        g.fillRect( 0, 0, 400, 400);
        //session1.slotArray[0].paintComponents(g);
        
        //text.paintComponents(g);
    }
}
