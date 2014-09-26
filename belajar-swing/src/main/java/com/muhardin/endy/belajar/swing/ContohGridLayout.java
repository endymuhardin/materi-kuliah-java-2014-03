package com.muhardin.endy.belajar.swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class ContohGridLayout {
    public static void main( String[] args ) throws Exception {
        JFrame fr = new JFrame();
        fr.setTitle("Contoh Grid Layout");
        fr.setSize(600,400);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        initComponents(fr);
        
        fr.setVisible(true);
       
    }
    
    public static void initComponents(JFrame fr){
        JButton btn1 = new JButton("Button 1");
        JTextField btn2 = new JTextField("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        
        fr.setLayout(new GridLayout(2,3));
        fr.add(btn1);
        fr.add(btn2);
        fr.add(btn3);
        fr.add(btn4);
        fr.add(btn5);
        
        fr.pack();
    }
}
