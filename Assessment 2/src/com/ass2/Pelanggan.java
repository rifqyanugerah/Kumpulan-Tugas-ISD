package com.ass2;

public class Pelanggan implements Comparable<Pelanggan> {

    String namaPelanggan, tipeCuci;
    int idCuci, beratCuci, tanggalCuci, jumlahHari;

    public Pelanggan(int idPelanggan, String namaPelanggan, int tanggalCuci, String tipeCuci, int beratCuci){

        this.idCuci = idPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.tanggalCuci = tanggalCuci;
        this.tipeCuci = tipeCuci;
        this.beratCuci = beratCuci;

        switch (tipeCuci) {
            case "biasa":
                jumlahHari = 3 + tanggalCuci;
                break;
            case "express":
                jumlahHari = 2 + jumlahHari;
                break;
            case "kilat":
                jumlahHari = 1 + jumlahHari;
                break;
        }
    }

    public int getJumlahHari() {
        return jumlahHari;
    }
    @Override
    public int compareTo (Pelanggan other){
        return this.getJumlahHari() - (other.getJumlahHari());
    }
}