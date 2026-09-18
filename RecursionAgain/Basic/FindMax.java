package RecursionAgain.Basic;

public class FindMax {
    static void main(String[] args) {
        int[] arr = {1, 2, 10, 4, 5, 6};
        int ans = findMax(arr, 0);
        System.out.println(ans);
    }

    private static int findMax(int[] arr, int i) {
        if (i >= arr.length - 1) {
            return arr[i];
        }


        return Math.max(arr[i], findMax(arr, i + 1));
    }
}
