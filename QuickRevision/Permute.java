package QuickRevision;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permute {
    static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = permute(nums);
        System.out.println(ans);
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        solve(list, new ArrayList<>(), nums, n, set);
        return list;
    }

    private static void solve(List<List<Integer>> list, ArrayList<Integer> subsets, int[] nums, int n, HashSet<Integer> set) {
        if (subsets.size() == n) {
            list.add(new ArrayList<>(subsets));
            return;
        }


        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
                subsets.add(num);
                solve(list, subsets, nums, n, set);
                set.remove(num);
                subsets.remove(subsets.size() - 1);
            }
        }
    }
}
