package com.company;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[] {2, 4, 5, 6, 8, 9, 11, 14, 23, 56, 78, 105, 125, 135};

        System.out.println(BinarySearch.binarySearchRecursive(myArray, 57));
        System.out.println(BinarySearch.binarySearchIterative(myArray, 125));
    }
}
