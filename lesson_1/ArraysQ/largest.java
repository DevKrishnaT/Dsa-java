package lesson_1.ArraysQ;

public class largest {
    public static void main(String[] args) {
        int[] arr = {12412, 412, 4512, 412, 4, 13, 124, 23, 52, 5623, 523, 2, 35, 235, 235, 235, 23, 523, 52};
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {

            if (largest < arr[i]) {
                largest = arr[i];
            }

        }
        System.out.println(largest);
        
    }
}
