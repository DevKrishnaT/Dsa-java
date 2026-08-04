package LeetCodeDaily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElement {
    static void main(String[] args) {
        int[] nums = {1, 197};
        List<Integer> ans = findMissingElements(nums);
        System.out.println(ans);
    }

    private static List<Integer> findMissingElements(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int low = nums[0];

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if (curr - low > 1) {
                addMissing(low, curr, list);

            }
            low = curr;
        }
        return list;
    }

    private static void addMissing(int low, int curr, ArrayList<Integer> list) {
        for (int i = low + 1; i < curr; i++) {
            list.add(i);
        }
    }
}
