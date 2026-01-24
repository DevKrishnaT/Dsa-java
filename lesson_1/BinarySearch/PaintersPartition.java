package lesson_1.BinarySearch;

public class PaintersPartition {
    public static void main(String[] args) {
        int[] arr = {5, 10, 30, 20, 15};
        int k = 3;
        int ans = minTime(arr, k);
        System.out.println(ans);
    }

    public static int minTime(int[] arr, int k) {
        int left = max(arr);
        int right = sum(arr);
        int ans = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isValid(arr, mid, k)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isValid(int[] arr, int mid, int k) {
        int painter = 1;
        int legth = 0;
        for (int i : arr) {
            if (legth + i > mid) {
                painter++;
                legth = i;
                if (painter > k) return false;
            } else {
                legth += i;
            }
        }
        return true;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

}
