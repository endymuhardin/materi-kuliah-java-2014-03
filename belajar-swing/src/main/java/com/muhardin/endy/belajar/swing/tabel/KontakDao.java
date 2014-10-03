package com.muhardin.endy.belajar.swing.tabel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KontakDao {
    public List<Kontak> cariSemua(){
        try {
            List<Kontak> hasil = new ArrayList<Kontak>();
            
            Kontak k = new Kontak();
            k.setId(1);
            k.setNama("Endy Muhardin");
            k.setTanggalLahir(new Date());
            k.setAktif(Boolean.TRUE);
            hasil.add(k);
            
            Kontak k2 = new Kontak();
            k2.setId(2);
            k2.setNama("Jimmy Rengga");
            k2.setTanggalLahir(new SimpleDateFormat("yyyy-MM-dd").parse("1945-08-17"));
            k2.setAktif(Boolean.FALSE);
            hasil.add(k2);
            
            
            return hasil;
        } catch (ParseException ex) {
            Logger.getLogger(KontakDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
