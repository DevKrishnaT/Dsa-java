package twoPointer;

import java.util.Arrays;

public class Merge {
    static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int point1 = 0;
        int point2 = 0;
        int i = 0;

        int[] ans = new int[m + n];
        while (point1 < m && point2 < n) {
            if (nums1[point1] < nums2[point2]) {
                ans[i++] = nums1[point1++];
            } else {
                ans[i++] = nums2[point2++];
            }

        }

        while (point1 < m) {
            ans[i++] = nums1[point1++];
        }

        while (point2 < n) {
            ans[i++] = nums2[point2++];
        }


        for (int j = 0; j < nums1.length; j++) {
            nums1[j] = ans[j];
        }
        System.out.println(Arrays.toString(nums1));


    }
}
