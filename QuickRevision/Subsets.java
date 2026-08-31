package QuickRevision;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = subsets(nums);
        System.out.println(ans);
    }

    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        find(ans, new ArrayList<>(), nums, n, 0);
        return ans;
    }

    private static void find(List<List<Integer>> ans, ArrayList<Integer> curr, int[] nums, int n, int i) {
        if (i == n) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);
        find(ans, curr, nums, n, i + 1);

        curr.remove(curr.size() - 1);
        find(ans, curr, nums, n, i + 1);
    }
}
