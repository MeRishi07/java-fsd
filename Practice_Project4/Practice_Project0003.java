package Assisted_Practice_Projects4;

public class Practice_Project0003 {
    public static int exponentialSearch(int[] array, int target) {
        if (array[0] == target) {
            return 0; // Return index 0 if the target is found at the first element
        }

        int bound = 1;
        while (bound < array.length && array[bound] <= target) {
            bound *= 2; // Double the bound until the target is potentially within the range
        }

        int left = bound / 2; // The left bound of the subrange
        int right = Math.min(bound, array.length - 1); // The right bound of the subrange

        return binarySearch(array, target, left, right);
    }

    public static int binarySearch(int[] array, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Return the index where the target is found
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 8, 10};
        int target = 8;
        int index = exponentialSearch(numbers, target);

        if (index != -1) {
            System.out.println("Target found at index " + index);
        } else {
            System.out.println("Target not found");
        }
    }
}
