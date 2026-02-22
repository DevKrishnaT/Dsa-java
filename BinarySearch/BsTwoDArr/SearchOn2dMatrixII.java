package BinarySearch.BsTwoDArr;

public class SearchOn2dMatrixII {
    public static void main(String[] args) {
//        int[][] arr = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int[][] arr = {{-1, 3}};
        int target = 5;
        boolean ans = searchMatrix(arr, target);
        System.out.println(ans);
    }

    private static boolean searchMatrix(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr[0].length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[i][mid] == target) {
                    return true;
                } else if (arr[i][mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

        }
        return false;
    }
}
