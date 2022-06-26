package com.tugas14;

public class Mahasiswa {
    public String nim;
    public String kelas;
    public String nama;

    public Mahasiswa(String nim, String kelas, String nama) {
        this.nim = nim;
        this.kelas = kelas;
        this.nama = nama;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Mahasiswa mahasiswa = (Mahasiswa) obj;
        return nim.equals(mahasiswa.nim) && kelas.equals(mahasiswa.kelas) && nama.equals(mahasiswa.nama);
    }

    @Override
    public int hashCode() {
        final int HASH_MULTIPLIER = 29;
        int h1 = nim.hashCode();
        int h2 = kelas.hashCode();
        int h3 = nama.hashCode();
        int h = HASH_MULTIPLIER * h1 + h2 + h3;
        return h;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", kelas='" + kelas + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }
}