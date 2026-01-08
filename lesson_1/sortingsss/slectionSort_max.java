package lesson_1.sortingsss;

public class slectionSort_max {
    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 534, 24, 45};
        for (int i = arr.length - 1; i > 0; i--) {
            int maxIndex = 0;
            for (int j = 1; j < i; j++) {
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }


}
