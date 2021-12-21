package com.corejava;

import java.util.ArrayList;

public class TodoList2 {
    private ArrayList<String> tasks;
    public TodoList2() {
        this.tasks = new ArrayList<>();
    }
    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ": " + this.tasks.get(i));
        }
    }
    public void removeNumber(int number) {
        this.tasks.remove(tasks.get(number - 1));
    }



}
