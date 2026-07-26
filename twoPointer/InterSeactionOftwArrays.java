package twoPointer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class InterSeactionOftwArrays {
    static void main(String[] args) {
        int[] nums1 = {4, 9, 5}, nums2 = {9, 4, 9, 8, 4};
        int[] ans = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> list = new ArrayList<>();

        int first = 0;
        int sec = 0;
        while (first < nums1.length && sec < nums2.length) {
            if (nums1[first] == nums2[sec]) {
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[first]) {
                    list.add(nums1[first]);
                }
                sec++;
                first++;
            } else if (nums1[first] > nums2[sec]) {
                sec++;
            } else {
                first++;
            }
        }
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
