package lesson_1.test;

import java.util.HashSet;

public class Longest {


    static void main(String[] args) {
        int[] nums = {2, 6, 1, 9, 4, 5, 3};

        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }

    private static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        int max = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int current = n;
                int count = 1;
                while (set.contains(current + 1)) {
                    count++;
                    current++;
                }
                max = Math.max(count, max);
            }

        }
        return max;
    }
}


