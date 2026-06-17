package ArraysQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityII {
    static void main() {
        int[] nums = {1, 2};
        List<Integer> ans = calculate(nums);
        System.out.println(ans);
    }

    private static List<Integer> calculate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length / 3;

        for (int x : nums) {

            map.put(x, map.getOrDefault(x, 0) + 1);
            if (map.get(x) > n) {
                if (!list.contains(x)) {
                    list.add(x);
                }
            }

        }
        return list;
    }
}
