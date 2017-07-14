/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coacheasy;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author martin
 */
public class RightClickPopup extends JPopupMenu {
    JMenuItem anItem;
    public RightClickPopup(String title){
        anItem = new JMenuItem(title);
        add(anItem);
    }
}
