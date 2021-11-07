package com.corejava;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        ArrayList<Person> person = new ArrayList<>();
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextLine()){
                String lines = readFile.nextLine();
                String[] parts = lines.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                person.add(new Person(name,age));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        for (Person people: person) {
            if (people.getAge() > 1) {
                System.out.println(people.getName() + ", age: " + people.getAge() + " years");
            } else {
                System.out.println(people.getName() + ", age: " + people.getAge() + " year");
            }
        }
    }
}
