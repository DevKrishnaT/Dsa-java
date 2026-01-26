package lesson_1.BinarySearch.BsTwoDArr;

public class Median {
    public static void main(String[] args) {
        int[][] arr = {{2, 4, 9}, {3, 6, 7}, {4, 7, 10}};
        int ans = median(arr);
        System.out.println(ans);
    }

    private static int median(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < r; i++) {
            low = Math.min(low, arr[i][0]);
            high = Math.max(high, arr[i][c - 1]);

        }

        int required = (c * r) / 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int i = 0; i < r; i++) {
                count += countSmallerEqual(arr[i], mid);

            }
            if (count <= required) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return low;

    }

    private static int countSmallerEqual(int[] row, int x) {
        int l = 0, h = row.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (row[mid] <= x) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return l;
    }
}
