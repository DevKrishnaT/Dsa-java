package lesson_1.questions.basic_q.arrays;

import java.util.Arrays;

public class revesArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 45, 5, 56,};
        int p1 = 0;
        int p2 = arr.length - 1;
        while (p2 > p1) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
