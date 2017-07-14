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
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;


/**
 *
 * @author mabe6347
 */
public class MainPanel extends JPanel implements MouseInputListener {
    
    Week week = new Week(2);
    
    int width = 800;
    int height = 800;
    
    public Color panelColor = Color.white;
    
    public MainPanel() {
        
        addMouseListener(this);
        
        GridBagLayout m = new GridBagLayout();
        setLayout(m);
        
        GridBagConstraints conWeek;
        conWeek = new GridBagConstraints();
        
        conWeek.gridy = 0;
        conWeek.gridx = 0;
        conWeek.anchor = GridBagConstraints.NORTHWEST;
        conWeek.weighty = 1;
        conWeek.weightx = 1;
        m.setConstraints(week, conWeek);        
        add(week); 
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        
        this.panelColor = Color.BLACK;
        this.repaint();
        
        eventOutput("Mouse pressed (# of clicks: "
                + e.getClickCount() + ")", e);
    }
    
    public void mouseReleased(MouseEvent e) {
        eventOutput("Mouse released (# of clicks: "
                + e.getClickCount() + ")", e);
    }
    
    public void mouseEntered(MouseEvent e) {
        eventOutput("Mouse entered", e);
    }
    
    public void mouseExited(MouseEvent e) {
        eventOutput("Mouse exited", e);
    }
    
    public void mouseClicked(MouseEvent e) {
        eventOutput("Mouse clicked (# of clicks: "
                + e.getClickCount() + ")", e);
    }
    
    void eventOutput(String eventDescription, MouseEvent e) {
        
    }
    
    public void paintComponent (Graphics g) {
        g.setColor(panelColor);
        g.fillRect( 0, 0, width, height);
        //session1.slotArray[0].paintComponents(g);
        
        //text.paintComponents(g);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
