package Q1_Basics;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] copy3 = Arrays.copyOf(arr1, arr1.length);

        System.out.print("Copied using Arrays.copyOf(): ");
        for (int i = 0; i < copy3.length; i++) {
            System.out.print(copy3[i] + " ");
        }
    }
}
