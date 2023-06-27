package Assisted_Practice_Projects3;

import java.util.Arrays;

public class Practice_Project002 {
    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 7, 1, 6, 3, 8, 4};

        int fourthSmallest = findFourthSmallest(arr);

        System.out.println("The fourth smallest element is: " + fourthSmallest);
    }

    public static int findFourthSmallest(int[] arr) {
        if (arr.length < 4) {
            throw new IllegalArgumentException("List should have at least 4 elements.");
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the fourth element
        return arr[3];
    }
}
