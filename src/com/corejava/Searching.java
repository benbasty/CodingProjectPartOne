package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Searching {
    // Linear search is a search algorithm that searches for information
    // in an array by going through every value in the array
    // one by one.

    // Binary Search - half interval search - logarithmic search
    // The idea behind Binary Search is to start looking for the
    // searched value in the middle index of the array (or list),
    // compare the value found there to the searched value,
    // and if needed (i.e, when the value isn't found there)
    // eliminate half of the search area.

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book4> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book4(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.parseInt(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }
    }

    public static int linearSearch(ArrayList<Book4> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (searchedId == books.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book4> books, int searchedId) {
        // assuming the variable searched exits
        // assuming the variable list exits
        int begin = 0; // the 0th index of the list
        int end = books.size() - 1; // the last index in the list
        while (begin <= end) { // repeat until begin is larger than end:
            int middle = (begin + end) / 2;
            int bookId = books.get(middle).getId();
            if (bookId == searchedId) { //if the value at list[middle] is searched
                return middle; //return the value of the variable middle
            } else if (bookId < searchedId) { //if the value at list[middle] is smaller than searched
                begin = middle + 1;
            } else { //if the value at list[middle] is larger than searched
                end = middle - 1;
            }
        }

        return -1;
    }

}
