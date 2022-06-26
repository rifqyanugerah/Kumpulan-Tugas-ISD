package com.tugas14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Map<Mahasiswa, Integer> mahasiswa = new HashMap<Mahasiswa, Integer>();

        Mahasiswa mahasiswa1 = new Mahasiswa("2704318", "01", "Cecep");
        Mahasiswa mahasiswa2 = new Mahasiswa("2789134", "02", "Udin");
        Mahasiswa mahasiswa3 = new Mahasiswa("2345678", "03", "Audy");

        mahasiswa.put(mahasiswa1, 82);
        mahasiswa.put(mahasiswa2, 95);
        mahasiswa.put(mahasiswa3, 78);

        boolean condition = true;

        while (condition) {
            menu();
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    add(mahasiswa);
                    break;
                case 2:
                    remove(mahasiswa);
                    break;
                case 3:
                    showAll(mahasiswa);
                    break;
                default:
                    condition = false;
            }
        }
    }

    public static void add(Map mahasiswa) {
        System.out.println("Nim : ");
        input.nextLine();
        String nim = input.nextLine();
        System.out.println("Kelas : ");
        String kelas = input.nextLine();
        System.out.println("Nama : ");
        String nama = input.nextLine();
        System.out.println("Nilai : ");
        int nilai = input.nextInt();

        Mahasiswa addMahasiswa = new Mahasiswa(nim,kelas, nama);
            mahasiswa.put(addMahasiswa, nilai);
        }

        public static void remove(Map<Mahasiswa, Integer> mahasiswa){
            System.out.println("Masukkan NIM yang ingin dihapus : ");
            input.nextLine();
            String removeNim = input.nextLine();

            Set<Mahasiswa> keySet = mahasiswa.keySet();

            for (Mahasiswa key : keySet) {
                if (key.nim.equals(removeNim))
                    mahasiswa.remove(key);
            }
        }

        public static void showAll(Map<Mahasiswa, Integer> mahasiswa) {
            int jumlahNilai = 0;

            Set<Mahasiswa> keySet = mahasiswa.keySet();

            for (Mahasiswa key : keySet) {
                int nilai = mahasiswa.get(key);
                System.out.println(key + " : " + nilai);
                jumlahNilai += nilai;
            }
            System.out.println();

            int mean = jumlahNilai / mahasiswa.size();
            System.out.println("Nilai rata-rata : " + mean);
            System.out.println();
            }

            public static void menu(){
            System.out.println("Pilih menu :");
            System.out.println("1. Tambah data");
            System.out.println("2. Hapus data");
            System.out.println("3. Tampilkan nilai dan rata-rata");
    }
}