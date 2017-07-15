/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coacheasy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author martin
 */
public class RightClickOnSlot extends JPopupMenu implements ActionListener {
    JMenuItem anItem;
    Slot caller;
    
    public RightClickOnSlot(String title, Slot inputCaller){
        anItem = new JMenuItem(title);
        add(anItem);

        caller = inputCaller;
        anItem.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
