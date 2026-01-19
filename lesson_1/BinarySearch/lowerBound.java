package lesson_1.BinarySearch;

public class lowerBound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int target = 2;

        int LB = find(arr, target);
        System.out.println(LB);
    }

    private static int find(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = arr.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return ans;
    }
}
