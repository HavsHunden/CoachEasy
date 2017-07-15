/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coacheasy;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
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
    ArrayList <Slot> slotArray = new ArrayList<Slot>();
    Slot slot;
    TitleLine title; //Title is the headline at the start of the slot, the day.
    JLabel spacer;
    int numberOfSlots;
    GridBagConstraints conSlot;
    GridBagLayout m;
    
    public Session(int inputNumberOfSlots) {
        
        numberOfSlots = inputNumberOfSlots;
        
        m = new GridBagLayout();
        setLayout(m);
        
        conSlot = new GridBagConstraints();
        conSlot.gridx = 0;
        conSlot.gridy = 0;
        conSlot.anchor = GridBagConstraints.NORTHWEST;
        conSlot.weighty = 1;
        conSlot.weightx = 1;
        
        title = new TitleLine("Monday", this);
        
        add(title);
        
        for (i=0; i<numberOfSlots; i++) {
            try {
                Slot slot = new Slot (i+1, 1);
                slotArray.add(slot);
                conSlot.gridy++;
                m.setConstraints(slotArray.get(i), conSlot);
                
                add(slotArray.get(i));
            } catch (Exception ex) {
                Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        spacer = new JLabel(" ");
        conSlot.gridy++;
        m.setConstraints(spacer, conSlot);
        add(spacer);

    }
    
    public void addSlot(int typeSerial, int slotForm) {
        try {
            
            Slot slot = new Slot(typeSerial, slotForm);
            
            slotArray.add(slot);
            conSlot.gridy++;
            m.setConstraints(slotArray.get(i), conSlot);
            
            remove(spacer);
            
            add(slotArray.get(numberOfSlots));
            numberOfSlots++;
            
            conSlot.gridy++;
            m.setConstraints(spacer, conSlot);
            add(spacer);
            
            
            revalidate();
            System.out.println(numberOfSlots);
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
