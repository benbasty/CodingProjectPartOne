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
//        HealthStation childrensHospital = new HealthStation();
//
//        Person ethan = new Person("Ethan", 1, 110, 7);
//        Person peter = new Person("Peter", 33, 176, 85);
//
//        System.out.println("weighings performed: " + childrensHospital.weighings());
//
//        childrensHospital.weigh(ethan);
//        childrensHospital.weigh(peter);
//
//        System.out.println("weighings performed: " + childrensHospital.weighings());
//
//        childrensHospital.weigh(ethan);
//        childrensHospital.weigh(ethan);
//        childrensHospital.weigh(ethan);
//        childrensHospital.weigh(ethan);
//
//        System.out.println("weighings performed: " + childrensHospital.weighings());

//        PaymentTerminal unicafeExactum = new PaymentTerminal();
//        System.out.println(unicafeExactum);
//
//        CardPayment annesCard = new CardPayment(2);
//
//        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");
//
//        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        unicafeExactum.addMoneyToCard(annesCard, 100);
//
//        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");
//
//        System.out.println(unicafeExactum);
//        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
//        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
//        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
//
//        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
//        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true
//        Song2 jackSparrow = new Song2("The Lonely Island", "Jack Sparrow", 196);
//        Song2 anotherSparrow = new Song2("The Lonely Island", "Jack Sparrow", 196);
//
//        if (jackSparrow.equals(anotherSparrow)) {
//            System.out.println("Songs are equal.");
//        }
//
//        if (jackSparrow.equals("Another object")) {
//            System.out.println("Strange things are afoot.");
//        }
//        SimpleDate date = new SimpleDate(24, 3, 2017);
//        SimpleDate date2 = new SimpleDate(23, 7, 2017);
//
//        PersonIdenticalTwins leo = new PersonIdenticalTwins("Leo", date, 62, 9);
//        PersonIdenticalTwins lily = new PersonIdenticalTwins("Lily", date2, 65, 8);
//
//        if (leo.equals(lily)) {
//            System.out.println("Is this quite correct?");
//        }
//
//        PersonIdenticalTwins leoWithDifferentWeight = new PersonIdenticalTwins("Leo", date, 62, 10);
//
//        if (leo.equals(leoWithDifferentWeight)) {
//            System.out.println("Is this quite correct?");
//        }
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Book3> books = new ArrayList<>();
//        while (true) {
//            System.out.print("Name (empty will stop): ");
//            String name = scanner.nextLine();
//            if (name.isEmpty()) {
//                break;
//            }
//            System.out.print("Publication year: ");
//            int publicationYear = scanner.nextInt();
//            Book3 book = new Book3(name,publicationYear);
//            if (books.contains(book)) {
//                System.out.println("The book is already on the list. Let's not add the same book again.");
//            } else {
//                books.add(book);
//            }
//        }
//
//
//        System.out.println("Thank you! Books added: " + books.size());
//        SimpleDate2 date = new SimpleDate2(13, 2, 2015);
//        System.out.println("Friday of the examined week is " + date);
//
//        SimpleDate2 newDate = date.afterNumberOfDays(7);
//        int week = 1;
//        while (week <= 7) {
//            System.out.println("Friday after " + week + " weeks is " + newDate);
//            newDate = newDate.afterNumberOfDays(7);
//
//            week = week + 1;
//        }
//
//
//        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
//        //    System.out.println("Try " + date.afterNumberOfDays(790));
//        Money a = new Money(10,0);
//        Money b = new Money(5,0);
//
//        Money c = a.plus(b);
//
//        System.out.println(a);  // 10.00e
//        System.out.println(b);  // 5.00e
//        System.out.println(c);  // 15.00e
//
//        a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
////  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it
//
//        System.out.println(a);  // 25.00e
//        System.out.println(b);  // 5.00e
//        System.out.println(c);  // 15.00e
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
//  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it


        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e

    }

}
