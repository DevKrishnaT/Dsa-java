package lesson_1.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII {
    static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        subsetsWithDup(list, nums, new ArrayList<>(), 0);
        System.out.println(list);
    }

    private static void subsetsWithDup(List<List<Integer>> list, int[] nums, ArrayList<Integer> currentList, int idx) {

        list.add(new ArrayList<>(currentList));


        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) {
                continue;
            }

            currentList.add(nums[i]);
            subsetsWithDup(list, nums, currentList, i + 1);
            currentList.remove(currentList.size() - 1);


        }
    }
}
