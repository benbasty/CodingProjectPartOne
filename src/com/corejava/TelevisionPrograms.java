package com.corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class TelevisionPrograms {
    public static void main(String[] args) {
        ArrayList<TelevisionProgram> tvPrograms = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            tvPrograms.add(new TelevisionProgram(name,duration));

        }


        System.out.println("Program's maximum duration? ");
        int maxDuration = scanner.nextInt();
        for (TelevisionProgram televisionProgram: tvPrograms) {
            if (televisionProgram.getDuration() <= maxDuration) {
                System.out.println(tvPrograms);
            }
        }

    }
}
