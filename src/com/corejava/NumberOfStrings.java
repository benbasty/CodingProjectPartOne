package com.corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                System.out.println(lines.size());
                break;
            }
            lines.add(line);
        }
    }
}
