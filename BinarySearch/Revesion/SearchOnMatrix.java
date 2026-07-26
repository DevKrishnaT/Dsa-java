package BinarySearch.Revesion;

public class SearchOnMatrix {
    static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 61;
        boolean ans = searchMatrix(matrix, target);
        System.out.println(ans);
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int leftInner = 0;
            int rightInner = matrix[0].length - 1;
            while (leftInner <= rightInner) {
                int midInner = leftInner + (rightInner - leftInner) / 2;
                if (matrix[mid][midInner] == target) {
                    return true;
                }

                if (matrix[mid][midInner] < target) {
                    leftInner = midInner + 1;
                } else {
                    rightInner = midInner - 1;
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
