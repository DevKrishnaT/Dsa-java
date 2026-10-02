package RecursionAgain.RealQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PermutationII {
    static void main(String[] args) {
        int[] nums = {1, 1, 3};
        List<List<Integer>> ans = permute(nums);
        System.out.println(ans);
    }

    private static List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        findPermutation(list, nums, used, new ArrayList<>());
        return list;
    }

    private static void findPermutation(List<List<Integer>> list, int[] nums, boolean[] used, ArrayList<Integer> permutation) {
        if (permutation.size() == nums.length) {
            list.add(new ArrayList<>(permutation));
            return;
        }


        for (int j = 0; j < nums.length; j++) {
            if (used[j]) {
                continue;
            }
            if (j > 0 && nums[j] == nums[j - 1] && !used[j - 1]) {
                continue;
            }

            used[j] = true;
            permutation.add(nums[j]);
            findPermutation(list, nums, used, permutation);
            used[j] = false;
            permutation.removeLast();


        }

    }
}
