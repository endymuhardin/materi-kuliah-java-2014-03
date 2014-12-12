package com.muhardin.endy.belajar.android.demosqlite;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.muhardin.endy.belajar.android.demosqlite.R;

public class DemoSqliteActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_demo_sqlite);
    }

    public void simpan(View v){
        EditText txtNama = ((EditText) findViewById(R.id.txtNama));
        EditText txtEmail = ((EditText) findViewById(R.id.txtEmail));

        String nama = txtNama.getText().toString();
        String email = txtEmail.getText().toString();

        Log.d("DemoSqliteActivity", "Menginstankan MahasiswaDao");
        MahasiswaDao md = new MahasiswaDao(this);

        Log.d("DemoSqliteActivity", "Membuka koneksi ke database");
        SQLiteDatabase db = md.getWritableDatabase();
        String sql = "INSERT INTO mahasiswa (nama, email) VALUES (?,?)";

        Log.d("DemoSqliteActivity", "Insert record ke tabel mahasiswa");
        ContentValues data = new ContentValues();
        data.put("nama", nama);
        data.put("email", email);

        Long idBaru = db.insert("mahasiswa", null, data);
        Log.d("DemoSqliteActivity", "ID Record Baru : "+idBaru);


        Log.d("DemoSqliteActivity", "Tutup koneksi database");
        db.close();

        txtNama.setText("");
        txtEmail.setText("");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_demo_sqlite, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
