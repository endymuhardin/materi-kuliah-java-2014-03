package com.muhardin.endy.belajar.android.demosqlite;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaDao extends SQLiteOpenHelper {
    private static final Integer VERSI_DATABASE = 1;
    private static final String NAMA_DATABASE = "dbmahasiswa";

    private static final String SQL_CREATE_TABLE
        = "create table mahasiswa (" +
        " _id INT PRIMARY KEY, " +
        " nama TEXT, " +
        " email TEXT )";
        
    public MahasiswaDao(Context context) {
        super(context, NAMA_DATABASE, null, VERSI_DATABASE);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("MahasiswaDao", "Menjalankan SQL CREATE TABLE");
        Log.v("MahasiswaDao", "SQL : " + SQL_CREATE_TABLE);
        db.execSQL(SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // kosong saja, karena aplikasi versi pertama
    }

    public List<Mahasiswa> semuaMahasiswa() {
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.query(
                "mahasiswa", // nama tabel
                new String[]{ // nama kolom
                        "_id",
                        "nama",
                        "email"
                },
                null, null, null, null, null
        );

        List<Mahasiswa> hasil = new ArrayList<>();
        while (c.moveToNext()){
            Mahasiswa m = new Mahasiswa();
            m.set_id(c.getInt(0));
            m.setNama(c.getString(1));
            m.setEmail(c.getString(2));
            hasil.add(m);
        }
        db.close();
        return hasil;
    }
}
