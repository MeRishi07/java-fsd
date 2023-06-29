package Assisted_Practice_Projects4;

public class Practice_Project0007 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 1, 6, 3};
        
        System.out.println("Before sorting:");
        printArray(array);
        
        mergeSort(array);
        
        System.out.println("\nAfter sorting:");
        printArray(array);
    }
    
    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        
        // Populate the left and right arrays
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }
        
        mergeSort(left); // Recursively sort the left subarray
        mergeSort(right); // Recursively sort the right subarray
        
        merge(left, right, array); // Merge the sorted left and right subarrays
    }
    
    public static void merge(int[] left, int[] right, int[] array) {
        int leftLength = left.length;
        int rightLength = right.length;
        int i = 0; // Index for the left array
        int j = 0; // Index for the right array
        int k = 0; // Index for the merged array
        
        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        
        // Copy the remaining elements of the left subarray, if any
        while (i < leftLength) {
            array[k] = left[i];
            i++;
            k++;
        }
        
        // Copy the remaining elements of the right subarray, if any
        while (j < rightLength) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
