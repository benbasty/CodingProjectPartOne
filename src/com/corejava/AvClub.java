package com.corejava;

import java.util.Scanner;

public class AvClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stnce = scanner.nextLine();
        String[] parts = stnce.split(" ");
        for (String st : parts) {
            if (st.contains("av")) {
                System.out.println(st);
            }
        }
    }
}
