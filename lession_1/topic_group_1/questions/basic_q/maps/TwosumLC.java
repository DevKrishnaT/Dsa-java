package lession_1.topic_group_1.questions.basic_q.maps;

import java.util.HashMap;

public class TwosumLC {
    public static int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (hash.containsKey(target - nums[i])) {

            }
            hash.put(nums[i], null);
        }
        return index;
    }

    ;

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(arr, target));
    }
}
