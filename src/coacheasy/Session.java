/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coacheasy;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mabe6347
 * 
 * Sessions are groups of Slots.
 */
public class Session extends JPanel {
    
    int i;
    Slot[] slotArray = new Slot[4];
    Slot slot;
    JLabel title; //Title is the headline at the start of the slot, the day.
    JLabel spacer;
    
    public Session(int inputNumberOfSlots) {
        
        GridBagLayout m = new GridBagLayout();
        setLayout(m);
        
        GridBagConstraints conSlot = new GridBagConstraints();
        conSlot.gridx = 0;
        conSlot.gridy = 0;
        conSlot.anchor = GridBagConstraints.NORTHWEST;
        conSlot.weighty = 1;
        conSlot.weightx = 1;
        
        title = new JLabel("Monday");
        
        add(title);
        
        for (i=0; i<inputNumberOfSlots; i++) {
            try {
                Slot slot = new Slot (i+1, 1);
                slotArray[i] = slot;
                conSlot.gridy++;
                m.setConstraints(slotArray[i], conSlot);
                add(slotArray[i]);
            } catch (Exception ex) {
                Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        spacer = new JLabel(" ");
        conSlot.gridy++;
        m.setConstraints(spacer, conSlot);
        add(spacer);

    }
    
}
