package Recursion;

public class SubsequenceQualk {
    static void main(String[] args) {
        int target = 9;
        int[] nums = {3, 5, 6, 7};
        int ans = subSequence(target, nums, 0, 0);
        boolean yesorno = subSequence2(0, target, nums, 0);
    }

    private static boolean subSequence2(int idx, int target, int[] nums, int currsum) {
        if (currsum > target) return false;
        if (idx == nums.length) {
            if (currsum == target) return true;

        }

        return subSequence2(idx + 1, target, nums, currsum + nums[idx]) ||
                subSequence2(idx + 1, target, nums, currsum);
    }

    private static int subSequence(int target, int[] nums, int currSum, int idx) {
        if (idx == nums.length) {
            if (currSum == target) return 1;
            return 0;
        }


        int take = subSequence(target, nums, currSum + nums[idx], idx + 1);

        int notTake = subSequence(target, nums, currSum, idx + 1);

        return take + notTake;
    }


}
