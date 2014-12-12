package com.muhardin.endy.belajar.android.demosqlite;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

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

    public MahasiswaDao(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
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
}
