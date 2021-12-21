package com.corejava;

import java.util.Scanner;

public class TodoList2Ui {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList2 todoList = new TodoList2();
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.print("To add: ");
                String toBeAdded = scanner.nextLine();
                todoList.add(toBeAdded);
            }
            if (command.equals("list")) {
                todoList.print();
            }
            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int tobeRemoved = Integer.parseInt(scanner.nextLine());
                todoList.removeNumber(tobeRemoved);
            }
        }
    }
}
