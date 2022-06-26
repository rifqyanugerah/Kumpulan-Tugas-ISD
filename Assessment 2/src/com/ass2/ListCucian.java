package com.ass2;

import java.util.PriorityQueue;

public class ListCucian {
    PriorityQueue<Pelanggan> pelanggann = new PriorityQueue<>();

    void terimaCucian(int idCuci, String namaPelanggan, int tanggalCuci, String tipeCuci, int beratCuci) {
        pelanggann.offer(new Pelanggan(idCuci, namaPelanggan, tanggalCuci, tipeCuci, beratCuci));
    }

    void cucianBersih(){
        System.out.println("Urutan cucian yang harus diselesaikan");

        while (!pelanggann.isEmpty()) {
            Pelanggan pelanggan = pelanggann.poll();
            System.out.printf("idCucian = %s, namaPelanggan = %s \n", pelanggan.idCuci, pelanggan.namaPelanggan);
        }
    }
}