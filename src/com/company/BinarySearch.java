package com.company;

public class BinarySearch {
    public static boolean binarySearchIterative(int[] array, int x) {
        int right = array.length - 1;
        int left = 0;

        while (left <= right) {

            int mid = (right + left) / 2;
            if (array[mid] == x) {
                return true;
            } else if (array[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }

    public static boolean binarySearchRecursive(int[] array, int x) {
        return binarySearchRecursive(array, x, 0, array.length - 1);
    }

    private static boolean binarySearchRecursive(int[] array, int x, int left, int right) {
        if (left > right) {
            return false;
        }

        int mid = (left + right) / 2;
        if (array[mid] == x) {
            return true;
        } else if (array[mid] > x) {
            return binarySearchRecursive(array, x, left, mid - 1);
        } else {
            return binarySearchRecursive(array, x, mid + 1, right);
        }
    }
}
