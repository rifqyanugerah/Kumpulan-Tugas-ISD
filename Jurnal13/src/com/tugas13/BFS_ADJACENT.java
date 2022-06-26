package com.tugas13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class BFS_ADJACENT {
    private Queue<NodeAdjacent> queue = new LinkedList<>(); //daftar Queue
    static ArrayList<NodeAdjacent> nodes = new ArrayList<NodeAdjacent>(); //daftar simpul
    /*
    Method ini digunakan untuk mencari daftar tetangga dari suatu simpul.
    Daftar tetangga didapatkan dari matrik adjacent.
    */
    public ArrayList<NodeAdjacent> listTetangga(int matriks[][], NodeAdjacent x) {
        int idx = -1;
        ArrayList<NodeAdjacent> tetangga = new ArrayList<>();
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).getData() == x.getData()) {
                idx = i;
                break;
            }
        }
        if (idx != -1) {
            for (int j = 0; j < matriks[idx].length; j++) {
                if (matriks[idx][j] == 1) {
                    tetangga.add(nodes.get(j));
                }
            }
        }
        return tetangga;
    }
    /*
    Algoritma utama dari BFS. Sesuai dengan Algoritma pada bagian 13.3.1.1
    Parameter
    a. matriks : daftar matriks adjacent
    b. node : simpul awal
    */
    public void bfs(int matriks[][], NodeAdjacent node) {
        queue.add(node);
        node.setVisited(true);
        while (!queue.isEmpty()) {
            NodeAdjacent element = queue.remove();
            System.out.print(convertAlphabet(element.getData()) + " ");
            ArrayList<NodeAdjacent> tetangga = listTetangga(matriks, element);
            for (int i = 0; i < tetangga.size(); i++) {
                NodeAdjacent n = tetangga.get(i);
                if (n != null && !n.isVisited()) {
                    queue.add(n);
                    n.setVisited(true);
                }
            }
        }
    }
 /*
Method utama, berisi penentuan matriks dan pemanggilan algoritma.
Daftar simpul, dengan asumsi value unik

*/

    public String convertAlphabet (int i){
        i--;
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(i,i+1);
    }

    public static void main(String arg[]) {
        NodeAdjacent node1 = new NodeAdjacent(1);
        NodeAdjacent node2 = new NodeAdjacent(2);
        NodeAdjacent node3 = new NodeAdjacent(3);
        NodeAdjacent node4 = new NodeAdjacent(4);
        NodeAdjacent node5 = new NodeAdjacent(5);
        NodeAdjacent node6 = new NodeAdjacent(6);
        NodeAdjacent node7 = new NodeAdjacent(7);
        NodeAdjacent node8 = new NodeAdjacent(8);
        NodeAdjacent node9 = new NodeAdjacent(9);

        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);
        nodes.add(node5);
        nodes.add(node6);
        nodes.add(node7);
        nodes.add(node8);
        nodes.add(node9);


        int matriks[][] = {
                // Simpul 1 2 3 4 5 6 7 8 9 10
                {0, 1, 0, 1, 1, 0, 0, 0, 0}, // Simpul 1 : value 1
                {0, 0, 0, 0, 1, 0, 0, 0, 0}, // Simpul 2 : value 2
                {0, 1, 0, 0, 0, 0, 0, 0, 0}, // Simpul 3 : value 3
                {0, 0, 0, 0, 0, 0, 1, 0, 0}, // Simpul 4 : value 4
                {0, 0, 0, 0, 0, 1, 0, 1, 0}, // Simpul 5 : value 5
                {0, 0, 1, 0, 0, 0, 0, 1, 0}, // Simpul 6 : value 6
                {0, 0, 0, 0, 0, 0, 0, 1, 0}, // Simpul 7 : value 7
                {0, 0, 0, 0, 0, 0, 0, 0, 1}, // Simpul 8 : value 8
                {0, 0, 0, 0, 0, 1, 0, 0, 0}, // Simpul 9 : value 9

        };
        System.out.print("Traversal Graph : ");
        BFS_ADJACENT bfs_adjacent = new BFS_ADJACENT();
        bfs_adjacent.bfs(matriks, node1);
        System.out.println("");
    }
}