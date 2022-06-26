package com.tugas11;

public class Main {
    public static void main(String[] args) {
        Tree<Character> tree = new Tree<>();
        char inputData[] = { 'F', 'E', 'H', 'D', 'G', 'C', 'B', 'H', 'K', 'J' };
        for (char datum : inputData) {
            tree.insertNode(datum);
        }
        System.out.printf("%nPreorder traversal%n");
        tree.preorderTraversal();
        System.out.printf("%n%nInorder traversal%n");
        tree.inorderTraversal();
        System.out.printf("%n%nPostorder traversal%n");
        tree.postorderTraversal();
        System.out.printf("%n%nMencari karakter 'k'%n");
        tree.searchBST('k');
        System.out.printf("%nMencari karakter 'A'%n");
        tree.searchBST('A');
    }
}