package RecursionAgain.RealQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII {
    static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> ans = subsetsWithDup(nums);
        System.out.println(ans);
    }

    private static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        formSubsets(list, nums, new ArrayList<>(), 0);
        return list;

    }

    private static void formSubsets(List<List<Integer>> list, int[] nums, ArrayList<Integer> subset, int i) {

        list.add(new ArrayList<>(subset));


        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1]) continue;
            subset.add(nums[j]);
            formSubsets(list, nums, subset, j + 1);
            subset.remove(subset.size() - 1);
        }
    }
}
