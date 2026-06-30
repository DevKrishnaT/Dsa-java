package Revision.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = subset(nums);
        System.out.println(ans);
    }

    private static List<List<Integer>> subset(int[] nums) {

        ArrayList<List<Integer>> list = new ArrayList<>();
        int n = nums.length;

        solve(nums, list, new ArrayList<>(), n, 0);

        return list;
    }

    private static void solve(int[] nums, ArrayList<List<Integer>> list, ArrayList<Integer> sub, int n, int i) {
        if (i == nums.length) {
            list.add(new ArrayList<>(sub));
            return;
        }


        sub.add(nums[i]);
        solve(nums, list, sub, n, i + 1);

        sub.remove(sub.size() - 1);
        solve(nums, list, sub, n, i + 1);


    }
}
