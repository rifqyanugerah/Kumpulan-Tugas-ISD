package com.soal2;

import java.util.*;

public class TodoList {
    private Queue<String> todoList;
    //constructor
    public TodoList() {
        todoList = new LinkedList<String>();
    }
    // add task to todolist
    public void addTask(String object) {
        todoList.add(object);
    }
    // remove completed task
    public String removeTask() throws NoSuchElementException {
        return todoList.remove();
    }
    // determine if todolist is empty
    public boolean isEmpty() {
        return todoList.isEmpty();
    }
    // output todolist contents
    public void printTodolist() {
        if (!todoList.isEmpty()) {
            Iterator<String> iterator = todoList.iterator();
            int noDash = 1;
            while (iterator.hasNext()) {
                String value = iterator.next();
                if (noDash == 1) {
                    System.out.print(value);
                }
                else {
                    System.out.print(" - " + value);
                }
                noDash++;
            }
            System.out.println();
        }
        else {
            System.out.println("To-do List masih kosong");
        }
    }
    // output priority task
    public String getPriorityTask() {
        if (!todoList.isEmpty()) {
            Iterator<String> iterator = todoList.iterator();
            return iterator.next();
        }
        else {
            return "kosong";
        }
    }
}