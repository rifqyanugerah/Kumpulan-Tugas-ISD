package com.tugas3;

public class Pegawai{
    private String nip;
    private String nama;
    private String divisi;
    public Pegawai(String nip, String nama, String divisi) {
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    }
    public String getnama() {
        return nama;
    }

    public String getnip() {
        return nip;
    }


    public String getdivisi() {
        return divisi;
    }

    @Override
    public String toString() {
        return "(NIP='" + nip + '\'' +
                ", NAMA='" + nama + '\'' +
                ", Divisi='" + divisi + ") -"
                ;
    }
}
