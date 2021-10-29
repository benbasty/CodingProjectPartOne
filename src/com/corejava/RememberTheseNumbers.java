package com.corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
