package questions;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = permute(arr);
        System.out.println(ans);
    }

    private static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] contain = new boolean[arr.length];

        solve(ans, arr, new ArrayList<>(), contain);
        return ans;
    }

    private static void solve(List<List<Integer>> ans, int[] nums, ArrayList<Integer> curr, boolean[] contain) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
        }

        for (int i = 0; i < nums.length; i++) {
            if (!contain[i]) {
                contain[i] = true;
                curr.add(nums[i]);
                solve(ans, nums, curr, contain);
                curr.remove(curr.size() - 1);
                contain[i] = false;

            }
        }
    }
}
