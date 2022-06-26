package com.tugas3;

import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String name;
    public SinglyLinkedList() {
        this("Linked List");
    }
    public SinglyLinkedList(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    public void insertAtFront(E insertItem) {
        ListNode<E> newNode = new ListNode<E>(insertItem);
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    public void insertAtBack(E insertItem) {
        ListNode<E> newNode = new ListNode<E>(insertItem);
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }

    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " Kosong");
        }
        E removedItem = lastNode.data;
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode<E> current = firstNode;
            while (current.next != lastNode) {
                current = current.next;
            }
            lastNode = current;
            current.next = null;
        }
        return removedItem;
    }
    private boolean isEmpty() {
        return firstNode == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("%s Kosong %n", name);
            return;
        }
        System.out.printf("Berikut adalah %s : %n", name);
        ListNode<E> current = firstNode;
        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.next;
        }
        System.out.println();
    }
}