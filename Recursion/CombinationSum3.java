package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    static void main(String[] args) {
        int k = 3;
        int n = 7;
        List<List<Integer>> list = new ArrayList<>();
        combinationSum3(list, k, n, 1, 0, new ArrayList<>());
        System.out.println(list);
    }

    private static void combinationSum3(
            List<List<Integer>> list,
            int k,
            int target,
            int start,
            int sum,
            ArrayList<Integer> current
    ) {
        if (current.size() == k && sum == target) {
            list.add(new ArrayList<>(current));
            return;
        }

        if (current.size() > k || sum > target) {
            return;
        }

        for (int i = start; i <= 9; i++) {
            current.add(i);
            combinationSum3(list, k, target, i + 1, sum + i, current);
            current.remove(current.size() - 1);
        }
    }

}
