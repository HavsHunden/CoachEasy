/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coacheasy;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author martin
 */
public class InvisiblePane extends JPanel {
    
    int width = 800;
    int height = 800;
    SlotGhost ghost;
    
    public InvisiblePane(Slot inputSlot, int mouseX, int mouseY) {
        
        System.out.println("pane constructor");
        ghost = new SlotGhost(inputSlot, mouseX, mouseY);
        
    }

    
    @Override
    public void paintComponent (Graphics g) {
        g.fillRect( 0, 0, width, height );
        ghost.paintComponent(g);
        
    }
}
