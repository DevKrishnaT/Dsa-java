package ArraysQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parcal {
    static void main(String[] args) {
        int nums = 5;
        List<List<Integer>> ans = genrate(nums);
        System.out.println(ans);
    }

    private static List<List<Integer>> genrate(int nums) {
        List<List<Integer>> list = new ArrayList<>();

        if (nums == 0) return list;

        list.add(Arrays.asList(1));

        for (int i = 1; i < nums; i++) {
            List<Integer> prev = list.get(i - 1);
            List<Integer> curr = new ArrayList<>();

            curr.add(1);
            for (int j = 1; j < prev.size(); j++) {
                curr.add(prev.get(j - 1) + prev.get(j));

            }
            curr.add(1);
            list.add(curr);

        }

        return list;

    }
}
