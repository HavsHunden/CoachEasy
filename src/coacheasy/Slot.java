/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coacheasy;

import com.opencsv.CSVReader;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.io.FileReader;
import java.lang.reflect.Field;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

/**
 *
 * @author mabe6347
 * 
 * Slots are one group of Lines consisting of one type of movement.
 * There are two types of slots represented as constructors - complimentary
 * and intensity controlled.
 */
public class Slot extends JPanel implements MouseInputListener {
    Line line;
    Line warmupline;
    
    double primaryIntensity;
    int primaryReps;
    int primarySets;
    int warmups = 0;
    
    String name;
    String colorData;
    Color color;
    int serialNumber;
    int slotFormSerial;
    
    GridBagConstraints conLine;
    GridBagLayout m;
    
    //This is for complimentary excercises, it takes only type, sets and reps.
    public Slot (int excNumber, int inputPrimarySets, int inputPrimaryReps) throws Exception {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        Dimension d = new Dimension(300,20);
        
        serialNumber = excNumber;
        setExercise();
        
        
        line = new Line(name, inputPrimarySets, inputPrimaryReps, color);
        
        line.setAlignmentX(TOP_ALIGNMENT);
        line.setAlignmentY(TOP_ALIGNMENT);
        line.setMaximumSize(d);
        line.setType(name);
        add(line);
    }
    
    //This is for intensity controlled excercises
    //public Slot (int excNumber, int inputPrimarySets, int inputPrimaryReps, double inputPrimaryIntensity) throws Exception {
    public Slot (int excNumber, int inputSlotFormSerial) throws Exception {    
        
        slotFormSerial = inputSlotFormSerial;
        
        setSlotForm();
        
        serialNumber = excNumber;
        
        setExercise();
        
        
        //Calculating how many warmups we need
        
        warmups = (int) Math.round((primaryIntensity-0.5)*10);
        
        //Fixing the GridBagLayout, using the same for all lines
        m = new GridBagLayout();
        setLayout(m);
        
        conLine = new GridBagConstraints();
        
        conLine.gridy = 0;
        conLine.gridx = 0;
        conLine.anchor = GridBagConstraints.NORTHWEST;
        conLine.weighty = 1;
        conLine.weightx = 1;
        
        //Creating the warmup lines
        createWarmups();

        //Creating the primary line
        conLine.gridy = warmups;
        line = new Line(name, primarySets, primaryReps, color);
        
        m.setConstraints(line, conLine);
        add(line);

        
    }
    
    public int getWarmups() {
        return warmups;
    }
    
    
    public void setSlotForm() throws Exception {
        
        CSVReader reader = new CSVReader(new FileReader("slotform.csv"), ',', '"', 1);
        String[] dataLine;
        while ((dataLine = reader.readNext()) != null) {
            if (Integer.parseInt(dataLine[0]) == slotFormSerial) {
                primarySets = Integer.parseInt(dataLine[1]);
                primaryReps = Integer.parseInt(dataLine[2]);
                primaryIntensity = Double.parseDouble(dataLine[3]);
            }
        }
    }
    
    //Contacs exercise database and effectively decides which exercise is done. 
    public void setExercise() throws Exception {
        
        CSVReader reader = new CSVReader(new FileReader("movements.csv"), ',', '"', 1);
        String[] dataLine;
        while ((dataLine = reader.readNext()) != null) {
            if (Integer.parseInt(dataLine[0]) == serialNumber) {
                name = dataLine[1];
                colorData = dataLine[3];
            }
        }
        try {
            Field field = Class.forName("java.awt.Color").getField(colorData);
            color = (Color) field.get(null);
        } catch (Exception e) {
            color = null; // Not defined
        }
    }
    
    
    //Creates the warmup lines
    public void createWarmups() {
        
        int i;
        for (i=0; i<warmups; i=i+1) {
            warmupline = new Line(name, 1, primaryReps+1, color);
            conLine.gridy = i;
            
            m.setConstraints(warmupline, conLine);
            add(warmupline);
        }
    }
    
    public void setColorBlue() {
        color = Color.BLUE;
    }
    
    public void paintComponent (Graphics g) {
        //None of this matters right now...
        
        //System.out.println(color);
//        if (null != color) switch (color) {
//            case "red":
//                g.setColor( Color.red );
//                break;
//            case "yellow":
//                g.setColor( Color.yellow );
//                break;
//        }
        //g.setColor( Color.red );
        //g.fillRect( 0, 0, 400, 400);
        //text.paintComponents(g);
    }

    @Override
    
    //This isnt working. Why?
    
    public void mouseClicked(MouseEvent e) {
        System.out.println("test");
        if (e.getButton() == 3) {
            RightClickOnSlot menu = new RightClickOnSlot("Edit slot...", this);
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