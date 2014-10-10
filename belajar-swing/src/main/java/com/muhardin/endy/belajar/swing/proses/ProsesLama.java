package com.muhardin.endy.belajar.swing.proses;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ProgressMonitor;

public class ProsesLama {
    
    public Integer jalankan(ProgressMonitor monitor){
        int perulangan = 10;
        
        Random r = new Random();
        
        Integer totalWaktu = 0;
        
        for(int i=0; i<perulangan; i++){
            try {
                int delay = r.nextInt(10);
                
                totalWaktu += delay;
                
                Thread.sleep(delay * 1000);
                System.out.println("Perulangan ke "+ (i+1));

                int progress = (i+1) * 10;
                monitor.setProgress(progress);
                monitor.setNote("Progress : "+ progress + "%");
            } catch (InterruptedException ex) {
                Logger.getLogger(ProsesLama.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return totalWaktu;
    }
}
