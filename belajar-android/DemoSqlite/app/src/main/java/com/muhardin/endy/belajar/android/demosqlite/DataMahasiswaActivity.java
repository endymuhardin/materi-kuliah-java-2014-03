package com.muhardin.endy.belajar.android.demosqlite;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class DataMahasiswaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mahasiswa);

        List<Mahasiswa> data = new MahasiswaDao(this).semuaMahasiswa();
        MahasiswaAdapter ma = new MahasiswaAdapter(this, android.R.layout.simple_list_item_1, data);
        ListView lv = (ListView) findViewById(R.id.listMahasiswa);
        lv.setAdapter(ma);

    }

}
