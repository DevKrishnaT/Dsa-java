package LeetcodeContest;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> ans = combination(nums, target);
        System.out.println(ans);
    }

    private static List<List<Integer>> combination(int[] nums, int target) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        sum(nums, list, new ArrayList<>(), target, 0, 0);
        return list;
    }

    private static void sum(int[] nums, ArrayList<List<Integer>> list, ArrayList<Integer> curr, int target, int sum, int indx) {
        if (sum == target) {
            list.add(new ArrayList<>(curr));
            return;
        }

        if (sum > target) {
            return;
        }

        for (int i = indx; i < nums.length; i++) {
            curr.add(nums[i]);
            sum(nums, list, curr, target, sum + nums[i], i);
            curr.remove(curr.size() - 1);
        }
    }
}
