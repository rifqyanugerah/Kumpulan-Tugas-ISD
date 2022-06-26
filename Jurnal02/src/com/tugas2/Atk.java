package com.tugas2;

public class Atk implements Comparable <Atk> {
    private String kdBarang, jnsBarang, nmBarang;
    private int stkBarang;

    public Atk(String kdBarang, String jnsBarang, String nmBarang, int stkBarang) {
        this.kdBarang = kdBarang;
        this.jnsBarang = jnsBarang;
        this.nmBarang = nmBarang;
        this.stkBarang = stkBarang;
    }

    public String getKdBarang() { return kdBarang; }

    public String getJnsBarang() { return  jnsBarang; }

    public  String getNmBarang() { return  nmBarang; }

    public int getStkBarang() { return stkBarang; }

    @Override
    public String toString() {
        return "Atk{" +
                "kdBarang='" + kdBarang + '\'' +
                ", jnsBarang='" + jnsBarang + '\'' +
                ", nmBarang='" + nmBarang + '\'' +
                ", stkBarang=" + stkBarang +
                '}';
    }

    @Override
    public int compareTo(Atk o) {
        if (kdBarang.equals(o.kdBarang)) {
            return 0;
        } else {
            return 1;
        }
    }
}