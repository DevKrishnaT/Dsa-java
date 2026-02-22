package BinarySearch;


public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 4};
        int k = 3;
        int largest = splitArray(arr, k);
        System.out.println(largest);
    }

    public static int splitArray(int[] arr, int k) {
        int left = Max(arr);
        int right = Sum(arr);
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
        int count = 1;
        int sum = 0;
        for (int num : arr) {
            if (sum + num > mid) {
                count++;
                sum = num;

                if (count > k) return false;
            } else {
                sum += num;
            }
        }
        return true;

    }

    public static int Sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int Max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
