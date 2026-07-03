package Revision.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    static void main(String[] args) {
        int[] combinations = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> sum = solveSum(combinations, target);
        System.out.println(sum);
    }

    private static List<List<Integer>> solveSum(int[] combinations, int target) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        solve(combinations, list, target, 0, new ArrayList<>(), 0);
        return list;
    }

    private static void solve(int[] combinations, ArrayList<List<Integer>> list, int target, int sum, ArrayList<Integer> curr, int idx) {
        if (sum == target) {
            list.add(new ArrayList<>(curr));
            return;
        }
        if (sum > target) {
            return;
        }

        for (int i = idx; i < combinations.length; i++) {
            curr.add(combinations[i]);
            solve(combinations, list, target, sum + combinations[i], curr, i);
            curr.remove(curr.size() - 1);

        }
    }
}
