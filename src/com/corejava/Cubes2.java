package com.corejava;

import java.util.Scanner;

public class Cubes2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stringNumtoInt = 0;
        int cube = 0;
        while (true) {
            String num = scanner.nextLine();
            if (num.equalsIgnoreCase("end") ) {
                break;
            } else {
                stringNumtoInt = Integer.parseInt(num);
                cube = stringNumtoInt * stringNumtoInt * stringNumtoInt;
                System.out.println(cube);
            }
        }
    }
}
