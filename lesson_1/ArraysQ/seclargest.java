package lesson_1.ArraysQ;

public class seclargest {
    public static void main(String[] args) {
        int[] arr = {12, 3412, 412, 4, 1245, 235, 23, 5, 123, 12, 412, 4523, 562, 562, 3412, 412, 41};
        int largest = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secLar = largest;
                largest = arr[i];
            } else if (arr[i] > secLar && arr[i] < largest)
                secLar = arr[i];


        }
        System.out.println(largest);
        System.out.println(secLar);

    }
}
