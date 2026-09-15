package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CutTheSticks {
    static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 4, 4, 2, 2, 8));
        List<Integer> ans = cutTheSticks(nums);
        System.out.println(ans);
    }

    private static List<Integer> cutTheSticks(List<Integer> nums) {
        nums.sort((a, b) -> a - b);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {

            if (i == 0 || !Objects.equals(nums.get(i), nums.get(i - 1))) {
                list.add(nums.size() - i);
            }
        }

        return list;

    }
}
