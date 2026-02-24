package Heap.Questions;

import java.util.PriorityQueue;

public class KthSmallestInMatrix {
    static void main(String[] args) {
        int[][] matrix = {{1, 5, 6, 9}, {10, 11, 13, 15}, {12, 13, 15}};
        int k = 8;
        int ans = kthSmallest(matrix, k);
        System.out.println(ans);

    }

    private static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countLessEqual(matrix, mid);
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;


    }

    private static int countLessEqual(int[][] matrix, int mid) {
        int n = matrix.length;
        int row = n - 1;
        int col = 0;
        int count = 0;
        while (row >= 0 && col < n) {
            if (matrix[row][col] <= mid) {
                count += row + 1;
                col++;
            } else {
                row--;
            }
        }
        return count;
    }

    private static int kthSmallestWithSpace(int[][] matrix, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int[] nums : matrix) {
            for (int num : nums) {
                heap.add(num);
            }
        }

        while (k - 1 > 0) {
            heap.poll();
            k--;
        }
        return heap.poll();
    }
}
