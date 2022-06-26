package com.tugas3;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Pegawai> linkedList = new SinglyLinkedList<>("Data Pegawai");
        Scanner input = new Scanner (System.in);
        boolean out = false;
        while (!out){
            System.out.println("Pilih Menu:");
            System.out.println("1. Input Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cetak List Pegawai");
            System.out.println("4. Keluar");
            int masukkan = input.nextInt();
            switch(masukkan){
                case 1:
                    System.out.println("Masukkan data pegawai berikut: ");
                    System.out.print("NIP: ");
                    String nip = input.next();
                    System.out.print("Nama: ");
                    String nama = input.next();
                    System.out.print("Divisi: ");
                    String divisi = input.next();
                    linkedList.insertAtFront(new Pegawai(nama, nip, divisi));
                    break;

                case 2:
                    System.out.println("Menghapus Data...");
                    linkedList.removeFromBack();
                    System.out.println("Menghapus Data di Back Berhasil!");
                    break;

                case 3:
                    linkedList.print();
                    break;

                case 4:
                    out = true;
                    break;
            }
        }
        input.close();
    }
}
