package BinarySearch.BsTwoDArr;

public class SearchOn2dMatrixIIOptimal {
    public static void main(String[] args) {
//        int[][] arr = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int[][] arr = {{-1, 3}};
        int target = -1;

        boolean ans = find(arr, target);
        System.out.println(ans);
    }

    private static boolean find(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return true;
            } else if (arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;

    }
}
