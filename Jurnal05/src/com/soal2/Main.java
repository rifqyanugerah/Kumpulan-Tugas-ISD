package com.soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TodoList todoList = new TodoList();
        boolean keluar = false;
        while (!keluar) {
            System.out.println("----Menu----");
            System.out.println("1. Tambah pekerjaan");
            System.out.println("2. Pekerjaan yang harus diselesaikan");
            System.out.println("3. Hapus completed task");
            System.out.println("4. Menampilkan to-do list");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu dengan angka: ");
            int select = input.nextInt();
            input.nextLine();
            switch (select) {
                case 1:
                    System.out.print("Masukkan nama pekerjaan: ");
                    String taskName = input.nextLine();
                    todoList.addTask(taskName);
                    System.out.println("Berhasil menambahkan "+ taskName + " ke to-do list!");
                    break;
                case 2:
                    System.out.println("Tugas yang harus diselesaikan: " + todoList.getPriorityTask());
                    break;
                case 3:
                    System.out.println("Apakah tugas " + todoList.getPriorityTask() + " sudah selesai dikerjakan?");
                    System.out.println("1. Yes\t2. No");
                    System.out.print("Pilih opsi dengan angka: ");
                    int selectOpt = input.nextInt();
                    input.nextLine();
                    if (selectOpt == 1) {
                        todoList.removeTask();
                    }
                    break;
                case 4:
                    todoList.printTodolist();
                    break;
                case 5:
                    keluar = true;
                    break;
                default:
                    System.out.println("Menu tidak tersedia, Coba lagi!");
            }
        }
    }
}