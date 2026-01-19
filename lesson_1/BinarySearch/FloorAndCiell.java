package lesson_1.BinarySearch;

public class FloorAndCiell {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int target = 5;
        int f = floor(arr, target);
        int c = ceil(arr, target);
        System.out.println(f);
        System.out.println(c);

    }

    private static int floor(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = arr.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                ans = arr[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return ans;
    }

    private static int ceil(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = arr.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                ans = arr[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return ans;
    }
}
