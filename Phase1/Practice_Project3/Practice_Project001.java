package Assisted_Practice_Projects3;

public class Practice_Project001 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int steps = 5;
        
        System.out.println("Original array: ");
        printArray(arr);
        
        rotateArray(arr, steps);
        
        System.out.println("Array after rotation: ");
        printArray(arr);
    }
    
    public static void rotateArray(int[] arr, int steps) {
        int length = arr.length;
        steps = steps % length; // Ensure steps is within the array length
        
        // Reverse the entire array
        reverseArray(arr, 0, length - 1);
        
        // Reverse the first 'steps' elements
        reverseArray(arr, 0, steps - 1);
        
        // Reverse the remaining elements
        reverseArray(arr, steps, length - 1);
    }
    
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

