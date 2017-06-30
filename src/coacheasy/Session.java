/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coacheasy;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

/**
 *
 * @author mabe6347
 * 
 * Sessions are groups of Slots.
 */
public class Session extends JPanel {
    
    int i;
    Slot[] slotArray = new Slot[3];
    Slot slot;
    
    Slot slot2 = new Slot("Marklyft", 5, 2, 0.8);
    
    public Session(int inputNumberOfSlots) {
        
        GridBagLayout m = new GridBagLayout();
        setLayout(m);
        
        GridBagConstraints conSlot = new GridBagConstraints();
        conSlot.gridx = 0;
        conSlot.anchor = GridBagConstraints.NORTHWEST;
        conSlot.weighty = 1;
        conSlot.weightx = 1;
        
        
        
        for (i=0; i<inputNumberOfSlots; i++) {
            Slot slot = new Slot ("Marklyft", 5, 5, 0.8);
            slotArray[i] = slot;
            conSlot.gridy = i;
            m.setConstraints(slotArray[i], conSlot);
            add(slotArray[i]);
        }

    }
    
}
