package com.corejava;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //System.out.println("Welcome to my java projects where i will review all the java projects and exercices learned during my practice ");
//        Scanner scanner = new Scanner(System.in);
//        Statistics statistics = new Statistics();
//        Statistics oddNum = new Statistics();
//        Statistics evenNum = new Statistics();
//
//
//        System.out.println("Enter numbers:");
//        while (true) {
//            int input = scanner.nextInt();
//            if (input == -1) {
//                break;
//            }
//            if (input % 2 == 0) {
//                evenNum.addNumber(input);
//            } else {
//                oddNum.addNumber(input);
//            }
//
//            statistics.addNumber(input);
//        }
//
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Sum of even numbers: " + evenNum.sum());
//        System.out.println("Sum of odd numbers: " + oddNum.sum());
//        try (Scanner scanner = new Scanner(Paths.get("file.txt"))) {
//            while (scanner.hasNextLine()) {
//                String row = scanner.nextLine();
//                System.out.println(row);
//            }
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        Fitbyte assistant = new Fitbyte(30, 60);
//
//        double percentage = 0.5;
//
//        while (percentage < 1.0) {
//            double target = assistant.targetHeartRate(percentage);
//            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
//            percentage = percentage + 0.1;
//        }
        HealthStation childrensHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(peter);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);

        System.out.println("weighings performed: " + childrensHospital.weighings());

    }

}
