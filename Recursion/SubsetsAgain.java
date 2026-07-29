package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetsAgain {
    static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subsets(arr);
        System.out.println(ans);
    }

    private static List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> list = new ArrayList<>();

        int n = nums.length;

        solve(list, nums, new ArrayList<>(), n, 0);
        return list;
    }

    private static void solve(ArrayList<List<Integer>> list, int[] nums, ArrayList<Integer> subsets, int n, int i) {
        if (i == nums.length) {
            list.add(new ArrayList<>(subsets));
            return;
        }

        subsets.add(nums[i]);
        solve(list, nums, subsets, n, i + 1);

        subsets.remove(subsets.size() - 1);
        solve(list, nums, subsets, n, i + 1);

    }
}
