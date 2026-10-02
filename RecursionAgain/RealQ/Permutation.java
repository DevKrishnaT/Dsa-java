package RecursionAgain.RealQ;

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
        List<List<Integer>> list = new ArrayList<>();

        findPermutation(list, nums, new ArrayList<>(), 0);
        return list;
    }

    private static void findPermutation(List<List<Integer>> list, int[] nums, ArrayList<Integer> permutation, int i) {
        if (permutation.size() == nums.length) {
            list.add(new ArrayList<>(permutation));
            return;
        }


        for (int j = 0; j < nums.length; j++) {
            if (permutation.contains(nums[j])) {
                continue;
            }
            permutation.add(nums[j]);
            findPermutation(list, nums, permutation, j + 1);
            permutation.removeLast();


        }

    }
}
