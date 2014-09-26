package com.muhardin.endy.belajar.swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class ContohEventHandling {
    public static void main( String[] args ) throws Exception {
        JFrame fr = new JFrame();
        fr.setTitle("Contoh Event Handling");
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
        
        // pasang event handler
        MyActionHandler h = new MyActionHandler();
        btn1.addActionListener(h);
        btn2.addActionListener(h);
        btn3.addActionListener(h);
        btn4.addActionListener(h);
        btn5.addActionListener(h);
        
        btn1.addMouseListener(new MyMouseListener());
        
        fr.setLayout(new FlowLayout());
        fr.add(btn1);
        fr.add(btn2);
        fr.add(btn3);
        fr.add(btn4);
        fr.add(btn5);
        
        fr.pack();
    }
    
    static class MyActionHandler implements ActionListener {
        public void actionPerformed(ActionEvent evt){
            JButton sumber = (JButton) evt.getSource();
            System.out.println("Label : "+sumber.getLabel());
        }
    }
    
    static class MyMouseListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e){
            JButton sumber = (JButton) e.getSource();
            
            System.out.println("Sumber event : "+sumber.getLabel());
            String tombol = "Kiri";
            if(MouseEvent.BUTTON1 == e.getButton()){
                tombol = "Kiri";
            }
            
            if(MouseEvent.BUTTON2 == e.getButton()){
                tombol = "Tengah";
            }
            
            if(MouseEvent.BUTTON3 == e.getButton()){
                tombol = "Kanan";
            }
            
            System.out.println("Tombol "+tombol+" ditekan");
        }
    }
}
