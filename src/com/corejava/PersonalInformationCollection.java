package com.corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> persInf = new ArrayList<>();
        while (true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Identification number: ");
            String identification = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }
            persInf.add(new PersonalInformation(firstName,lastName,identification));
        }
        for (PersonalInformation personalInformation: persInf) {
            System.out.println(personalInformation);
        }

    }
}
