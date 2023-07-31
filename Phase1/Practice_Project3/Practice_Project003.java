package Assisted_Practice_Projects3;

import java.util.Scanner;

public class Practice_Project003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the range start (L): ");
        int L = scanner.nextInt();
        
        System.out.print("Enter the range end (R): ");
        int R = scanner.nextInt();
        
        int sum = findSumInRange(arr, L, R);
        
        System.out.println("The sum of elements in the range [" + L + ", " + R + "] is: " + sum);
        
        scanner.close();
    }
    
    public static int findSumInRange(int[] arr, int L, int R) {
        int sum = 0;
        
        for (int i = L; i <= R; i++) {
            sum += arr[i];
        }
        
        return sum;
    }
}

