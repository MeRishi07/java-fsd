package Assisted_Practice_Projects4;

public class Practice_Project0005 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 1, 6, 3};
        
        System.out.println("Before sorting:");
        printArray(array);
        
        bubbleSort(array);
        
        System.out.println("\nAfter sorting:");
        printArray(array);
    }
    
    public static void bubbleSort(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
