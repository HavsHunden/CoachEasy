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
 * @author mabe6347
 */
public class MainPanel extends JPanel {
    
    public MainPanel() {
    
    }
    
    public void paintComponent (Graphics g) {
        g.setColor( Color.black );
        g.fillRect( 0, 0, 400, 400);
    }
}
