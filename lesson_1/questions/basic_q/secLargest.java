package lesson_1.questions.basic_q;

public class secLargest {
    public static void main(String[] args) {
        int largest = 0;
        int secLargest = 0;
        int[] arr = {10, 10, 10, 10, 10, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else {
                if (arr[i] > secLargest) {
                    secLargest = arr[i];
                }
            }
        }
        if (largest == secLargest) {
            System.out.println(-1);
        } else {
            System.out.println(secLargest);
        }
    }
}
