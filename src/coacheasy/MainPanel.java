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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author mabe6347
 */
public class MainPanel extends JPanel{
    
    Session session1 = new Session(2);
    
    public MainPanel() {
        
        GridBagLayout m = new GridBagLayout();
        setLayout(m);
        
        GridBagConstraints conSession;
        conSession = new GridBagConstraints();
        
        conSession.gridy = 0;
        conSession.gridx = 0;
        conSession.anchor = GridBagConstraints.NORTHWEST;
        conSession.weighty = 1;
        conSession.weightx = 1;
        m.setConstraints(session1, conSession);        
        add(session1); 
    }
    
    
    public void paintComponent (Graphics g) {
        g.setColor( Color.white );
        g.fillRect( 0, 0, 400, 400);
        //text.paintComponents(g);
    }
}
