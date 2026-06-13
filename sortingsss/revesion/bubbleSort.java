package sortingsss.revesion;

public class bubbleSort {
    static void main(String[] args) {
        int[] arr = {1, 23, 4, 534, 24, 45};

        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }

            if (!swap) break;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
