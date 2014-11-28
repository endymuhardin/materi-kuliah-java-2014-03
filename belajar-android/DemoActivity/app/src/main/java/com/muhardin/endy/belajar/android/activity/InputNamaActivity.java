package com.muhardin.endy.belajar.android.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class InputNamaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nama);
    }

    public void btnOkClicked(View v) {
        Log.d("InputNamaActivity", "Method btnOkClicked dijalankan");

        EditText txt = (EditText) findViewById(R.id.txtNama);
        String nama = txt.getText().toString();

        Log.v("InputNamaActivity", "Nama : " + nama);

        Intent intentHalo = new Intent(this, HaloActivity.class);
        intentHalo.putExtra("xx", nama);

        startActivity(intentHalo);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_input_nama, menu);
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
