package com.corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            String pages = scanner.nextLine();
            System.out.print("Publication year: ");
            String yearPublication = scanner.nextLine();

            books.add(new Book(title, pages, yearPublication));
        }

        System.out.print("What information will be printed? ");
        String information = scanner.nextLine();

        for (Book book: books) {
            if (information.equals("everything")) {
                System.out.println(book.toString());
            }
            if (information.equals("name")) {
                System.out.println(book.getTitle());
            }

        }


    }
}
