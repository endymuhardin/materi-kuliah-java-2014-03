package com.muhardin.endy.belajar.swing.tabel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KontakDao {

    private Connection koneksi;

    private void connect() {
        try {
            String dbDriver = "com.mysql.jdbc.Driver";
            String dbUrl = "jdbc:mysql://localhost/belajar";
            String dbUsername = "root";
            String dbPassword = "admin";

            Class.forName(dbDriver);
            koneksi = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (Exception ex) {
            Logger.getLogger(KontakDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void disconnect() {
        try {
            koneksi.close();
        } catch (SQLException ex) {
            Logger.getLogger(KontakDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Kontak> cariSemua() {
        List<Kontak> hasil = new ArrayList<Kontak>();
        try {
            
            String sql = "select * from kontak order by nama";
            
            connect();
            ResultSet rs = koneksi.prepareStatement(sql).executeQuery();
            
            while (rs.next()) {
                Kontak k = konversiResultSetJadiKontak(rs);
                hasil.add(k);
            }
            disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(KontakDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
    
    public List<Kontak> cariByNama(String nama) {
        List<Kontak> hasil = new ArrayList<Kontak>();
        try {
            
            String sql = "select * from kontak where nama like ? order by nama";
            
            connect();
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setString(1, "%"+nama+"%");
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Kontak k = konversiResultSetJadiKontak(rs);
                hasil.add(k);
            }
            disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(KontakDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }

    private Kontak konversiResultSetJadiKontak(ResultSet rs) throws SQLException {
        Kontak k = new Kontak();

        k.setId(rs.getInt("id"));
        k.setNama(rs.getString("nama"));
        k.setTanggalLahir(new Date(rs.getDate("tanggal_lahir").getTime()));
        k.setAktif(rs.getBoolean("aktif"));

        return k;
    }
}
