package test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Permute {
    static void main(String[] args) {
        int[] nums = {1, 2, 3};

        List<List<Integer>> ans = new ArrayList<>();
        permute(ans, nums);
        System.out.println(ans);
    }

    private static void permute(List<List<Integer>> ans, int[] nums) {
        Backtrack(ans, 0, new ArrayList<>(), nums, new boolean[nums.length]);
    }

    private static void Backtrack(List<List<Integer>> ans, int index, ArrayList<Integer> current, int[] nums, boolean[] numsBoolen) {
        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (numsBoolen[i]) continue;

            numsBoolen[i] = true;
            current.add(nums[i]);
            Backtrack(ans, index + 1, current, nums, numsBoolen);
            current.remove(current.size() - 1);
            numsBoolen[i] = false;
        }
    }


    ;
}
