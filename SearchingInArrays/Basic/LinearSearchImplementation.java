package Basic;

import java.util.Scanner;

public class LinearSearchImplementation {
    // Method to perform linear search
    public static int elementFind(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;   // element found, return index
            }
        }
        return -1; // element not found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 4, 5, 6, 7, 8};
        System.out.println("Enter the element to search:");
        int target = sc.nextInt();
        // Call the method
        int result = elementFind(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not present");
        }
    }
}
