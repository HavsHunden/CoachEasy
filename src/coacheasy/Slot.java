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
import java.io.FileReader;
import java.lang.reflect.Field;
import static javafx.scene.paint.Color.color;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author mabe6347
 * 
 * Slots are one group of Lines consisting of one type of movement.
 * There are two types of slots represented as constructors - complimentary
 * and intensity controlled.
 */
public class Slot extends JPanel {
    Line line;
    Line warmupline;
    
    double primaryIntensity;
    int primaryReps;
    int primarySets;
    int warmups = 0;
    
    String name;
    String colorData;
    Color color;
    
    //This is for complimentary excercises, it takes only type, sets and reps.
    public Slot (String inputtype, int inputPrimarySets, int inputPrimaryReps) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        Dimension d = new Dimension(300,20);
        
        color = Color.LIGHT_GRAY;
        
        line = new Line(inputtype, inputPrimarySets, inputPrimaryReps, color);
        
        line.setAlignmentX(TOP_ALIGNMENT);
        line.setAlignmentY(TOP_ALIGNMENT);
        line.setMaximumSize(d);
        line.setType(inputtype);
        add(line);
    }
    
    //This is for intensity controlled excercises
    public Slot (int excNumber, int inputPrimarySets, int inputPrimaryReps, double inputPrimaryIntensity) throws Exception {
        
        //Getting data from database
        CSVReader reader = new CSVReader(new FileReader("data.csv"), ',', '"', 0);
        String[] dataLine;
        while ((dataLine = reader.readNext()) != null) {
            if (Integer.parseInt(dataLine[0]) == excNumber) {
                name = dataLine[1];
                colorData = dataLine[3];
                //System.out.println(color);
            }
        }
        
        try {
            Field field = Class.forName("java.awt.Color").getField(colorData);
            color = (Color) field.get(null);
        } catch (Exception e) {
            color = null; // Not defined
        }
        
        //Calculating how many warmups we need
        primaryIntensity = inputPrimaryIntensity;
        
        warmups = (int) Math.round((primaryIntensity-0.5)*10);
        
        //Fixing the GridBagLayout, using the same for all lines
        GridBagLayout m = new GridBagLayout();
        setLayout(m);
        
        GridBagConstraints conLine;
        conLine = new GridBagConstraints();
        
        conLine.gridy = 0;
        conLine.gridx = 0;
        conLine.anchor = GridBagConstraints.NORTHWEST;
        conLine.weighty = 1;
        conLine.weightx = 1;
        
        //Creating the warmup lines
        int i;
        for (i=0; i<warmups; i=i+1) {
            warmupline = new Line(name, 1, inputPrimaryReps+1, color);
            conLine.gridy = i;
            
            m.setConstraints(warmupline, conLine);
            add(warmupline);
        }

        //Creating the primary line
        conLine.gridy = warmups;
        line = new Line(name, inputPrimarySets, inputPrimaryReps, color);
        
        m.setConstraints(line, conLine);
        add(line);

        
    }
    
    public int getWarmups() {
        return warmups;
    }
    
    public void paintComponent (Graphics g) {
        //None of this matters right now...
        
        System.out.println(color);
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
    
}