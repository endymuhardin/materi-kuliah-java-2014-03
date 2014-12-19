package com.muhardin.endy.belajar.android.demosqlite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by endy on 19/12/14.
 */
public class MahasiswaAdapter extends ArrayAdapter<Mahasiswa> {

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // inisialisasi layout di dalam ListView
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.info_mahasiswa, parent, false);
        }

        // ambil datanya
        Mahasiswa m = getItem(position);

        // pasang di komponen dalam layout
        TextView txtNama = (TextView) convertView.findViewById(R.id.txtNama);
        txtNama.setText(m.getNama());
        TextView txtEmail = (TextView) convertView.findViewById(R.id.txtEmail);
        txtEmail.setText(m.getEmail());
        //TextView txtNpm = (TextView) convertView.findViewById(R.id.txtNpm);
        //txtNpm.setText(m.get_id());

        return convertView;

    }

    public MahasiswaAdapter(Context context, int resource, List<Mahasiswa> objects) {
        super(context, resource, objects);
    }
}
