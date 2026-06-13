package sortingsss.revesion;

public class selectionSort {
    static void main(String[] args) {
        int[] arr = {1, 23, 4, 534, 24, 45};


        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }

            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
