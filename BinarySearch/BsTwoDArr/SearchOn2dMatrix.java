package BinarySearch.BsTwoDArr;

public class SearchOn2dMatrix {
    public static void main(String[] args) {
//        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int[][] arr = {{1}};
        int target = 2;
        boolean ans = searchMatrix(arr, target);
        System.out.println(ans);
    }

    private static boolean searchMatrix(int[][] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int leftInner = 0;
            int rightInner = arr[0].length - 1;
            while (leftInner <= rightInner) {
                int midInner = leftInner + (rightInner - leftInner) / 2;
                if (arr[mid][midInner] == target) {
                    return true;
                } else if (arr[mid][midInner] > target) {
                    rightInner = midInner - 1;
                } else {
                    leftInner = midInner + 1;
                }
            }

            if (leftInner == 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
