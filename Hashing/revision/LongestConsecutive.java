package Hashing.revision;

import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutive {
    static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }

    private static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        int longest = Integer.MIN_VALUE;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int strike = 1;
                while (set.contains(current + 1)) {
                    strike++;
                    current++;
                }
                longest = Math.max(longest, strike);
            }
        }

        return longest == Integer.MIN_VALUE ? 0 : longest;
    }
}
