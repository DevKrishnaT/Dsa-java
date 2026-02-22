package BinarySearch;

public class upperBond {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 10, 11, 11, 25};
        int target = 11;
        int UB = upperBound(arr, target);
        System.out.println(UB);
    }

    private static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = arr.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                ans = mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;

    }
}
