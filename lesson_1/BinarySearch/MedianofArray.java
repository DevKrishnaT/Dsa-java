package lesson_1.BinarySearch;

public class MedianofArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double ans = findMedianSortedArrays(nums1, nums2);
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);

        int m = nums1.length;
        int n = nums2.length;
        int left = 0;
        int right = m;
        while (left <= right) {
            int i = (left + right) / 2;
            int j = (m + n + 1) / 2 - i;

            int leftA = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int rightA = (i == m) ? Integer.MAX_VALUE : nums1[i];

            int leftB = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];

            int rightB = (j == n) ? Integer.MAX_VALUE : nums2[j];


            if (leftA <= rightB && rightA >= leftB) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0;
                } else {
                    return Math.max(leftA, leftB);
                }
            } else if (leftA > rightB) {
                right = i - 1;

            } else {
                left = i + 1;
            }
        }
        return 0.0;
    }
}
