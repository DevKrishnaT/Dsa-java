package RandomeQtest;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = findSubsets(nums);
        System.out.println(ans);

    }

    private static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subsetsmaker(list, nums, 0, new ArrayList<>());
        return list;
    }

    private static void subsetsmaker(List<List<Integer>> list, int[] nums, int i, ArrayList<Integer> ans) {
        if (i >= nums.length) {
            list.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[i]);
        subsetsmaker(list, nums, i + 1, ans);
        ans.remove(ans.size() - 1);
        subsetsmaker(list, nums, i + 1, ans);

    }


}
