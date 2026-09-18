package RecursionAgain.Basic;

public class TreverselInArray {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int i = 0;
        treverse(arr, i);
    }

    private static void treverse(int[] arr, int i) {
        if (i >= arr.length) {
            return;
        }

        System.out.println(arr[i]);
        treverse(arr, i + 1);
    }

    ;
}
