package com.corejava;

import java.util.Scanner;

public class FromWhereToWhere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        int num = scanner.nextInt();
//        for(int i = 1; i <= num; i++) {
//            System.out.println(i);
//        }
        System.out.print("Where from? ");
        int num2 = scanner.nextInt();
        for (int i = num2; i <= num; i++) {
            System.out.println(i);
        }
    }
}
