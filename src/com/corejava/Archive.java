package com.corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class Archive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<UserItems> items = new ArrayList();
        while (true) {
            System.out.print("Identifier? (empty will stop) ");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.print("Name? (empty will stop) ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            UserItems userItems = new UserItems(identifier,name);
            if (!(items.contains(userItems))) {
                items.add(userItems);
            }

        }
        System.out.println("==Items==");
        for (UserItems eachItem: items) {
            System.out.println(eachItem);
        }
    }
}
