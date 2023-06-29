package Assisted_Practice_Projects4;

import java.util.Arrays;

public class Practice_Project0004 {
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 10, 8, 3};
        System.out.println("Before sorting: " + Arrays.toString(numbers));

        selectionSort(numbers);

        System.out.println("After sorting: " + Arrays.toString(numbers));
    }
}
