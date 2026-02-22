package BinarySearch;


public class findKthRotation {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 4};
        int kth = findKRotationIdx(arr);
        System.out.println(kth);

    }


    private static int findKRotationIdx(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
