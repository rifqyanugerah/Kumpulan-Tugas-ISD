package com.tugas10;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int jumlahData;

        System.out.println("Masukkan Jumlah Data Yang Ingin Diproses : ");

        jumlahData = input.nextInt();
        int[] array = new int[ jumlahData ];

        System.out.println("Input "+ jumlahData +" Data Tersebut : ");

        for (int B = 0; B < jumlahData; B++)
            array[B] = input.nextInt();

        HeapSort.sort(array);
        System.out.println("Berikut Ini Adalah Hasil Akhir Setelah Pemrosesan Data : ");

        for (int B = 0; B < jumlahData; B++)
            System.out.println(array[B]+" ");
        System.out.println();
    }
}