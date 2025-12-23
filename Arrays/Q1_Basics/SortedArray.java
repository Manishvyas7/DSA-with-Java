package Q1_Basics;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        boolean sorted = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextByte(); // Taking the size of the array
        int[] arr = new int [size]; // Creating the array
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<arr.length -1; i++){
            if (arr[i] > arr[i+1]){
                sorted = false;
                break;
            }
        }
        if (sorted){
            System.out.println("THE ARRAY IS ALREADY SORTED");
        }else{
            System.out.println("THE ARRAY IS NOT SORTED");
        }
    }
}