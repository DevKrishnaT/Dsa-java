package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutive {
    static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }

    private static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int strike = 1;
                while (set.contains(current + 1)) {
                    current++;
                    strike++;
                }
                longest = Math.max(longest, strike);
            }
        }
        return longest;
    }
}
