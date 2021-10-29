package com.corejava;

import java.sql.Array;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 9;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Give two indices to swap:");
        int indice = scanner.nextInt();
        int indice2 = scanner.nextInt();
        System.out.println();

        int temp = arr[indice];
        arr[indice] = arr[indice2];
        arr[indice2] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
