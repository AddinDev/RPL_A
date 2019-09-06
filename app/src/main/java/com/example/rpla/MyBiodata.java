package com.example.rpla;

public class MyBiodata {
    private String nama;
    private int umur;

    //constructor
    public MyBiodata(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
