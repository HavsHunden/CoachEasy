/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coacheasy;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mabe6347
 * 
 * Weeks are made up of multiple sessions. For the time being, each session
 * represents a real world day. 
 */
public class Week extends JPanel {
    
    int i;
    Session[] sessionArray = new Session[2];
    Session session;
    JLabel title; //Title is the headline at the start of the week, the number.
    
    public Week(int inputNumerOfSessions) {
        
        GridBagLayout m = new GridBagLayout();
        setLayout(m);
        
        GridBagConstraints conSession = new GridBagConstraints();
        conSession.gridx = 0;
        conSession.gridy = 0;
        conSession.anchor = GridBagConstraints.NORTHWEST;
        conSession.weighty = 1;
        conSession.weightx = 1;
        
        title = new JLabel("Week 1");
        
        add(title);
        
        for (i=0; i<inputNumerOfSessions; i++) {
            session = new Session (4);
            sessionArray[i] = session;
            conSession.gridy++;
            m.setConstraints(sessionArray[i], conSession);
            add(sessionArray[i]);
        }
        
    }
    
}
