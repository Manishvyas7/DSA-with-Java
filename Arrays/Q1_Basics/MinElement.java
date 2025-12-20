package Q1_Basics;

public class MinElement {
    public static void main(String[] args) {
        int p[] = {23,45,66,67,43,34,12};
        int min = p[0];
        for(int i = 0; i < p.length; i++){
            if (p[i] < min){
                min = p[i];
            }
        }
        System.out.println("The min element in the array is:" + min);
    }
}
