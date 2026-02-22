package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationalSumII {
    static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int target = 8;
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        Arrays.sort(candidates);
        combinationSum2(0, list, target, candidates, 0, new ArrayList<>());
        System.out.println(list);

    }

    private static void combinationSum2(int idx, List<List<Integer>> list, int target, int[] candidates, int sum, ArrayList<Integer> CurrentList) {
        if (sum == target) {
            list.add(new ArrayList<>(CurrentList));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (sum + candidates[i] > target) break;

            CurrentList.add(candidates[i]);
            combinationSum2(i + 1, list, target, candidates, sum + candidates[i], CurrentList);
            CurrentList.remove(CurrentList.size() - 1);


        }
    }
}
