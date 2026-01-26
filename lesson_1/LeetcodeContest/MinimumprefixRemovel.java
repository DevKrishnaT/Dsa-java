package lesson_1.LeetcodeContest;

public class MinimumprefixRemovel {
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, 3, 3, 4, 5};

        int ans = minimumPrefixLength(arr);
    }

    private static int minimumPrefixLength(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int count = 1;
            for (int i = mid; i < arr.length - 1; i++) {
                int num = arr[i];
                if (num == arr[i + 1]) {
                    right = mid - 1;
                }
            }

        }
        return -1;
    }
}
