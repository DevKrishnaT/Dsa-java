package Revision.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = subsets(nums);
        System.out.println(ans);
    }

    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        find(list, nums, new ArrayList<>(), 0);
        return list;
    }

    private static void find(List<List<Integer>> list, int[] nums, ArrayList<Integer> curr, int i) {
        if (i == nums.length) {
            list.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);
        find(list, nums, curr, i + 1);

        curr.remove(curr.size() - 1);
        find(list, nums, curr, i + 1);
    }
}
