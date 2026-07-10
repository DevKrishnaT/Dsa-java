package ArraysQ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicates {
    static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = findDup(nums);
        System.out.println(ans);
    }

    private static List<Integer> findDup(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                list.add(index + 1);
            } else {
                nums[index] *= -1;
            }
        }
        return list;
    }
}
