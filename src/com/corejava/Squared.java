package com.corejava;

import java.util.Scanner;

public class Squared {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int squared = num * num;
        System.out.println(squared);
    }

}
