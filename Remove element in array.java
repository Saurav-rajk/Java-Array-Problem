// Java program to remove a specific element from an array.

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3};
        int elementToRemove = 8;

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Count the number of occurrences of the element
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToRemove) {
                count++;
            }
        }

        // Create a new array with the non-removed elements
        int[] newArr = new int[arr.length - count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != elementToRemove) {
                newArr[index++] = arr[i];
            }
        }

        System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(newArr));
    }
}