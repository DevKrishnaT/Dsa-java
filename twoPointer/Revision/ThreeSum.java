package twoPointer.Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = find3Sum(nums);
        System.out.println(ans);
    }

    private static List<List<Integer>> find3Sum(int[] nums) {
        Arrays.sort(nums);

        ArrayList<List<Integer>> list = new ArrayList<>();

        for (int first = 0; first < nums.length; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) continue;

            int sec = first + 1;
            int third = nums.length - 1;
            while (sec < third) {
                int total = nums[first];
                total += nums[sec];
                total += nums[third];


                if (total == 0) {
                    ArrayList<Integer> subList = new ArrayList<>(Arrays.asList(nums[first], nums[sec], nums[third]));

                    if (!list.contains(subList)) {
                        list.add(subList);
                    }

                    sec++;
                    third--;
                    while (sec < third && nums[sec] == nums[sec - 1]) sec++;
                    while (sec < third && nums[third] == nums[third + 1]) third--;
                } else if (total < 0) {
                    sec++;
                } else {
                    third--;
                }
            }
        }
        return list;
    }
}
