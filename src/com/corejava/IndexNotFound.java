package com.corejava;

import java.util.Arrays;
import java.util.Scanner;

public class IndexNotFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        arr[0] = 4;
        arr[1] = 5;
        arr[2] = 6;
        arr[3] = 5;
        arr[4] = 8;
        arr[5] = 9;

        System.out.print("Search for? ");
        int searchFor = scanner.nextInt();
        int found = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchFor) {
                found = i;
            }
        }
        System.out.println(searchFor + " is at index " + found);

    }
}
