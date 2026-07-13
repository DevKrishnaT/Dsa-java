package Revision;

public class SearchInsertPosition {
    static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    private static int search(int[] nums, int target) {
        int i = 0;
        while (i < nums.length && target >= nums[i]) {
            if (target == nums[i]) {
                return i;
            }
            i++;
        }
        return i;
    }
}
