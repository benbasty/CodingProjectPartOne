package com.corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        double average = 0;
        int sum = 0;
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            average = (double) sum / list.size();
        }
        System.out.println(average);
    }
}
