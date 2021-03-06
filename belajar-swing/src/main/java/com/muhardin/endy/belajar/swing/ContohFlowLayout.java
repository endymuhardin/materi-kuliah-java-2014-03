package com.muhardin.endy.belajar.swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class ContohFlowLayout {
    public static void main( String[] args ) throws Exception {
        JFrame fr = new JFrame();
        fr.setTitle("Contoh Flow Layout");
        fr.setSize(600,400);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        initComponents(fr);
        
        fr.setVisible(true);
       
    }
    
    public static void initComponents(JFrame fr){
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        
        fr.setLayout(new FlowLayout());
        fr.add(btn1);
        fr.add(btn2);
        fr.add(btn3);
        fr.add(btn4);
        fr.add(btn5);
        
        fr.pack();
    }
}
