package com.corejava;

import java.util.Arrays;

public class Sorting {
    public static int smallest(int[] array) {
        int smallNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallNumber) {
                smallNumber = array[i];
            }
        }
        return smallNumber;
    }
    public static int indexOfSmallest(int[] array) {
        int smallestNum = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallestNum) {
                return i;
            }
        }
        return -1;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int startOfNewIndex = startIndex;
        int[] newArrayFromIndex = new int[table.length - startIndex];
        for(int i = 0; i < newArrayFromIndex.length; i++){
            newArrayFromIndex[i] = table[startOfNewIndex];
            startOfNewIndex++;
        }
        return startIndex + indexOfSmallest(newArrayFromIndex);
    }

    public static void swap(int[] array, int index1, int index2) {
        int tempValue = array[index1];
        array[index1] = array[index2];
        array[index2] = tempValue;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallest = indexOfSmallestFrom(array,i);
            swap(array,i,smallest);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
//        System.out.println("Smallest: " + MainProgram.smallest(numbers));
//        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
//        MainProgram.swap(numbers,1,0);
//        System.out.println(Arrays.toString(numbers));
        Sorting.sort(numbers);
    }
}
