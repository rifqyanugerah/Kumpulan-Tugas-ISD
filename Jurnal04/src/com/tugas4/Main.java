package com.tugas4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Lagu> playList = new LinkedList<>();

        boolean keluar = false;
        while (!keluar) {
            System.out.println("-----Menu-----");
            System.out.println("1. Input lagu");
            System.out.println("2. Hapus Lagu");
            System.out.println("3. Mainkan lagu");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu dengan angka: ");
            int select = input.nextInt();
            input.nextLine();
            switch (select) {
                case 1:
                    System.out.print("Masukkan judul lagu: ");
                    String judulLagu = input.nextLine();
                    System.out.print("Masukkan nama penyanyi: ");
                    String namaPenyanyi = input.nextLine();
                    playList.addLast(new Lagu(judulLagu, namaPenyanyi));
                    break;
                case 2:
                    System.out.println("1. Hapus lagu paling terakhir dimasukkan");
                    System.out.println("2. Hapus lagu berdasarkan judul");
                    System.out.print("Pilih opsi di atas dengan memasukkan angka: ");
                    int rmOption = input.nextInt();
                    input.nextLine();
                    if (rmOption == 1) {
                        playList.removeLast();
                        System.out.println("Berhasil menghapus lagu!");
                    }
                    else if (rmOption == 2) {
                        System.out.print("Masukkan judul lagu yang ingin dihapus: ");
                        String rmJudulLagu = input.nextLine();
                        removeByTitle(playList, rmJudulLagu);
                        System.out.println("Berhasil menghapus lagu!");
                    }
                    else {
                        System.out.println("Opsi tidak tersedia, silahkan coba lagi!");
                    }
                    break;
                case 3:
                    playSong(playList);
                    break;
                case 4:
                    keluar = true;
                    break;
                default:
                    System.out.println("Menu tidak tersedia, silahkan coba lagi!");
            }
        }
    }

    public static void playSong(LinkedList<Lagu> ob) {
        ListIterator<Lagu> iterator = ob.listIterator();

        while (iterator.hasNext()) {
            if (iterator.hasPrevious()) {
                System.out.print(", " + iterator.next());
            }
            else {
                System.out.print(iterator.next());
            }
        }
        iterator.previous();
        while (iterator.hasPrevious()) {
            System.out.print(", " + iterator.previous());
        }
        System.out.println();
    }

    public static void removeByTitle(LinkedList<Lagu> ob, String judulLagu) {
        ListIterator<Lagu> iterator = ob.listIterator();

        while (iterator.hasNext()) {
            Lagu current = iterator.next();
            if (current.getJudulLagu().equalsIgnoreCase(judulLagu)) {
                iterator.remove();
            }
        }
    }

}