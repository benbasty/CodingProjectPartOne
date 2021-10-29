package com.corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        System.out.print("Search for? ");
        int searchFor = scanner.nextInt();
        int indexsearchFor = 0;
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i) == searchFor) {
                indexsearchFor = i;
                System.out.println(searchFor + " is at index " + indexsearchFor);
            }
        }

    }
}
