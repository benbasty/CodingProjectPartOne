package com.corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            list.add(input);
        }
        System.out.println(list.get(1) + list.get(2));
    }
}
