package test;

import java.util.Arrays;

public class MergeSortedArray {
    static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, nums2, m, n);
        System.out.println(Arrays.toString(nums1));
    }

    private static void merge(int[] nums1, int[] nums2, int m, int n) {
        int endIndex = m + n - 1;
        m--;
        n--;

        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[endIndex--] = nums1[m--];
            } else {
                nums1[endIndex--] = nums2[n--];
            }
        }

        while (n >= 0) {
            nums1[endIndex--] = nums2[n--];
        }

    }
}
