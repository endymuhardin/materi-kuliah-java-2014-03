package com.muhardin.endy.belajar.android.demosqlite;

/**
 * Created by endy on 19/12/14.
 */
public class Mahasiswa {
    private Integer _id;
    private String nama;
    private String email;

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
