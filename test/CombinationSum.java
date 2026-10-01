package test;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        int target = 8;
        List<List<Integer>> ans = combinationSum(nums, target);
        System.out.println(ans);
    }

    private static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        combinations(nums, list, new ArrayList<>(), target, 0, 0);
        return list;
    }

    private static void combinations(int[] nums, List<List<Integer>> list, ArrayList<Integer> candidates, int target, int sum, int i) {
        if (i > nums.length - 1 || sum > target) {
            return;

        }

        if (sum == target) {
            list.add(new ArrayList<>(candidates));
            return;
        }


        sum += nums[i];
        candidates.add(nums[i]);
        combinations(nums, list, candidates, target, sum, i);
        sum -= nums[i];
        candidates.removeLast();
        combinations(nums, list, candidates, target, sum, i + 1);
    }
}
