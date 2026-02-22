package BinarySearch;


public class findPages {
    public static void main(String[] args) {
        int[] arr = {15, 17, 20};
        int k = 5;
        int pages = FindPages(arr, k);
        System.out.println(pages);
    }

    public static int FindPages(int[] arr, int k) {
        if (k > arr.length) {
            return -1;
        }
        int left = maxNum(arr);
        int right = sum(arr);
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (IsItPosible(arr, k, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private static boolean IsItPosible(int[] arr, int k, int mid) {
        int students = 1;
        int totalPages = 0;

        for (int i = 0; i < arr.length; i++) {
            if (totalPages + arr[i] <= mid) {
                totalPages += arr[i];
            } else {
                students++;
                totalPages = arr[i];
            }

            if (students > k) {
                return false;
            }
        }
        return true;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int maxNum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
