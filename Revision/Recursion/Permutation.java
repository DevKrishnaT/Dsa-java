package Revision.Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permutation {
    static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = permute(nums);
        System.out.println(ans);
    }

    private static List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        solve(nums, list, set, new ArrayList<>());

        return list;
    }

    private static void solve(int[] nums, ArrayList<List<Integer>> list, HashSet<Integer> set, ArrayList<Integer> sub) {

        if (sub.size() == nums.length) {
            list.add(new ArrayList<>(sub));
            return;
        }


        for (int num : nums) {
            if (!set.contains(num)) {
                sub.add(num);
                set.add(num);
                solve(nums, list, set, sub);
                sub.remove(sub.size() - 1);
                set.remove(num);
                ;
            }
        }


    }
}
