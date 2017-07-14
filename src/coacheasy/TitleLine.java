/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coacheasy;

import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.event.MouseInputListener;

/**
 *
 * @author martin
 */
public class TitleLine extends JLabel implements MouseInputListener{
    
    
    
    public TitleLine(String text) {
        super(text);
        
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == 3) {
            RightClickPopup menu = new RightClickPopup("Add a slot...");
            menu.show(e.getComponent(), e.getX(), e.getY());

        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
    
    
}
