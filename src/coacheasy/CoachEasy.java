/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coacheasy;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author mabe6347
 */



public class CoachEasy extends JFrame {
    
    MainPanel panel = new MainPanel();
    
    public CoachEasy() {
        
        Container c = getContentPane();
        c.add(panel, BorderLayout.CENTER);
        
        setSize(400,400);
        setLocation(200,200);
        setVisible(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
    
    public static void main(String[] args) {
        CoachEasy window = new CoachEasy();
    }
    
}
