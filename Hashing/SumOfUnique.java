package Hashing;

import java.util.HashSet;

public class SumOfUnique {
    static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        int ans = sumOfUnique(nums);
        System.out.println(ans);
    }

    private static int sumOfUnique(int[] nums) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> removed = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                if (!removed.contains(num)) {
                    removed.add(num);
                    sum -= num;
                }
            } else {
                set.add(num);
                sum += num;
            }
        }
        return sum;
    }
}
