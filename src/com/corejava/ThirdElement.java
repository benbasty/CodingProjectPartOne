package com.corejava;
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {
    public static void main(String[] args) {
        // In programming, we often encounter situations
        // where we want to handle many values.
        // we use ArrayList, which is used for
        // storing many values that are of the same type.
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            list.add(input);
        }
        System.out.println(list.get(2));

    }
}
