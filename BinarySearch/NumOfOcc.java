package BinarySearch;

public class NumOfOcc {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4};
        int target = 2;
        int first = countFreqLeft(arr, target);
        int last = countFreq(arr, target);
        int freq = -1;

        if (first == 0) {
            freq = 0;
        } else {
            freq = first + last - 1;
        }

        System.out.println(freq);
    }

    private static int countFreqLeft(int[] arr, int target) {
        int result = -1;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    private static int countFreq(int[] arr, int target) {
        int result = -1;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}
