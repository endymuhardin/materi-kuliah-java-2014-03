package com.muhardin.endy.belajar.swing.tabel;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class KontakTabelModel extends AbstractTableModel {

    private List<Kontak> dataKontak;

    public List<Kontak> getData(){
        return dataKontak;
    }
    
    public KontakTabelModel(List<Kontak> dataKontak) {
        this.dataKontak = dataKontak;
    }
    
    public int getRowCount() {
        return dataKontak.size();
    }

    public int getColumnCount() {
        return 3;
    }

    public Object getValueAt(int baris, int kolom) {
        Kontak k = dataKontak.get(baris);
        if(kolom == 0){
            return k.getNama();
        }
        if(kolom == 1){
            return k.getTanggalLahir();
        }
        if(kolom == 2){
            return k.getAktif();
        }
        return "undefined";
    }

    @Override
    public String getColumnName(int kolom) {
        if(kolom == 0){
            return "Nama";
        }
        if(kolom == 1){
            return "Tanggal Lahir";
        }
        if(kolom == 2){
            return "Aktif";
        }
        return "undefined";
    }
    
    
}
