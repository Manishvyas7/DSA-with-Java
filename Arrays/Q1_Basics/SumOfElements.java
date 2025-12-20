package Q1_Basics;

public class SumOfElements {
    public static void main(String[] args) {
        System.out.println("The sum of the elements ar");
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = arr[i] + sum;
        }
        System.out.println(sum);
    }
}
