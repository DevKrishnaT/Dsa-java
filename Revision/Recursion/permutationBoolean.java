package Revision.Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class permutationBoolean {
    static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = permute(nums);
        System.out.println(ans);
    }

    private static List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        boolean[] isPresent = new boolean[nums.length];

        solve(nums, list, isPresent, new ArrayList<>());

        return list;
    }

    private static void solve(int[] nums, ArrayList<List<Integer>> list, boolean[] isPresent, ArrayList<Integer> sub) {
        if (nums.length == sub.size()) {
            list.add(new ArrayList<>(sub));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!isPresent[i]) {
                isPresent[i] = true;
                sub.add(nums[i]);
                solve(nums, list, isPresent, sub);
                sub.remove(sub.size() - 1);
                isPresent[i] = false;
            }
        }

    }
}
