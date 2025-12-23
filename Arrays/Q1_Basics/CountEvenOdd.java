package Q1_Basics;

public class CountEvenOdd {
    public static void main(String[] args) {
        int f[] = {12, 23, 34, 56, 54, 33, 78};

        int evenCount = 0;
        int oddCount = 0;

        System.out.print("Even numbers: ");
        for (int i = 0; i < f.length; i++) {
            if (f[i] % 2 == 0) {
                System.out.print(f[i] + " ");
                evenCount++;
            }
        }
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < f.length; i++) {
            if (f[i] % 2 != 0) {
                System.out.print(f[i] + " ");
                oddCount++;
            }
        }
        System.out.println("\nTotal even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }
}
