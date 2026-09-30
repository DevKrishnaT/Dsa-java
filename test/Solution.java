package test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> ans = subsetsWithDup(nums);
        System.out.println(ans);
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        formSubsets(nums, list, new ArrayList<>(), 0);
        return list;

    }

    public static void formSubsets(int[] nums, List<List<Integer>> list, List<Integer> subsets, int i) {

        list.add(new ArrayList<>(subsets));

        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1]) continue;
            subsets.add(nums[j]);
            formSubsets(nums, list, subsets, j + 1);
            subsets.remove(subsets.size() - 1);
        }

    }
}

