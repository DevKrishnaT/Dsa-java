package lesson_1.ArraysQ;

public class SingleElemnt {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                while (j != i) {
                    j++;
                }
            } else {
                System.out.println(arr[j]);
                break;
            }

        }
    }
}
