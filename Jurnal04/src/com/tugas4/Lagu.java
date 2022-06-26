package com.tugas4;

public class Lagu {
    private String judulLagu;
    private String namaPenyanyi;

    public Lagu(String judulLagu, String namaPenyanyi) {
        this.judulLagu = judulLagu;
        this.namaPenyanyi = namaPenyanyi;
    }

    public String getJudulLagu() {
        return judulLagu;
    }

    @Override
    public String toString() {
        return namaPenyanyi + " - " + judulLagu;
    }
}