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
 * 
 * A slotGhost is the rectangle formed when a slot is being dragged.
 */
public class SlotGhost extends JPanel {
    
    Slot workedSlot;
    int lineheight;
    int numberOfLines;
    
    //Position
    int x,y;
    
    int width, height;
    
    public SlotGhost(Slot inputSlot, int mouseX, int mouseY) {
        
        x = mouseX;
        y = mouseY;
        workedSlot = inputSlot;
        numberOfLines = workedSlot.warmups +1;
        
        width = 100;
        height = 20*numberOfLines;
        
    }
    
    public void changePosition (int newX, int newY) {
        
        x = x+newX;
        y = y+newY;
        
        
    }
    
    @Override
    public void paintComponent (Graphics g) {
    g.setColor(Color.black);

    g.drawRect(x, y, width, height);
    }
}
