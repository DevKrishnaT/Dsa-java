package BinarySearch;

public class MinInrotated {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int min = findMin(arr);
        System.out.println(min);
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            min = Math.min(min, arr[mid]);

            if (arr[left] < arr[mid] && arr[mid] > arr[right]) {
                left++;
                right--;
            } else if (arr[left] > arr[mid] && arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return min;
    }
}
