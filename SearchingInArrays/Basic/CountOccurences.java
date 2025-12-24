package Basic;
import java.util.Scanner;

public class CountOccurences {
    public static int elementFind(int[] h, int target) {
        int count = 0;
        for (int i = 0; i < h.length; i++) {
            if (h[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take array size
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Create array
        int[] h = new int[size];

        // Take array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            h[i] = sc.nextInt();
        }

        // Take target element
        System.out.println("Enter the element to find:");
        int target = sc.nextInt();

        // Call method
        int result = elementFind(h, target);

        System.out.println("Occurrence count: " + result);
    }
}
