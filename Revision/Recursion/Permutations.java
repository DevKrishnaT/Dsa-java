package Revision.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = permute(nums);
        System.out.println(ans);
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] booleans = new boolean[nums.length];
        sum(list, new ArrayList<>(), nums, booleans);
        return list;
    }

    private static void sum(List<List<Integer>> list, ArrayList<Integer> curr, int[] nums, boolean[] booleans) {
        if (curr.size() == nums.length) {
            list.add(new ArrayList<>(curr));
            return;
        }


        for (int i = 0; i < nums.length; i++) {
            if (!booleans[i]) {
                booleans[i] = true;
                curr.add(nums[i]);
                sum(list, curr, nums, booleans);
                curr.remove(curr.size() - 1);
                booleans[i] = false;
            }
        }
    }
}
