package Q1_Basics;

public class MaxElement {
    public static void main(String[] args) {
        int p[] = {2, 5, 67, 90, 43, 99};
        int max = p[0];
        for (int i = 1; i < p.length; i++) {
            if (p[i] > max) {
                max = p[i];
            }
        }
        System.out.println("Maximum element is: " + max);
    }
}