package Revision.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> ans = sum(candidates, target);
        System.out.println(ans);
    }

    private static List<List<Integer>> sum(int[] candidates, int target) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        combinations(candidates, list, new ArrayList<>(), 0, target, 0);
        return list;
    }

    private static void combinations(int[] nums, ArrayList<List<Integer>> list, ArrayList<Integer> curr, int sum, int target, int start) {
        if (sum == target) {
            list.add(new ArrayList<>(curr));
            return;
        }
        if (sum > target) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            combinations(nums, list, curr, sum + nums[i], target, i);
            curr.remove(curr.size() - 1);

        }
    }
}
