package RecursionAgain.RealQ;

import java.util.ArrayList;
import java.util.List;

public class subset {
    static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> ans = Subsets(nums);
    }

    private static List<List<Integer>> Subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        formSubsets(list, nums, new ArrayList<>(), 0);

        return list;
    }

    private static void formSubsets(List<List<Integer>> list, int[] nums, ArrayList<Integer> subset, int i) {
        if (i == nums.length) {
            list.add(new ArrayList<>(subset));
            return;
        }


        subset.add(nums[i]);
        formSubsets(list, nums, subset, i + 1);
        subset.remove(subset.size() - 1);
        formSubsets(list, nums, subset, i + 1);
    }
}
