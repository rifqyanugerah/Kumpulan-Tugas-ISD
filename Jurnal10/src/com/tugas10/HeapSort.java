package com.tugas10;

public class HeapSort {
    private static int C;

    /*Pengimplementasian Array*/
    public static void sort(int[] array) {
        heapMethod(array);
        for (int A = C; A > 0; A--) {
            swap(array, 0, A);
            C = C - 1;
            heap(array, 0);
        }
    }

    /*Untuk Melakukan Proses Penyortiran Data*/
    public static void heapMethod(int[] array) {
        C = array.length - 1;
        for (int A = C / 2; A >= 0; A--)
            heap(array, A);
    }

    public static void heap(int[] array, int A) {
        int left = 2 * A;
        int right = 2 * A + 1;
        int maximal = A;
        if (left <= C && array[left] > array[A])
            maximal = left;
        if (right <= C && array[right] > array[maximal])
            maximal = right;
        if (maximal != A) {
            swap(array, A, maximal);
            heap(array, maximal);
        }
    }

    /*Untuk Melakukan Proses Penukaran Data Yang Sudah*/
    public static void swap(int[] array, int A, int B) {
        int tmp = array[A];
        array[A] = array[B];
        array[B] = tmp;
    }
}