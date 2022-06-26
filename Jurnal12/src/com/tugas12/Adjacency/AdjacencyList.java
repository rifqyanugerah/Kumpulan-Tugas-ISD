package com.tugas12.Adjacency;

import java.util.*;

public class AdjacencyList {
    int V;
    LinkedList<Character> adjListArray[];
    AdjacencyList(int V) {
        this.V = V;
        adjListArray = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    public void addEdge(char src, char dest) {
        int intsrc = (int)src - 65;
        adjListArray[intsrc].add(dest);
    }
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            if (adjListArray[i].size() > 0) {
                char vertex = (char)(i + 65);
                System.out.print("Vertex " + vertex + " is connected to: ");
                for (int j = 0; j < adjListArray[i].size(); j++) {
                    System.out.print(adjListArray[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}
