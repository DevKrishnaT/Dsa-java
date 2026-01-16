package lesson_1.ArraysQ;

import java.util.*;

public class MajorityElemnt {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        List<Integer> ans = majorityElement(nums);
        System.out.println(ans);
    }

    private static List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        int n = nums.length;
        int Majority = n / 3;


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }
        int i = 0;
        for (Map.Entry<Integer, Integer> p : map.entrySet()) {
            int frq = p.getValue();
            if (frq > Majority) {

                list.add(p.getKey());
            }
        }
        return list;
    }
}
