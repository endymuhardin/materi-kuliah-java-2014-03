package com.muhardin.endy.belajar.swing;

import javax.swing.JFrame;
import javax.swing.JDialog;

public class ContohFrame {
    public static void main( String[] args ) throws Exception {
        JFrame fr = new JFrame();
        fr.setTitle("Contoh Frame");
        fr.setSize(600,400);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JDialog dialog = new JDialog(fr);
        dialog.setModal(true);
        dialog.setTitle("Ini dialog");
        dialog.setSize(300,200);
        dialog.setLocationRelativeTo(fr);
        
        fr.setVisible(true);
        System.out.println("Tunggu 3 detik sebelum menampilkan dialog");
        
        // delay 3 detik
        Thread.sleep(3 * 1000);
        dialog.setVisible(true);
    }
}
