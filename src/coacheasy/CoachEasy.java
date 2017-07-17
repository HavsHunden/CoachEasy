/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coacheasy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 *
 * @author mabe6347
 */



public class CoachEasy extends JFrame {
    
    MainPanel panel = new MainPanel();
    JLabel text = new JLabel("test");
    int width = 800;
    int height = 800;
    JScrollPane scrollPane;
    
    public CoachEasy() {
        
        Container c = getContentPane();
        //c.add(panel, BorderLayout.CENTER);
        scrollPane = new JScrollPane(panel);
        c.add(scrollPane, BorderLayout.CENTER);
        
        setSize(width,height);
        setLocation(200,200);
        setVisible(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
    
    public static void main(String[] args) {
        CoachEasy window = new CoachEasy();
    }
    
}
