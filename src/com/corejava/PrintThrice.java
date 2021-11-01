package com.corejava;

import java.util.Scanner;

public class PrintThrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a word: ");
        String wrd = sc.nextLine();
        System.out.println(wrd+wrd+wrd);
    }
}
