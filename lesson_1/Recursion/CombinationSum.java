package lesson_1.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        combinationSum(list, candidates, new ArrayList<>(), target, 0, 0);
        System.out.println(list);
    }

    private static void combinationSum(List<List<Integer>> list, int[] candidates, ArrayList<Integer> current, int target, int sum, int idx) {
        if (sum == target) {
            list.add(new ArrayList<>(current));
            return;
        }


        if (sum > target || idx == candidates.length) {

            return;
        }
        current.add(candidates[idx]);
        combinationSum(list, candidates, current, target, candidates[idx] + sum, idx);
        current.remove(current.size() - 1);


        combinationSum(list, candidates, current, target, sum, idx + 1);
    }

}
